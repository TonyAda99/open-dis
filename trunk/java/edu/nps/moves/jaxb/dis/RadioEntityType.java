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
 * <p>Java class for radioEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="radioEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="entityKind" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="nomenclature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomenclatureVersion" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="subcategory" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "radioEntityType", propOrder = {
    "category",
    "country",
    "domain",
    "entityKind",
    "nomenclature",
    "nomenclatureVersion",
    "subcategory"
})
public class RadioEntityType {

    protected short category;
    protected int country;
    protected short domain;
    protected short entityKind;
    protected int nomenclature;
    protected short nomenclatureVersion;
    protected short subcategory;

    /**
     * Gets the value of the category property.
     * 
     */
    public short getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     */
    public void setCategory(short value) {
        this.category = value;
    }

    /**
     * Gets the value of the country property.
     * 
     */
    public int getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(int value) {
        this.country = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     */
    public short getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     */
    public void setDomain(short value) {
        this.domain = value;
    }

    /**
     * Gets the value of the entityKind property.
     * 
     */
    public short getEntityKind() {
        return entityKind;
    }

    /**
     * Sets the value of the entityKind property.
     * 
     */
    public void setEntityKind(short value) {
        this.entityKind = value;
    }

    /**
     * Gets the value of the nomenclature property.
     * 
     */
    public int getNomenclature() {
        return nomenclature;
    }

    /**
     * Sets the value of the nomenclature property.
     * 
     */
    public void setNomenclature(int value) {
        this.nomenclature = value;
    }

    /**
     * Gets the value of the nomenclatureVersion property.
     * 
     */
    public short getNomenclatureVersion() {
        return nomenclatureVersion;
    }

    /**
     * Sets the value of the nomenclatureVersion property.
     * 
     */
    public void setNomenclatureVersion(short value) {
        this.nomenclatureVersion = value;
    }

    /**
     * Gets the value of the subcategory property.
     * 
     */
    public short getSubcategory() {
        return subcategory;
    }

    /**
     * Sets the value of the subcategory property.
     * 
     */
    public void setSubcategory(short value) {
        this.subcategory = value;
    }

}
