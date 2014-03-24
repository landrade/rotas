
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="roadLocation" type="{http://webservices.maplink2.com.br}ArrayOfRoadLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadInfo", propOrder = {
    "recordCount",
    "pageCount",
    "roadLocation"
})
public class RoadInfo {

    protected int recordCount;
    protected int pageCount;
    protected ArrayOfRoadLocation roadLocation;

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
     * Gets the value of the roadLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoadLocation }
     *     
     */
    public ArrayOfRoadLocation getRoadLocation() {
        return roadLocation;
    }

    /**
     * Sets the value of the roadLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoadLocation }
     *     
     */
    public void setRoadLocation(ArrayOfRoadLocation value) {
        this.roadLocation = value;
    }

}
