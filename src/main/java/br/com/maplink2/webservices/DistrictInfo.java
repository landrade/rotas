
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistrictInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="districtLocation" type="{http://webservices.maplink2.com.br}ArrayOfDistrictLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictInfo", propOrder = {
    "recordCount",
    "pageCount",
    "districtLocation"
})
public class DistrictInfo {

    protected int recordCount;
    protected int pageCount;
    protected ArrayOfDistrictLocation districtLocation;

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
     * Gets the value of the districtLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistrictLocation }
     *     
     */
    public ArrayOfDistrictLocation getDistrictLocation() {
        return districtLocation;
    }

    /**
     * Sets the value of the districtLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistrictLocation }
     *     
     */
    public void setDistrictLocation(ArrayOfDistrictLocation value) {
        this.districtLocation = value;
    }

}
