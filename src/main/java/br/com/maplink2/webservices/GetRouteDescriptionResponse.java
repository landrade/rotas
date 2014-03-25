
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getRouteDescriptionResult" type="{http://webservices.maplink2.com.br}ArrayOfSegmentDescription" minOccurs="0"/>
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
    "getRouteDescriptionResult"
})
@XmlRootElement(name = "getRouteDescriptionResponse")
public class GetRouteDescriptionResponse {

    protected ArrayOfSegmentDescription getRouteDescriptionResult;

    /**
     * Gets the value of the getRouteDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public ArrayOfSegmentDescription getGetRouteDescriptionResult() {
        return getRouteDescriptionResult;
    }

    /**
     * Sets the value of the getRouteDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public void setGetRouteDescriptionResult(ArrayOfSegmentDescription value) {
        this.getRouteDescriptionResult = value;
    }

}
