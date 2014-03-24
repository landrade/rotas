
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://webservices.maplink2.com.br}City"/>
 *         &lt;element name="point" type="{http://webservices.maplink2.com.br}Point"/>
 *         &lt;element name="carAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zipRangeStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipRangeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addressesAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityLocation", propOrder = {
    "city",
    "point",
    "carAccess",
    "zipRangeStart",
    "zipRangeEnd",
    "capital",
    "addressesAvailable"
})
public class CityLocation {

    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    protected Point point;
    protected boolean carAccess;
    protected String zipRangeStart;
    protected String zipRangeEnd;
    protected boolean capital;
    protected boolean addressesAvailable;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
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
     * Gets the value of the zipRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipRangeStart() {
        return zipRangeStart;
    }

    /**
     * Sets the value of the zipRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipRangeStart(String value) {
        this.zipRangeStart = value;
    }

    /**
     * Gets the value of the zipRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipRangeEnd() {
        return zipRangeEnd;
    }

    /**
     * Sets the value of the zipRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipRangeEnd(String value) {
        this.zipRangeEnd = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     */
    public boolean isCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     */
    public void setCapital(boolean value) {
        this.capital = value;
    }

    /**
     * Gets the value of the addressesAvailable property.
     * 
     */
    public boolean isAddressesAvailable() {
        return addressesAvailable;
    }

    /**
     * Sets the value of the addressesAvailable property.
     * 
     */
    public void setAddressesAvailable(boolean value) {
        this.addressesAvailable = value;
    }

}
