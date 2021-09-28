//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.28 at 06:02:11 PM MSK 
//


package ru.grinn.diadocsoap.xjs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutgoingUniversalTransferDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutgoingUniversalTransferDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Seller" type="{http://www.grinn-corp.ru/gestori/edo}OutgoingUniversalTransferDocumentFirm"/&gt;
 *         &lt;element name="Buyer" type="{http://www.grinn-corp.ru/gestori/edo}OutgoingUniversalTransferDocumentFirm"/&gt;
 *         &lt;element name="VatAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Items" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://www.grinn-corp.ru/gestori/edo}OutgoingUniversalTransferDocumentItem" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutgoingUniversalTransferDocument", namespace = "http://www.grinn-corp.ru/gestori/edo", propOrder = {
    "documentNumber",
    "documentDate",
    "seller",
    "buyer",
    "vatAmount",
    "totalAmount",
    "items"
})
public class OutgoingUniversalTransferDocument {

    @XmlElement(name = "DocumentNumber", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentDate", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "Seller", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    protected OutgoingUniversalTransferDocumentFirm seller;
    @XmlElement(name = "Buyer", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    protected OutgoingUniversalTransferDocumentFirm buyer;
    @XmlElement(name = "VatAmount", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    protected BigDecimal vatAmount;
    @XmlElement(name = "TotalAmount", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "Items", namespace = "http://www.grinn-corp.ru/gestori/edo")
    protected OutgoingUniversalTransferDocument.Items items;

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link OutgoingUniversalTransferDocumentFirm }
     *     
     */
    public OutgoingUniversalTransferDocumentFirm getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutgoingUniversalTransferDocumentFirm }
     *     
     */
    public void setSeller(OutgoingUniversalTransferDocumentFirm value) {
        this.seller = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link OutgoingUniversalTransferDocumentFirm }
     *     
     */
    public OutgoingUniversalTransferDocumentFirm getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutgoingUniversalTransferDocumentFirm }
     *     
     */
    public void setBuyer(OutgoingUniversalTransferDocumentFirm value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the vatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatAmount(BigDecimal value) {
        this.vatAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link OutgoingUniversalTransferDocument.Items }
     *     
     */
    public OutgoingUniversalTransferDocument.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutgoingUniversalTransferDocument.Items }
     *     
     */
    public void setItems(OutgoingUniversalTransferDocument.Items value) {
        this.items = value;
    }


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
     *         &lt;element name="Item" type="{http://www.grinn-corp.ru/gestori/edo}OutgoingUniversalTransferDocumentItem" maxOccurs="unbounded"/&gt;
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
        "item"
    })
    public static class Items {

        @XmlElement(name = "Item", namespace = "http://www.grinn-corp.ru/gestori/edo", required = true)
        protected List<OutgoingUniversalTransferDocumentItem> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OutgoingUniversalTransferDocumentItem }
         * 
         * 
         */
        public List<OutgoingUniversalTransferDocumentItem> getItem() {
            if (item == null) {
                item = new ArrayList<OutgoingUniversalTransferDocumentItem>();
            }
            return this.item;
        }

    }

}
