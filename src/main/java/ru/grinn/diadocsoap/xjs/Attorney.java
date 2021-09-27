//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.27 at 10:55:43 AM MSK 
//


package ru.grinn.diadocsoap.xjs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attorney complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attorney"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IssuerPerson" type="{}Official" minOccurs="0"/&gt;
 *         &lt;element name="RecipientPerson" type="{}Official" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="Date" type="{}date" /&gt;
 *       &lt;attribute name="Number" type="{}string255" /&gt;
 *       &lt;attribute name="IssuerOrganizationName" type="{}string1000" /&gt;
 *       &lt;attribute name="IssuerAdditionalInfo" type="{}string1000" /&gt;
 *       &lt;attribute name="RecipientAdditionalInfo" type="{}string1000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attorney", propOrder = {

})
public class Attorney {

    @XmlElement(name = "IssuerPerson")
    protected Official issuerPerson;
    @XmlElement(name = "RecipientPerson")
    protected Official recipientPerson;
    @XmlAttribute(name = "Date")
    protected String date;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "IssuerOrganizationName")
    protected String issuerOrganizationName;
    @XmlAttribute(name = "IssuerAdditionalInfo")
    protected String issuerAdditionalInfo;
    @XmlAttribute(name = "RecipientAdditionalInfo")
    protected String recipientAdditionalInfo;

    /**
     * Gets the value of the issuerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Official }
     *     
     */
    public Official getIssuerPerson() {
        return issuerPerson;
    }

    /**
     * Sets the value of the issuerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Official }
     *     
     */
    public void setIssuerPerson(Official value) {
        this.issuerPerson = value;
    }

    /**
     * Gets the value of the recipientPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Official }
     *     
     */
    public Official getRecipientPerson() {
        return recipientPerson;
    }

    /**
     * Sets the value of the recipientPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Official }
     *     
     */
    public void setRecipientPerson(Official value) {
        this.recipientPerson = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the issuerOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerOrganizationName() {
        return issuerOrganizationName;
    }

    /**
     * Sets the value of the issuerOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerOrganizationName(String value) {
        this.issuerOrganizationName = value;
    }

    /**
     * Gets the value of the issuerAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerAdditionalInfo() {
        return issuerAdditionalInfo;
    }

    /**
     * Sets the value of the issuerAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerAdditionalInfo(String value) {
        this.issuerAdditionalInfo = value;
    }

    /**
     * Gets the value of the recipientAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAdditionalInfo() {
        return recipientAdditionalInfo;
    }

    /**
     * Sets the value of the recipientAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAdditionalInfo(String value) {
        this.recipientAdditionalInfo = value;
    }

}
