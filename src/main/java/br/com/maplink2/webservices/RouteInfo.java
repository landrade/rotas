
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapInfo" type="{http://webservices.maplink2.com.br}MapInfo"/>
 *         &lt;element name="segDescription" type="{http://webservices.maplink2.com.br}ArrayOfSegmentDescription" minOccurs="0"/>
 *         &lt;element name="routeTotals" type="{http://webservices.maplink2.com.br}RouteTotals"/>
 *         &lt;element name="routeSummary" type="{http://webservices.maplink2.com.br}ArrayOfRouteSummary" minOccurs="0"/>
 *         &lt;element name="roadType" type="{http://webservices.maplink2.com.br}RoadType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInfo", propOrder = {
    "routeId",
    "mapInfo",
    "segDescription",
    "routeTotals",
    "routeSummary",
    "roadType"
})
public class RouteInfo {

    protected String routeId;
    @XmlElement(name = "MapInfo", required = true)
    protected MapInfo mapInfo;
    protected ArrayOfSegmentDescription segDescription;
    @XmlElement(required = true)
    protected RouteTotals routeTotals;
    protected ArrayOfRouteSummary routeSummary;
    @XmlElement(required = true)
    protected RoadType roadType;

    /**
     * Gets the value of the routeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets the value of the routeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteId(String value) {
        this.routeId = value;
    }

    /**
     * Gets the value of the mapInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MapInfo }
     *     
     */
    public MapInfo getMapInfo() {
        return mapInfo;
    }

    /**
     * Sets the value of the mapInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapInfo }
     *     
     */
    public void setMapInfo(MapInfo value) {
        this.mapInfo = value;
    }

    /**
     * Gets the value of the segDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public ArrayOfSegmentDescription getSegDescription() {
        return segDescription;
    }

    /**
     * Sets the value of the segDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public void setSegDescription(ArrayOfSegmentDescription value) {
        this.segDescription = value;
    }

    /**
     * Gets the value of the routeTotals property.
     * 
     * @return
     *     possible object is
     *     {@link RouteTotals }
     *     
     */
    public RouteTotals getRouteTotals() {
        return routeTotals;
    }

    /**
     * Sets the value of the routeTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTotals }
     *     
     */
    public void setRouteTotals(RouteTotals value) {
        this.routeTotals = value;
    }

    /**
     * Gets the value of the routeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteSummary }
     *     
     */
    public ArrayOfRouteSummary getRouteSummary() {
        return routeSummary;
    }

    /**
     * Sets the value of the routeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteSummary }
     *     
     */
    public void setRouteSummary(ArrayOfRouteSummary value) {
        this.routeSummary = value;
    }

    /**
     * Gets the value of the roadType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadType }
     *     
     */
    public RoadType getRoadType() {
        return roadType;
    }

    /**
     * Sets the value of the roadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadType }
     *     
     */
    public void setRoadType(RoadType value) {
        this.roadType = value;
    }

}
