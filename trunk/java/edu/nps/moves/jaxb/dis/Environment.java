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
 * <p>Java class for environment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="environment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="environmentType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="geometry" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="padding1" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="padding2" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environment", propOrder = {
    "environmentType",
    "geometry",
    "index",
    "length",
    "padding1",
    "padding2"
})
public class Environment {

    protected long environmentType;
    protected short geometry;
    protected short index;
    protected short length;
    protected short padding1;
    protected short padding2;

    /**
     * Gets the value of the environmentType property.
     * 
     */
    public long getEnvironmentType() {
        return environmentType;
    }

    /**
     * Sets the value of the environmentType property.
     * 
     */
    public void setEnvironmentType(long value) {
        this.environmentType = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     */
    public short getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     */
    public void setGeometry(short value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(short value) {
        this.index = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public short getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(short value) {
        this.length = value;
    }

    /**
     * Gets the value of the padding1 property.
     * 
     */
    public short getPadding1() {
        return padding1;
    }

    /**
     * Sets the value of the padding1 property.
     * 
     */
    public void setPadding1(short value) {
        this.padding1 = value;
    }

    /**
     * Gets the value of the padding2 property.
     * 
     */
    public short getPadding2() {
        return padding2;
    }

    /**
     * Sets the value of the padding2 property.
     * 
     */
    public void setPadding2(short value) {
        this.padding2 = value;
    }

}
