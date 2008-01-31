//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.31 at 02:05:02 PM PST 
//


package edu.nps.moves.jaxb.dis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventReportReliablePdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventReportReliablePdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}simulationManagementWithReliabilityFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fixedDatumRecords" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfFixedDatumRecords" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numberOfVariableDatumRecords" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pad1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="variableDatumRecords" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventReportReliablePdu", propOrder = {
    "eventType",
    "fixedDatumRecords",
    "numberOfFixedDatumRecords",
    "numberOfVariableDatumRecords",
    "pad1",
    "variableDatumRecords"
})
public class EventReportReliablePdu
    extends SimulationManagementWithReliabilityFamilyPdu
{

    protected int eventType;
    @XmlElement(nillable = true)
    protected List<Object> fixedDatumRecords;
    protected long numberOfFixedDatumRecords;
    protected long numberOfVariableDatumRecords;
    protected long pad1;
    @XmlElement(nillable = true)
    protected List<Object> variableDatumRecords;

    /**
     * Gets the value of the eventType property.
     * 
     */
    public int getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     */
    public void setEventType(int value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the fixedDatumRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedDatumRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedDatumRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getFixedDatumRecords() {
        if (fixedDatumRecords == null) {
            fixedDatumRecords = new ArrayList<Object>();
        }
        return this.fixedDatumRecords;
    }

    /**
     * Gets the value of the numberOfFixedDatumRecords property.
     * 
     */
    public long getNumberOfFixedDatumRecords() {
        return numberOfFixedDatumRecords;
    }

    /**
     * Sets the value of the numberOfFixedDatumRecords property.
     * 
     */
    public void setNumberOfFixedDatumRecords(long value) {
        this.numberOfFixedDatumRecords = value;
    }

    /**
     * Gets the value of the numberOfVariableDatumRecords property.
     * 
     */
    public long getNumberOfVariableDatumRecords() {
        return numberOfVariableDatumRecords;
    }

    /**
     * Sets the value of the numberOfVariableDatumRecords property.
     * 
     */
    public void setNumberOfVariableDatumRecords(long value) {
        this.numberOfVariableDatumRecords = value;
    }

    /**
     * Gets the value of the pad1 property.
     * 
     */
    public long getPad1() {
        return pad1;
    }

    /**
     * Sets the value of the pad1 property.
     * 
     */
    public void setPad1(long value) {
        this.pad1 = value;
    }

    /**
     * Gets the value of the variableDatumRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableDatumRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableDatumRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getVariableDatumRecords() {
        if (variableDatumRecords == null) {
            variableDatumRecords = new ArrayList<Object>();
        }
        return this.variableDatumRecords;
    }

}
