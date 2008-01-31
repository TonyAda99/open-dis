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
 * <p>Java class for minefieldStatePdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="minefieldStatePdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}minefieldFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="appearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="forceID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="mineType" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="minefieldID" type="{}entityID" minOccurs="0"/>
 *         &lt;element name="minefieldLocation" type="{}vector3Double" minOccurs="0"/>
 *         &lt;element name="minefieldOrientation" type="{}orientation" minOccurs="0"/>
 *         &lt;element name="minefieldSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minefieldType" type="{}entityType" minOccurs="0"/>
 *         &lt;element name="numberOfMineTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfPerimeterPoints" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="perimeterPoints" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocolMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minefieldStatePdu", propOrder = {
    "appearance",
    "forceID",
    "mineType",
    "minefieldID",
    "minefieldLocation",
    "minefieldOrientation",
    "minefieldSequence",
    "minefieldType",
    "numberOfMineTypes",
    "numberOfPerimeterPoints",
    "perimeterPoints",
    "protocolMode"
})
public class MinefieldStatePdu
    extends MinefieldFamilyPdu
{

    protected int appearance;
    protected short forceID;
    @XmlElement(nillable = true)
    protected List<Object> mineType;
    protected EntityID minefieldID;
    protected Vector3Double minefieldLocation;
    protected Orientation minefieldOrientation;
    protected int minefieldSequence;
    protected EntityType minefieldType;
    protected int numberOfMineTypes;
    protected short numberOfPerimeterPoints;
    @XmlElement(nillable = true)
    protected List<Object> perimeterPoints;
    protected int protocolMode;

    /**
     * Gets the value of the appearance property.
     * 
     */
    public int getAppearance() {
        return appearance;
    }

    /**
     * Sets the value of the appearance property.
     * 
     */
    public void setAppearance(int value) {
        this.appearance = value;
    }

    /**
     * Gets the value of the forceID property.
     * 
     */
    public short getForceID() {
        return forceID;
    }

    /**
     * Sets the value of the forceID property.
     * 
     */
    public void setForceID(short value) {
        this.forceID = value;
    }

    /**
     * Gets the value of the mineType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mineType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMineType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMineType() {
        if (mineType == null) {
            mineType = new ArrayList<Object>();
        }
        return this.mineType;
    }

    /**
     * Gets the value of the minefieldID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityID }
     *     
     */
    public EntityID getMinefieldID() {
        return minefieldID;
    }

    /**
     * Sets the value of the minefieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityID }
     *     
     */
    public void setMinefieldID(EntityID value) {
        this.minefieldID = value;
    }

    /**
     * Gets the value of the minefieldLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Double }
     *     
     */
    public Vector3Double getMinefieldLocation() {
        return minefieldLocation;
    }

    /**
     * Sets the value of the minefieldLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Double }
     *     
     */
    public void setMinefieldLocation(Vector3Double value) {
        this.minefieldLocation = value;
    }

    /**
     * Gets the value of the minefieldOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link Orientation }
     *     
     */
    public Orientation getMinefieldOrientation() {
        return minefieldOrientation;
    }

    /**
     * Sets the value of the minefieldOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orientation }
     *     
     */
    public void setMinefieldOrientation(Orientation value) {
        this.minefieldOrientation = value;
    }

    /**
     * Gets the value of the minefieldSequence property.
     * 
     */
    public int getMinefieldSequence() {
        return minefieldSequence;
    }

    /**
     * Sets the value of the minefieldSequence property.
     * 
     */
    public void setMinefieldSequence(int value) {
        this.minefieldSequence = value;
    }

    /**
     * Gets the value of the minefieldType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getMinefieldType() {
        return minefieldType;
    }

    /**
     * Sets the value of the minefieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setMinefieldType(EntityType value) {
        this.minefieldType = value;
    }

    /**
     * Gets the value of the numberOfMineTypes property.
     * 
     */
    public int getNumberOfMineTypes() {
        return numberOfMineTypes;
    }

    /**
     * Sets the value of the numberOfMineTypes property.
     * 
     */
    public void setNumberOfMineTypes(int value) {
        this.numberOfMineTypes = value;
    }

    /**
     * Gets the value of the numberOfPerimeterPoints property.
     * 
     */
    public short getNumberOfPerimeterPoints() {
        return numberOfPerimeterPoints;
    }

    /**
     * Sets the value of the numberOfPerimeterPoints property.
     * 
     */
    public void setNumberOfPerimeterPoints(short value) {
        this.numberOfPerimeterPoints = value;
    }

    /**
     * Gets the value of the perimeterPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perimeterPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerimeterPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPerimeterPoints() {
        if (perimeterPoints == null) {
            perimeterPoints = new ArrayList<Object>();
        }
        return this.perimeterPoints;
    }

    /**
     * Gets the value of the protocolMode property.
     * 
     */
    public int getProtocolMode() {
        return protocolMode;
    }

    /**
     * Sets the value of the protocolMode property.
     * 
     */
    public void setProtocolMode(int value) {
        this.protocolMode = value;
    }

}
