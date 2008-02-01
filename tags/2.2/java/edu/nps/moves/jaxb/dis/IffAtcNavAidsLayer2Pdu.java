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
 * <p>Java class for iffAtcNavAidsLayer2Pdu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iffAtcNavAidsLayer2Pdu">
 *   &lt;complexContent>
 *     &lt;extension base="{}iffAtcNavAidsLayer1Pdu">
 *       &lt;sequence>
 *         &lt;element name="beamData" type="{}beamData" minOccurs="0"/>
 *         &lt;element name="fundamentalIffParameters" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="layerHeader" type="{}layerHeader" minOccurs="0"/>
 *         &lt;element name="secondaryOperationalData" type="{}beamData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iffAtcNavAidsLayer2Pdu", propOrder = {
    "beamData",
    "fundamentalIffParameters",
    "layerHeader",
    "secondaryOperationalData"
})
public class IffAtcNavAidsLayer2Pdu
    extends IffAtcNavAidsLayer1Pdu
{

    protected BeamData beamData;
    @XmlElement(nillable = true)
    protected List<Object> fundamentalIffParameters;
    protected LayerHeader layerHeader;
    protected BeamData secondaryOperationalData;

    /**
     * Gets the value of the beamData property.
     * 
     * @return
     *     possible object is
     *     {@link BeamData }
     *     
     */
    public BeamData getBeamData() {
        return beamData;
    }

    /**
     * Sets the value of the beamData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamData }
     *     
     */
    public void setBeamData(BeamData value) {
        this.beamData = value;
    }

    /**
     * Gets the value of the fundamentalIffParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundamentalIffParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundamentalIffParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getFundamentalIffParameters() {
        if (fundamentalIffParameters == null) {
            fundamentalIffParameters = new ArrayList<Object>();
        }
        return this.fundamentalIffParameters;
    }

    /**
     * Gets the value of the layerHeader property.
     * 
     * @return
     *     possible object is
     *     {@link LayerHeader }
     *     
     */
    public LayerHeader getLayerHeader() {
        return layerHeader;
    }

    /**
     * Sets the value of the layerHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerHeader }
     *     
     */
    public void setLayerHeader(LayerHeader value) {
        this.layerHeader = value;
    }

    /**
     * Gets the value of the secondaryOperationalData property.
     * 
     * @return
     *     possible object is
     *     {@link BeamData }
     *     
     */
    public BeamData getSecondaryOperationalData() {
        return secondaryOperationalData;
    }

    /**
     * Sets the value of the secondaryOperationalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamData }
     *     
     */
    public void setSecondaryOperationalData(BeamData value) {
        this.secondaryOperationalData = value;
    }

}
