//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.27 at 10:55:43 AM MSK 
//


package ru.grinn.diadocsoap.xjs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SignerDetails" type="{}SignerDetails"/&gt;
 *         &lt;element name="SignerReference" type="{}SignerReferenceInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerInfo", propOrder = {
    "signerDetails",
    "signerReference"
})
public class SignerInfo {

    @XmlElement(name = "SignerDetails")
    protected SignerDetails signerDetails;
    @XmlElement(name = "SignerReference")
    protected SignerReferenceInfo signerReference;

    /**
     * Gets the value of the signerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SignerDetails }
     *     
     */
    public SignerDetails getSignerDetails() {
        return signerDetails;
    }

    /**
     * Sets the value of the signerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerDetails }
     *     
     */
    public void setSignerDetails(SignerDetails value) {
        this.signerDetails = value;
    }

    /**
     * Gets the value of the signerReference property.
     * 
     * @return
     *     possible object is
     *     {@link SignerReferenceInfo }
     *     
     */
    public SignerReferenceInfo getSignerReference() {
        return signerReference;
    }

    /**
     * Sets the value of the signerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerReferenceInfo }
     *     
     */
    public void setSignerReference(SignerReferenceInfo value) {
        this.signerReference = value;
    }

}
