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
 * <p>Java class for acknowledgeReliablePdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acknowledgeReliablePdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}simulationManagementWithReliabilityFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="acknowledgeFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="responseFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acknowledgeReliablePdu", propOrder = {
    "acknowledgeFlag",
    "requestID",
    "responseFlag"
})
public class AcknowledgeReliablePdu
    extends SimulationManagementWithReliabilityFamilyPdu
{

    protected int acknowledgeFlag;
    protected long requestID;
    protected int responseFlag;

    /**
     * Gets the value of the acknowledgeFlag property.
     * 
     */
    public int getAcknowledgeFlag() {
        return acknowledgeFlag;
    }

    /**
     * Sets the value of the acknowledgeFlag property.
     * 
     */
    public void setAcknowledgeFlag(int value) {
        this.acknowledgeFlag = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     */
    public long getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     */
    public void setRequestID(long value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the responseFlag property.
     * 
     */
    public int getResponseFlag() {
        return responseFlag;
    }

    /**
     * Sets the value of the responseFlag property.
     * 
     */
    public void setResponseFlag(int value) {
        this.responseFlag = value;
    }

}
