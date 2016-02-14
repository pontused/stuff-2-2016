package service.booking;

import com.bankservice.BankService_Service;
import com.booking.Booking;



import service.booking.com.itinerary.Itinerary;
import service.booking.com.itinerary.ItineraryNotAvailable_Exception;
import service.booking.com.itinerary.ItineraryService_Service;
import service.booking.com.itinerary.ItineraryService;
import service.booking.com.itinerary.Flight;

import service.booking.com.flight.FlightService_Service;
import service.booking.com.flight.FlightService;

import service.booking.com.bank.BankServiceImplService;
import service.booking.com.bank.BankServiceImpl;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Pontus on 2016-02-14.
 */
@WebService
public class Booking_impl  implements Booking   {

    private final serialNrGen sng;
    private final HashMap<Integer,Transaction> transamctionMap;
    public Booking_impl(){
        sng = new serialNrGen();
        transamctionMap = new HashMap<Integer,Transaction>();
    }

    @Override
    public int bookTicket(String creditcard, int itineraryid) {
        System.out.println("bookTicket");
        //throws an exception if the payment method is not valid
        int ttid = -1;
        if(creditValid(creditcard)){

            Transaction tt = new Transaction(sng.get(), bookItinerary(itineraryid), creditcard);
            transamctionMap.put(tt.getID(),tt);
            ttid =  tt.getID();
            //returns the transaction id or -1 if payment is invalid.
        }

        return ttid;
    }

    public Itinerary bookItinerary(int itineraryid){
        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itineraryServicePort = itineraryService.getItineraryPort();

        List<Itinerary> itli = itineraryServicePort.getItineraryByID(itineraryid);
        System.out.println("Number of itinerarys found:" + itli.size() + " : " + itli.get(0).getFlightList().size());


        Itinerary finalit = itli.get(0);
        for (Itinerary it: itli) {
            finalit = it;
        }



        //lock seats on all flights
        for (Flight f:finalit.getFlightList()) {
            FlightService port = (new FlightService_Service()).getFlightPort();
            try {
                port.lockBookSeat(f.getFlightID());
            }catch(Exception e){

            }
        }

        //return the itinerary
        return finalit;
    }

    public boolean creditValid(String creditcard){
        //Validate the cradit card-----------------------------------------------------------------------
        BankServiceImpl port = (new BankServiceImplService().getBankServiceImplPort());
        boolean b = false;
        try{
            b = port.checkAccount(Integer.parseInt(creditcard));
        }catch(Exception e){
            System.out.println("cedit  invalid");
        }
        return b;
    }

    @Override
    public String getTicket(int transacionid) {
        String ticket = "No Ticket";
        Transaction tt = transamctionMap.get(transacionid);
        if(creditValid(tt.getCreditCard())){
            ticket = tt.charge();
        }
        //throws an exception if payment for transactionID fails
        //returns the ticket
        return ticket;
    }

    private float checkAvailability(int id) throws ItineraryNotAvailable_Exception {
        ItineraryService_Service itineraryService = new ItineraryService_Service();
        ItineraryService itineraryServicePort = itineraryService.getItineraryPort();

        return itineraryServicePort.checkAvailability(id);
    }

    private class serialNrGen{
        int sn;
        public serialNrGen(){
            this.sn = 0;
        }
        public int get(){
            return this.sn++;
        }
    }

    private class Transaction{
        private final int id;
        private final Itinerary itinerary;
        private String creditcard;
        public Transaction(int id, Itinerary itinerary, String creditcard){
            this.id = id;
            this.itinerary = itinerary;
            this.creditcard = creditcard;
        }

        public int getID(){
            return this.id;
        }
        public Itinerary getItinerary(){
            return this.itinerary;
        }
        public String getCreditCard(){
            return this.creditcard;
        }

        public String charge(){
            float price = 0;
            String ticket = "No Ticket";
            try{
                price = checkAvailability(this.itinerary.getId());

                BankServiceImpl port = (new BankServiceImplService().getBankServiceImplPort());

                if(port.withdraw(Integer.parseInt(this.creditcard),price)){
                    ticket = "Ticket: ";
                    for (Flight f:itinerary.getFlightList()) {
                        System.out.print("tick");
                        ticket = ticket + " " + f.getFlightID();
                    }
                }



            }catch(Exception e){
                System.out.println("Flight no longer available");
            }


            return ticket;
        }
    }

}
