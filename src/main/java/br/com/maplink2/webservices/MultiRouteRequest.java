
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRouteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRouteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *         &lt;element name="destination" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRouteRequest", propOrder = {
    "origin",
    "destination"
})
public class MultiRouteRequest {

    @XmlElement(required = true)
    protected RouteStop origin;
    @XmlElement(required = true)
    protected RouteStop destination;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setOrigin(RouteStop value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setDestination(RouteStop value) {
        this.destination = value;
    }

}
