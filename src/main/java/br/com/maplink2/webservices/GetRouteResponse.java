
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
 *         &lt;element name="getRouteResult" type="{http://webservices.maplink2.com.br}RouteInfo"/>
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
    "getRouteResult"
})
@XmlRootElement(name = "getRouteResponse")
public class GetRouteResponse {

    @XmlElement(required = true)
    protected RouteInfo getRouteResult;

    /**
     * Gets the value of the getRouteResult property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInfo }
     *     
     */
    public RouteInfo getGetRouteResult() {
        return getRouteResult;
    }

    /**
     * Sets the value of the getRouteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInfo }
     *     
     */
    public void setGetRouteResult(RouteInfo value) {
        this.getRouteResult = value;
    }

}
