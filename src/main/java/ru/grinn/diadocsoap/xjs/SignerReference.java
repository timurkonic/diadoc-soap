//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.28 at 09:12:19 AM MSK 
//


package ru.grinn.diadocsoap.xjs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="BoxId" use="required" type="{}string100" /&gt;
 *       &lt;attribute name="CertificateBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
 *       &lt;attribute name="CertificateThumbprint" type="{}string100" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerReference")
public class SignerReference {

    @XmlAttribute(name = "BoxId", required = true)
    protected String boxId;
    @XmlAttribute(name = "CertificateBytes")
    protected byte[] certificateBytes;
    @XmlAttribute(name = "CertificateThumbprint")
    protected String certificateThumbprint;

    /**
     * Gets the value of the boxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxId() {
        return boxId;
    }

    /**
     * Sets the value of the boxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxId(String value) {
        this.boxId = value;
    }

    /**
     * Gets the value of the certificateBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertificateBytes() {
        return certificateBytes;
    }

    /**
     * Sets the value of the certificateBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertificateBytes(byte[] value) {
        this.certificateBytes = value;
    }

    /**
     * Gets the value of the certificateThumbprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateThumbprint() {
        return certificateThumbprint;
    }

    /**
     * Sets the value of the certificateThumbprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateThumbprint(String value) {
        this.certificateThumbprint = value;
    }

}
