//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.29 at 04:48:38 PM PST 
//


package edu.nps.moves.jaxb.dis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aggregateID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aggregateID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggregateID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggregateID", propOrder = {
    "aggregateID",
    "application",
    "site"
})
public class AggregateID {

    protected int aggregateID;
    protected int application;
    protected int site;

    /**
     * Gets the value of the aggregateID property.
     * 
     */
    public int getAggregateID() {
        return aggregateID;
    }

    /**
     * Sets the value of the aggregateID property.
     * 
     */
    public void setAggregateID(int value) {
        this.aggregateID = value;
    }

    /**
     * Gets the value of the application property.
     * 
     */
    public int getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     */
    public void setApplication(int value) {
        this.application = value;
    }

    /**
     * Gets the value of the site property.
     * 
     */
    public int getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     */
    public void setSite(int value) {
        this.site = value;
    }

}
