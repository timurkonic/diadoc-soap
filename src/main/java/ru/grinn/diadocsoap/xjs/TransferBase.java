//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.28 at 06:02:11 PM MSK 
//


package ru.grinn.diadocsoap.xjs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="BaseDocumentName" use="required" type="{}string255" /&gt;
 *       &lt;attribute name="BaseDocumentNumber" type="{}string255" /&gt;
 *       &lt;attribute name="BaseDocumentDate" type="{}date" /&gt;
 *       &lt;attribute name="BaseDocumentInfo" type="{}string1000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBase")
@XmlSeeAlso({
    TransferBase820 .class
})
public class TransferBase {

    @XmlAttribute(name = "BaseDocumentName", required = true)
    protected String baseDocumentName;
    @XmlAttribute(name = "BaseDocumentNumber")
    protected String baseDocumentNumber;
    @XmlAttribute(name = "BaseDocumentDate")
    protected String baseDocumentDate;
    @XmlAttribute(name = "BaseDocumentInfo")
    protected String baseDocumentInfo;

    /**
     * Gets the value of the baseDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDocumentName() {
        return baseDocumentName;
    }

    /**
     * Sets the value of the baseDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDocumentName(String value) {
        this.baseDocumentName = value;
    }

    /**
     * Gets the value of the baseDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDocumentNumber() {
        return baseDocumentNumber;
    }

    /**
     * Sets the value of the baseDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDocumentNumber(String value) {
        this.baseDocumentNumber = value;
    }

    /**
     * Gets the value of the baseDocumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDocumentDate() {
        return baseDocumentDate;
    }

    /**
     * Sets the value of the baseDocumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDocumentDate(String value) {
        this.baseDocumentDate = value;
    }

    /**
     * Gets the value of the baseDocumentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDocumentInfo() {
        return baseDocumentInfo;
    }

    /**
     * Sets the value of the baseDocumentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDocumentInfo(String value) {
        this.baseDocumentInfo = value;
    }

}
