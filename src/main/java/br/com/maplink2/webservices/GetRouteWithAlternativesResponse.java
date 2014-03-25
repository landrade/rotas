
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
 *         &lt;element name="getRouteWithAlternativesResult" type="{http://webservices.maplink2.com.br}AlternativeRouteInfo"/>
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
    "getRouteWithAlternativesResult"
})
@XmlRootElement(name = "getRouteWithAlternativesResponse")
public class GetRouteWithAlternativesResponse {

    @XmlElement(required = true)
    protected AlternativeRouteInfo getRouteWithAlternativesResult;

    /**
     * Gets the value of the getRouteWithAlternativesResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeRouteInfo }
     *     
     */
    public AlternativeRouteInfo getGetRouteWithAlternativesResult() {
        return getRouteWithAlternativesResult;
    }

    /**
     * Sets the value of the getRouteWithAlternativesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeRouteInfo }
     *     
     */
    public void setGetRouteWithAlternativesResult(AlternativeRouteInfo value) {
        this.getRouteWithAlternativesResult = value;
    }

}
