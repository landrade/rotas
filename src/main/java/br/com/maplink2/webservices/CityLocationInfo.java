
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityLocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cityLocation" type="{http://webservices.maplink2.com.br}ArrayOfCityLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityLocationInfo", propOrder = {
    "recordCount",
    "pageCount",
    "cityLocation"
})
public class CityLocationInfo {

    protected int recordCount;
    protected int pageCount;
    protected ArrayOfCityLocation cityLocation;

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the cityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCityLocation }
     *     
     */
    public ArrayOfCityLocation getCityLocation() {
        return cityLocation;
    }

    /**
     * Sets the value of the cityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCityLocation }
     *     
     */
    public void setCityLocation(ArrayOfCityLocation value) {
        this.cityLocation = value;
    }

}
