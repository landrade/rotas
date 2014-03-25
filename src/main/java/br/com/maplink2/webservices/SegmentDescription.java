
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poiRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poiRouteDetails" type="{http://webservices.maplink2.com.br}ArrayOfPOIDetails" minOccurs="0"/>
 *         &lt;element name="city" type="{http://webservices.maplink2.com.br}City"/>
 *         &lt;element name="tollFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollFeeDetails" type="{http://webservices.maplink2.com.br}TollFeeDetails"/>
 *         &lt;element name="roadType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cumulativeDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "SegmentDescription", propOrder = {
    "command",
    "description",
    "poiRoute",
    "poiRouteDetails",
    "city",
    "tollFee",
    "tollFeeDetails",
    "roadType",
    "distance",
    "cumulativeDistance",
    "point"
})
public class SegmentDescription {

    protected String command;
    protected String description;
    protected String poiRoute;
    protected ArrayOfPOIDetails poiRouteDetails;
    @XmlElement(required = true)
    protected City city;
    protected String tollFee;
    @XmlElement(required = true)
    protected TollFeeDetails tollFeeDetails;
    protected String roadType;
    protected double distance;
    protected double cumulativeDistance;
    @XmlElement(required = true)
    protected Point point;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the poiRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoiRoute() {
        return poiRoute;
    }

    /**
     * Sets the value of the poiRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoiRoute(String value) {
        this.poiRoute = value;
    }

    /**
     * Gets the value of the poiRouteDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPOIDetails }
     *     
     */
    public ArrayOfPOIDetails getPoiRouteDetails() {
        return poiRouteDetails;
    }

    /**
     * Sets the value of the poiRouteDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPOIDetails }
     *     
     */
    public void setPoiRouteDetails(ArrayOfPOIDetails value) {
        this.poiRouteDetails = value;
    }

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
     * Gets the value of the tollFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFee() {
        return tollFee;
    }

    /**
     * Sets the value of the tollFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFee(String value) {
        this.tollFee = value;
    }

    /**
     * Gets the value of the tollFeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TollFeeDetails }
     *     
     */
    public TollFeeDetails getTollFeeDetails() {
        return tollFeeDetails;
    }

    /**
     * Sets the value of the tollFeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TollFeeDetails }
     *     
     */
    public void setTollFeeDetails(TollFeeDetails value) {
        this.tollFeeDetails = value;
    }

    /**
     * Gets the value of the roadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadType() {
        return roadType;
    }

    /**
     * Sets the value of the roadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadType(String value) {
        this.roadType = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the cumulativeDistance property.
     * 
     */
    public double getCumulativeDistance() {
        return cumulativeDistance;
    }

    /**
     * Sets the value of the cumulativeDistance property.
     * 
     */
    public void setCumulativeDistance(double value) {
        this.cumulativeDistance = value;
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
