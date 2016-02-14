
package com.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookTicket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditcard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itineraryid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTicket", propOrder = {
    "creditcard",
    "itineraryid"
})
public class BookTicket {

    @XmlElement(required = true)
    protected String creditcard;
    protected int itineraryid;

    /**
     * Gets the value of the creditcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditcard() {
        return creditcard;
    }

    /**
     * Sets the value of the creditcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditcard(String value) {
        this.creditcard = value;
    }

    /**
     * Gets the value of the itineraryid property.
     * 
     */
    public int getItineraryid() {
        return itineraryid;
    }

    /**
     * Sets the value of the itineraryid property.
     * 
     */
    public void setItineraryid(int value) {
        this.itineraryid = value;
    }

}
