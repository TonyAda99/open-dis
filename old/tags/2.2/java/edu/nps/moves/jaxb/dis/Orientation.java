//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.31 at 02:05:02 PM PST 
//


package edu.nps.moves.jaxb.dis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orientation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orientation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phi" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="psi" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orientation", propOrder = {
    "phi",
    "psi",
    "theta"
})
public class Orientation {

    protected float phi;
    protected float psi;
    protected float theta;

    /**
     * Gets the value of the phi property.
     * 
     */
    public float getPhi() {
        return phi;
    }

    /**
     * Sets the value of the phi property.
     * 
     */
    public void setPhi(float value) {
        this.phi = value;
    }

    /**
     * Gets the value of the psi property.
     * 
     */
    public float getPsi() {
        return psi;
    }

    /**
     * Sets the value of the psi property.
     * 
     */
    public void setPsi(float value) {
        this.psi = value;
    }

    /**
     * Gets the value of the theta property.
     * 
     */
    public float getTheta() {
        return theta;
    }

    /**
     * Sets the value of the theta property.
     * 
     */
    public void setTheta(float value) {
        this.theta = value;
    }

}
