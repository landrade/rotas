
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POIInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POIInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="poiLocations" type="{http://webservices.maplink2.com.br}ArrayOfPOILocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POIInfo", propOrder = {
    "recordCount",
    "pageCount",
    "poiLocations"
})
public class POIInfo {

    protected int recordCount;
    protected int pageCount;
    protected ArrayOfPOILocation poiLocations;

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
     * Gets the value of the poiLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOILocation }
     *     
     */
    public ArrayOfPOILocation getPoiLocations() {
        return poiLocations;
    }

    /**
     * Sets the value of the poiLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOILocation }
     *     
     */
    public void setPoiLocations(ArrayOfPOILocation value) {
        this.poiLocations = value;
    }

}
