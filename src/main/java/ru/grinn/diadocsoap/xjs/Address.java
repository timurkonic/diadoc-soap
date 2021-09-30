//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.30 at 11:18:19 AM MSK 
//


package ru.grinn.diadocsoap.xjs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RussianAddress" type="{}RussianAddress"/&gt;
 *         &lt;element name="ForeignAddress" type="{}ForeignAddress"/&gt;
 *         &lt;element name="AddressCode" type="{}string36"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "russianAddress",
    "foreignAddress",
    "addressCode"
})
public class Address {

    @XmlElement(name = "RussianAddress")
    protected RussianAddress russianAddress;
    @XmlElement(name = "ForeignAddress")
    protected ForeignAddress foreignAddress;
    @XmlElement(name = "AddressCode")
    protected String addressCode;

    /**
     * Gets the value of the russianAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RussianAddress }
     *     
     */
    public RussianAddress getRussianAddress() {
        return russianAddress;
    }

    /**
     * Sets the value of the russianAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RussianAddress }
     *     
     */
    public void setRussianAddress(RussianAddress value) {
        this.russianAddress = value;
    }

    /**
     * Gets the value of the foreignAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignAddress }
     *     
     */
    public ForeignAddress getForeignAddress() {
        return foreignAddress;
    }

    /**
     * Sets the value of the foreignAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignAddress }
     *     
     */
    public void setForeignAddress(ForeignAddress value) {
        this.foreignAddress = value;
    }

    /**
     * Gets the value of the addressCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * Sets the value of the addressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCode(String value) {
        this.addressCode = value;
    }

}
