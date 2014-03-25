
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRouteWithMapResult" type="{http://webservices.maplink2.com.br}RouteInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRouteWithMapResult"
})
@XmlRootElement(name = "getRouteWithMapResponse")
public class GetRouteWithMapResponse {

    @XmlElement(required = true)
    protected RouteInfo getRouteWithMapResult;

    /**
     * Gets the value of the getRouteWithMapResult property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInfo }
     *     
     */
    public RouteInfo getGetRouteWithMapResult() {
        return getRouteWithMapResult;
    }

    /**
     * Sets the value of the getRouteWithMapResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInfo }
     *     
     */
    public void setGetRouteWithMapResult(RouteInfo value) {
        this.getRouteWithMapResult = value;
    }

}
