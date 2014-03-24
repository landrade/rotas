
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://webservices.maplink2.com.br}Address"/>
 *         &lt;element name="zipL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="point" type="{http://webservices.maplink2.com.br}Point"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressLocation", propOrder = {
    "key",
    "address",
    "zipL",
    "zipR",
    "carAccess",
    "dataSource",
    "point"
})
public class AddressLocation {

    protected String key;
    @XmlElement(required = true)
    protected Address address;
    protected String zipL;
    protected String zipR;
    protected boolean carAccess;
    protected String dataSource;
    @XmlElement(required = true)
    protected Point point;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the zipL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipL() {
        return zipL;
    }

    /**
     * Sets the value of the zipL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipL(String value) {
        this.zipL = value;
    }

    /**
     * Gets the value of the zipR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipR() {
        return zipR;
    }

    /**
     * Sets the value of the zipR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipR(String value) {
        this.zipR = value;
    }

    /**
     * Gets the value of the carAccess property.
     * 
     */
    public boolean isCarAccess() {
        return carAccess;
    }

    /**
     * Sets the value of the carAccess property.
     * 
     */
    public void setCarAccess(boolean value) {
        this.carAccess = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

}
