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
 * <p>Java class for modulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modulationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spreadSpectrum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modulationType", propOrder = {
    "detail",
    "major",
    "spreadSpectrum",
    "system"
})
public class ModulationType {

    protected int detail;
    protected int major;
    protected int spreadSpectrum;
    protected int system;

    /**
     * Gets the value of the detail property.
     * 
     */
    public int getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     */
    public void setDetail(int value) {
        this.detail = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Gets the value of the spreadSpectrum property.
     * 
     */
    public int getSpreadSpectrum() {
        return spreadSpectrum;
    }

    /**
     * Sets the value of the spreadSpectrum property.
     * 
     */
    public void setSpreadSpectrum(int value) {
        this.spreadSpectrum = value;
    }

    /**
     * Gets the value of the system property.
     * 
     */
    public int getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     */
    public void setSystem(int value) {
        this.system = value;
    }

}
