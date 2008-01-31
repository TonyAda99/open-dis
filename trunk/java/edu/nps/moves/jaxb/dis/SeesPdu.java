//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.01.29 at 04:48:38 PM PST 
//


package edu.nps.moves.jaxb.dis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seesPdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seesPdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}distributedEmissionsFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="acousticSignatureRepresentationIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="infraredSignatureRepresentationIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfPropulsionSystems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfVectoringNozzleSystems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orginatingEntityID" type="{}entityID" minOccurs="0"/>
 *         &lt;element name="propulsionSystemData" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="radarCrossSectionSignatureRepresentationIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vectoringSystemData" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seesPdu", propOrder = {
    "acousticSignatureRepresentationIndex",
    "infraredSignatureRepresentationIndex",
    "numberOfPropulsionSystems",
    "numberOfVectoringNozzleSystems",
    "orginatingEntityID",
    "propulsionSystemData",
    "radarCrossSectionSignatureRepresentationIndex",
    "vectoringSystemData"
})
public class SeesPdu
    extends DistributedEmissionsFamilyPdu
{

    protected int acousticSignatureRepresentationIndex;
    protected int infraredSignatureRepresentationIndex;
    protected int numberOfPropulsionSystems;
    protected int numberOfVectoringNozzleSystems;
    protected EntityID orginatingEntityID;
    @XmlElement(nillable = true)
    protected List<Object> propulsionSystemData;
    protected int radarCrossSectionSignatureRepresentationIndex;
    @XmlElement(nillable = true)
    protected List<Object> vectoringSystemData;

    /**
     * Gets the value of the acousticSignatureRepresentationIndex property.
     * 
     */
    public int getAcousticSignatureRepresentationIndex() {
        return acousticSignatureRepresentationIndex;
    }

    /**
     * Sets the value of the acousticSignatureRepresentationIndex property.
     * 
     */
    public void setAcousticSignatureRepresentationIndex(int value) {
        this.acousticSignatureRepresentationIndex = value;
    }

    /**
     * Gets the value of the infraredSignatureRepresentationIndex property.
     * 
     */
    public int getInfraredSignatureRepresentationIndex() {
        return infraredSignatureRepresentationIndex;
    }

    /**
     * Sets the value of the infraredSignatureRepresentationIndex property.
     * 
     */
    public void setInfraredSignatureRepresentationIndex(int value) {
        this.infraredSignatureRepresentationIndex = value;
    }

    /**
     * Gets the value of the numberOfPropulsionSystems property.
     * 
     */
    public int getNumberOfPropulsionSystems() {
        return numberOfPropulsionSystems;
    }

    /**
     * Sets the value of the numberOfPropulsionSystems property.
     * 
     */
    public void setNumberOfPropulsionSystems(int value) {
        this.numberOfPropulsionSystems = value;
    }

    /**
     * Gets the value of the numberOfVectoringNozzleSystems property.
     * 
     */
    public int getNumberOfVectoringNozzleSystems() {
        return numberOfVectoringNozzleSystems;
    }

    /**
     * Sets the value of the numberOfVectoringNozzleSystems property.
     * 
     */
    public void setNumberOfVectoringNozzleSystems(int value) {
        this.numberOfVectoringNozzleSystems = value;
    }

    /**
     * Gets the value of the orginatingEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityID }
     *     
     */
    public EntityID getOrginatingEntityID() {
        return orginatingEntityID;
    }

    /**
     * Sets the value of the orginatingEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityID }
     *     
     */
    public void setOrginatingEntityID(EntityID value) {
        this.orginatingEntityID = value;
    }

    /**
     * Gets the value of the propulsionSystemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propulsionSystemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropulsionSystemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPropulsionSystemData() {
        if (propulsionSystemData == null) {
            propulsionSystemData = new ArrayList<Object>();
        }
        return this.propulsionSystemData;
    }

    /**
     * Gets the value of the radarCrossSectionSignatureRepresentationIndex property.
     * 
     */
    public int getRadarCrossSectionSignatureRepresentationIndex() {
        return radarCrossSectionSignatureRepresentationIndex;
    }

    /**
     * Sets the value of the radarCrossSectionSignatureRepresentationIndex property.
     * 
     */
    public void setRadarCrossSectionSignatureRepresentationIndex(int value) {
        this.radarCrossSectionSignatureRepresentationIndex = value;
    }

    /**
     * Gets the value of the vectoringSystemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectoringSystemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectoringSystemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getVectoringSystemData() {
        if (vectoringSystemData == null) {
            vectoringSystemData = new ArrayList<Object>();
        }
        return this.vectoringSystemData;
    }

}
