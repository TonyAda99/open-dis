//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.12 at 10:35:49 PM PST 
//


package edu.nps.moves.jaxb.dis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electronicEmissionSystemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electronicEmissionSystemData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beamDataRecords" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emissionsPadding2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="emitterSystem" type="{}emitterSystem" minOccurs="0"/>
 *         &lt;element name="location" type="{}vector3Float" minOccurs="0"/>
 *         &lt;element name="numberOfBeams" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="systemDataLength" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electronicEmissionSystemData", propOrder = {
    "beamDataRecords",
    "emissionsPadding2",
    "emitterSystem",
    "location",
    "numberOfBeams",
    "systemDataLength"
})
public class ElectronicEmissionSystemData {

    @XmlElement(nillable = true)
    protected List<Object> beamDataRecords;
    protected int emissionsPadding2;
    protected EmitterSystem emitterSystem;
    protected Vector3Float location;
    protected short numberOfBeams;
    protected short systemDataLength;

    /**
     * Gets the value of the beamDataRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beamDataRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeamDataRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBeamDataRecords() {
        if (beamDataRecords == null) {
            beamDataRecords = new ArrayList<Object>();
        }
        return this.beamDataRecords;
    }

    /**
     * Gets the value of the emissionsPadding2 property.
     * 
     */
    public int getEmissionsPadding2() {
        return emissionsPadding2;
    }

    /**
     * Sets the value of the emissionsPadding2 property.
     * 
     */
    public void setEmissionsPadding2(int value) {
        this.emissionsPadding2 = value;
    }

    /**
     * Gets the value of the emitterSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EmitterSystem }
     *     
     */
    public EmitterSystem getEmitterSystem() {
        return emitterSystem;
    }

    /**
     * Sets the value of the emitterSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmitterSystem }
     *     
     */
    public void setEmitterSystem(EmitterSystem value) {
        this.emitterSystem = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Float }
     *     
     */
    public Vector3Float getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Float }
     *     
     */
    public void setLocation(Vector3Float value) {
        this.location = value;
    }

    /**
     * Gets the value of the numberOfBeams property.
     * 
     */
    public short getNumberOfBeams() {
        return numberOfBeams;
    }

    /**
     * Sets the value of the numberOfBeams property.
     * 
     */
    public void setNumberOfBeams(short value) {
        this.numberOfBeams = value;
    }

    /**
     * Gets the value of the systemDataLength property.
     * 
     */
    public short getSystemDataLength() {
        return systemDataLength;
    }

    /**
     * Sets the value of the systemDataLength property.
     * 
     */
    public void setSystemDataLength(short value) {
        this.systemDataLength = value;
    }

}