
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternativeRouteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeRouteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainRoute" type="{http://webservices.maplink2.com.br}RouteInfo"/>
 *         &lt;element name="alternatives" type="{http://webservices.maplink2.com.br}ArrayOfRouteInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeRouteInfo", propOrder = {
    "mainRoute",
    "alternatives"
})
public class AlternativeRouteInfo {

    @XmlElement(required = true)
    protected RouteInfo mainRoute;
    protected ArrayOfRouteInfo alternatives;

    /**
     * Gets the value of the mainRoute property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInfo }
     *     
     */
    public RouteInfo getMainRoute() {
        return mainRoute;
    }

    /**
     * Sets the value of the mainRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInfo }
     *     
     */
    public void setMainRoute(RouteInfo value) {
        this.mainRoute = value;
    }

    /**
     * Gets the value of the alternatives property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteInfo }
     *     
     */
    public ArrayOfRouteInfo getAlternatives() {
        return alternatives;
    }

    /**
     * Sets the value of the alternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteInfo }
     *     
     */
    public void setAlternatives(ArrayOfRouteInfo value) {
        this.alternatives = value;
    }

}
