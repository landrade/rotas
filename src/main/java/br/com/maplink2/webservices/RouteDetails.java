
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optimizeRoute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="poiRoute" type="{http://webservices.maplink2.com.br}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="barriersList" type="{http://webservices.maplink2.com.br}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="barrierPoints" type="{http://webservices.maplink2.com.br}ArrayOfPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDetails", propOrder = {
    "descriptionType",
    "routeType",
    "optimizeRoute",
    "poiRoute",
    "barriersList",
    "barrierPoints"
})
public class RouteDetails {

    protected int descriptionType;
    protected int routeType;
    protected boolean optimizeRoute;
    protected ArrayOfString poiRoute;
    protected ArrayOfString barriersList;
    protected ArrayOfPoint barrierPoints;

    /**
     * Gets the value of the descriptionType property.
     * 
     */
    public int getDescriptionType() {
        return descriptionType;
    }

    /**
     * Sets the value of the descriptionType property.
     * 
     */
    public void setDescriptionType(int value) {
        this.descriptionType = value;
    }

    /**
     * Gets the value of the routeType property.
     * 
     */
    public int getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     */
    public void setRouteType(int value) {
        this.routeType = value;
    }

    /**
     * Gets the value of the optimizeRoute property.
     * 
     */
    public boolean isOptimizeRoute() {
        return optimizeRoute;
    }

    /**
     * Sets the value of the optimizeRoute property.
     * 
     */
    public void setOptimizeRoute(boolean value) {
        this.optimizeRoute = value;
    }

    /**
     * Gets the value of the poiRoute property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPoiRoute() {
        return poiRoute;
    }

    /**
     * Sets the value of the poiRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPoiRoute(ArrayOfString value) {
        this.poiRoute = value;
    }

    /**
     * Gets the value of the barriersList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getBarriersList() {
        return barriersList;
    }

    /**
     * Sets the value of the barriersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setBarriersList(ArrayOfString value) {
        this.barriersList = value;
    }

    /**
     * Gets the value of the barrierPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPoint }
     *     
     */
    public ArrayOfPoint getBarrierPoints() {
        return barrierPoints;
    }

    /**
     * Sets the value of the barrierPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPoint }
     *     
     */
    public void setBarrierPoints(ArrayOfPoint value) {
        this.barrierPoints = value;
    }

}
