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
 * <p>Java class for oneByteChunk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneByteChunk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "oneByteChunk", propOrder = {
    "otherParameters"
})
public class OneByteChunk {

    protected byte[] otherParameters;

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
