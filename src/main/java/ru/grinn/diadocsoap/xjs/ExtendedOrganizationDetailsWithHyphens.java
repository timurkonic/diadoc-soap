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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedOrganizationDetailsWithHyphens complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedOrganizationDetailsWithHyphens"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}ExtendedOrganizationDetails"&gt;
 *       &lt;attribute name="HyphenInn" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
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
@XmlType(name = "ExtendedOrganizationDetailsWithHyphens")
public class ExtendedOrganizationDetailsWithHyphens
    extends ExtendedOrganizationDetails
{

    @XmlAttribute(name = "HyphenInn")
    protected String hyphenInn;

    /**
     * Gets the value of the hyphenInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenInn() {
        if (hyphenInn == null) {
            return "false";
        } else {
            return hyphenInn;
        }
    }

    /**
     * Sets the value of the hyphenInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenInn(String value) {
        this.hyphenInn = value;
    }

}
