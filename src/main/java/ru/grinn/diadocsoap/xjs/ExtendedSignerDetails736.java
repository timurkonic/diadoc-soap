//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.28 at 09:12:19 AM MSK 
//


package ru.grinn.diadocsoap.xjs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedSignerDetails736 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedSignerDetails736"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ExtendedSignerDetailsBase736"&gt;
 *       &lt;attribute name="SignerStatus" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;enumeration value="3"/&gt;
 *             &lt;enumeration value="4"/&gt;
 *             &lt;enumeration value="5"/&gt;
 *             &lt;enumeration value="6"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedSignerDetails736")
@XmlSeeAlso({
    ExtendedSignerDetailsCorrectionBuyerTitle736 .class
})
public class ExtendedSignerDetails736
    extends ExtendedSignerDetailsBase736
{

    @XmlAttribute(name = "SignerStatus", required = true)
    protected BigInteger signerStatus;

    /**
     * Gets the value of the signerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignerStatus() {
        return signerStatus;
    }

    /**
     * Sets the value of the signerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignerStatus(BigInteger value) {
        this.signerStatus = value;
    }

}
