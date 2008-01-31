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
 * <p>Java class for firePdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firePdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}warfareFamilyPdu">
 *       &lt;sequence>
 *         &lt;element name="burstDescriptor" type="{}burstDescriptor" minOccurs="0"/>
 *         &lt;element name="eventID" type="{}eventID" minOccurs="0"/>
 *         &lt;element name="fireMissionIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locationInWorldCoordinates" type="{}vector3Double" minOccurs="0"/>
 *         &lt;element name="munitionID" type="{}entityID" minOccurs="0"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="velocity" type="{}vector3Float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firePdu", propOrder = {
    "burstDescriptor",
    "eventID",
    "fireMissionIndex",
    "locationInWorldCoordinates",
    "munitionID",
    "range",
    "velocity"
})
public class FirePdu
    extends WarfareFamilyPdu
{

    protected BurstDescriptor burstDescriptor;
    protected EventID eventID;
    protected int fireMissionIndex;
    protected Vector3Double locationInWorldCoordinates;
    protected EntityID munitionID;
    protected float range;
    protected Vector3Float velocity;

    /**
     * Gets the value of the burstDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link BurstDescriptor }
     *     
     */
    public BurstDescriptor getBurstDescriptor() {
        return burstDescriptor;
    }

    /**
     * Sets the value of the burstDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurstDescriptor }
     *     
     */
    public void setBurstDescriptor(BurstDescriptor value) {
        this.burstDescriptor = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link EventID }
     *     
     */
    public EventID getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventID }
     *     
     */
    public void setEventID(EventID value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the fireMissionIndex property.
     * 
     */
    public int getFireMissionIndex() {
        return fireMissionIndex;
    }

    /**
     * Sets the value of the fireMissionIndex property.
     * 
     */
    public void setFireMissionIndex(int value) {
        this.fireMissionIndex = value;
    }

    /**
     * Gets the value of the locationInWorldCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Double }
     *     
     */
    public Vector3Double getLocationInWorldCoordinates() {
        return locationInWorldCoordinates;
    }

    /**
     * Sets the value of the locationInWorldCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Double }
     *     
     */
    public void setLocationInWorldCoordinates(Vector3Double value) {
        this.locationInWorldCoordinates = value;
    }

    /**
     * Gets the value of the munitionID property.
     * 
     * @return
     *     possible object is
     *     {@link EntityID }
     *     
     */
    public EntityID getMunitionID() {
        return munitionID;
    }

    /**
     * Sets the value of the munitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityID }
     *     
     */
    public void setMunitionID(EntityID value) {
        this.munitionID = value;
    }

    /**
     * Gets the value of the range property.
     * 
     */
    public float getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     */
    public void setRange(float value) {
        this.range = value;
    }

    /**
     * Gets the value of the velocity property.
     * 
     * @return
     *     possible object is
     *     {@link Vector3Float }
     *     
     */
    public Vector3Float getVelocity() {
        return velocity;
    }

    /**
     * Sets the value of the velocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector3Float }
     *     
     */
    public void setVelocity(Vector3Float value) {
        this.velocity = value;
    }

}
