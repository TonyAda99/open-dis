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
 * <p>Java class for fundamentalParameterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fundamentalParameterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beamAzimuthCenter" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="beamAzimuthSweep" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="beamElevationCenter" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="beamElevationSweep" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="beamSweepSync" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="effectiveRadiatedPower" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="frequencyRange" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pulseRepetitionFrequency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pulseWidth" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundamentalParameterData", propOrder = {
    "beamAzimuthCenter",
    "beamAzimuthSweep",
    "beamElevationCenter",
    "beamElevationSweep",
    "beamSweepSync",
    "effectiveRadiatedPower",
    "frequency",
    "frequencyRange",
    "pulseRepetitionFrequency",
    "pulseWidth"
})
public class FundamentalParameterData {

    protected float beamAzimuthCenter;
    protected float beamAzimuthSweep;
    protected float beamElevationCenter;
    protected float beamElevationSweep;
    protected float beamSweepSync;
    protected float effectiveRadiatedPower;
    protected float frequency;
    protected float frequencyRange;
    protected float pulseRepetitionFrequency;
    protected float pulseWidth;

    /**
     * Gets the value of the beamAzimuthCenter property.
     * 
     */
    public float getBeamAzimuthCenter() {
        return beamAzimuthCenter;
    }

    /**
     * Sets the value of the beamAzimuthCenter property.
     * 
     */
    public void setBeamAzimuthCenter(float value) {
        this.beamAzimuthCenter = value;
    }

    /**
     * Gets the value of the beamAzimuthSweep property.
     * 
     */
    public float getBeamAzimuthSweep() {
        return beamAzimuthSweep;
    }

    /**
     * Sets the value of the beamAzimuthSweep property.
     * 
     */
    public void setBeamAzimuthSweep(float value) {
        this.beamAzimuthSweep = value;
    }

    /**
     * Gets the value of the beamElevationCenter property.
     * 
     */
    public float getBeamElevationCenter() {
        return beamElevationCenter;
    }

    /**
     * Sets the value of the beamElevationCenter property.
     * 
     */
    public void setBeamElevationCenter(float value) {
        this.beamElevationCenter = value;
    }

    /**
     * Gets the value of the beamElevationSweep property.
     * 
     */
    public float getBeamElevationSweep() {
        return beamElevationSweep;
    }

    /**
     * Sets the value of the beamElevationSweep property.
     * 
     */
    public void setBeamElevationSweep(float value) {
        this.beamElevationSweep = value;
    }

    /**
     * Gets the value of the beamSweepSync property.
     * 
     */
    public float getBeamSweepSync() {
        return beamSweepSync;
    }

    /**
     * Sets the value of the beamSweepSync property.
     * 
     */
    public void setBeamSweepSync(float value) {
        this.beamSweepSync = value;
    }

    /**
     * Gets the value of the effectiveRadiatedPower property.
     * 
     */
    public float getEffectiveRadiatedPower() {
        return effectiveRadiatedPower;
    }

    /**
     * Sets the value of the effectiveRadiatedPower property.
     * 
     */
    public void setEffectiveRadiatedPower(float value) {
        this.effectiveRadiatedPower = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(float value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the frequencyRange property.
     * 
     */
    public float getFrequencyRange() {
        return frequencyRange;
    }

    /**
     * Sets the value of the frequencyRange property.
     * 
     */
    public void setFrequencyRange(float value) {
        this.frequencyRange = value;
    }

    /**
     * Gets the value of the pulseRepetitionFrequency property.
     * 
     */
    public float getPulseRepetitionFrequency() {
        return pulseRepetitionFrequency;
    }

    /**
     * Sets the value of the pulseRepetitionFrequency property.
     * 
     */
    public void setPulseRepetitionFrequency(float value) {
        this.pulseRepetitionFrequency = value;
    }

    /**
     * Gets the value of the pulseWidth property.
     * 
     */
    public float getPulseWidth() {
        return pulseWidth;
    }

    /**
     * Sets the value of the pulseWidth property.
     * 
     */
    public void setPulseWidth(float value) {
        this.pulseWidth = value;
    }

}
