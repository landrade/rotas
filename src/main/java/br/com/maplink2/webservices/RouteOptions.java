
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeDetails" type="{http://webservices.maplink2.com.br}RouteDetails"/>
 *         &lt;element name="vehicle" type="{http://webservices.maplink2.com.br}Vehicle"/>
 *         &lt;element name="routeLine" type="{http://webservices.maplink2.com.br}ArrayOfRouteLine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptions", propOrder = {
    "language",
    "routeDetails",
    "vehicle",
    "routeLine"
})
public class RouteOptions {

    protected String language;
    @XmlElement(required = true)
    protected RouteDetails routeDetails;
    @XmlElement(required = true)
    protected Vehicle vehicle;
    protected ArrayOfRouteLine routeLine;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the routeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RouteDetails }
     *     
     */
    public RouteDetails getRouteDetails() {
        return routeDetails;
    }

    /**
     * Sets the value of the routeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteDetails }
     *     
     */
    public void setRouteDetails(RouteDetails value) {
        this.routeDetails = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the routeLine property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteLine }
     *     
     */
    public ArrayOfRouteLine getRouteLine() {
        return routeLine;
    }

    /**
     * Sets the value of the routeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteLine }
     *     
     */
    public void setRouteLine(ArrayOfRouteLine value) {
        this.routeLine = value;
    }

}
