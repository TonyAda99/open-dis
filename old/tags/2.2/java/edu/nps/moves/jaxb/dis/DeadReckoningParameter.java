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
 * <p>Java class for deadReckoningParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deadReckoningParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deadReckoningAlgorithm" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="entityAngularVelocity" type="{}vector3Float" minOccurs="0"/>
 *         &lt;element name="entityLinearAcceleration" type="{}vector3Float" minOccurs="0"/>
 *         &lt;element name="otherParameters" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deadReckoningParameter", propOrder = {
    "deadReckoningAlgorithm",
    "entityAngularVelocity",
    "entityLinearAcceleration",
    "otherParameters"
})
public class DeadReckoningParameter {

    protected short deadReckoningAlgorithm;
    protected Vector3Float entityAngularVelocity;
    protected Vector3Float entityLinearAcceleration;
    protected byte[] otherParameters;

    /**
     * Gets the value of the deadReckoningAlgorithm property.
     * 
     */
    public short getDeadReckoningAlgorithm() {
        return deadReckoningAlgorithm;
    }

    /**
     * Sets the value of the deadReckoningAlgorithm property.
     * 
     */
    public void setDeadReckoningAlgorithm(short value) {
        this.deadReckoningAlgorithm = value;
    }

    /**
     * Gets the value of the entityAngularVelocity property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Float }
     *     
     */
    public Vector3Float getEntityAngularVelocity() {
        return entityAngularVelocity;
    }

    /**
     * Sets the value of the entityAngularVelocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Float }
     *     
     */
    public void setEntityAngularVelocity(Vector3Float value) {
        this.entityAngularVelocity = value;
    }

    /**
     * Gets the value of the entityLinearAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Float }
     *     
     */
    public Vector3Float getEntityLinearAcceleration() {
        return entityLinearAcceleration;
    }

    /**
     * Sets the value of the entityLinearAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Float }
     *     
     */
    public void setEntityLinearAcceleration(Vector3Float value) {
        this.entityLinearAcceleration = value;
    }

    /**
     * Gets the value of the otherParameters property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOtherParameters() {
        return otherParameters;
    }

    /**
     * Sets the value of the otherParameters property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOtherParameters(byte[] value) {
        this.otherParameters = ((byte[]) value);
    }

}
