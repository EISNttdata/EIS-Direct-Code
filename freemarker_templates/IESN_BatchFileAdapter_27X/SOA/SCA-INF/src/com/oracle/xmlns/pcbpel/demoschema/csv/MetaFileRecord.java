
package com.oracle.xmlns.pcbpel.demoschema.csv;

import java.util.ArrayList;
import java.util.List;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaFile" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="XEC_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PayloadType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="XEC_ReceiptDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OFN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "metaFile" })
@XmlRootElement(name = "MetaFile-Record")
public class MetaFileRecord {

    @XmlElement(name = "MetaFile", required = true)
    protected List<MetaFileRecord.MetaFile> metaFile;

    /**
     * Gets the value of the metaFile property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaFile property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaFile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaFileRecord.MetaFile }
     *
     *
     */
    public List<MetaFileRecord.MetaFile> getMetaFile() {
        if (metaFile == null) {
            metaFile = new ArrayList<MetaFileRecord.MetaFile>();
        }
        return this.metaFile;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="XEC_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PayloadType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="XEC_ReceiptDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OFN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "xecid", "payloadType", "xecReceiptDateTime", "fName", "ofn", "channel" })
    public static class MetaFile {

        @XmlElement(name = "XEC_ID", required = true)
        protected String xecid;
        @XmlElement(name = "PayloadType", required = true)
        protected String payloadType;
        @XmlElement(name = "XEC_ReceiptDateTime", required = true)
        protected String xecReceiptDateTime;
        @XmlElement(name = "FName", required = true)
        protected String fName;
        @XmlElement(name = "OFN", required = true)
        protected String ofn;
        @XmlElement(name = "Channel", required = true)
        protected String channel;

        /**
         * Gets the value of the xecid property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getXECID() {
            return xecid;
        }

        /**
         * Sets the value of the xecid property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setXECID(String value) {
            this.xecid = value;
        }

        /**
         * Gets the value of the payloadType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPayloadType() {
            return payloadType;
        }

        /**
         * Sets the value of the payloadType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPayloadType(String value) {
            this.payloadType = value;
        }

        /**
         * Gets the value of the xecReceiptDateTime property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getXECReceiptDateTime() {
            return xecReceiptDateTime;
        }

        /**
         * Sets the value of the xecReceiptDateTime property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setXECReceiptDateTime(String value) {
            this.xecReceiptDateTime = value;
        }

        /**
         * Gets the value of the fName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFName() {
            return fName;
        }

        /**
         * Sets the value of the fName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFName(String value) {
            this.fName = value;
        }

        /**
         * Gets the value of the ofn property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOFN() {
            return ofn;
        }

        /**
         * Sets the value of the ofn property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOFN(String value) {
            this.ofn = value;
        }

        /**
         * Gets the value of the channel property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setChannel(String value) {
            this.channel = value;
        }

    }

}
