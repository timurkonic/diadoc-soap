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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Document" type="{http://www.grinn-corp.ru/gestori/edo}OutgoingUniversalTransferDocument"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document"
})
@XmlRootElement(name = "SendOutgoingUniversalTransferDocumentRequest", namespace = "http://www.grinn-corp.ru/gestori/edo")
public class SendOutgoingUniversalTransferDocumentRequest {

    @XmlElement(name = "Document", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    protected OutgoingUniversalTransferDocument document;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link OutgoingUniversalTransferDocument }
     *     
     */
    public OutgoingUniversalTransferDocument getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutgoingUniversalTransferDocument }
     *     
     */
    public void setDocument(OutgoingUniversalTransferDocument value) {
        this.document = value;
    }

}
