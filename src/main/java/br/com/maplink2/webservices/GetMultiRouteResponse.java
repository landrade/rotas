
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
 *         &lt;element name="getMultiRouteResult" type="{http://webservices.maplink2.com.br}MultiRoute"/>
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
    "getMultiRouteResult"
})
@XmlRootElement(name = "getMultiRouteResponse")
public class GetMultiRouteResponse {

    @XmlElement(required = true)
    protected MultiRoute getMultiRouteResult;

    /**
     * Gets the value of the getMultiRouteResult property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRoute }
     *     
     */
    public MultiRoute getGetMultiRouteResult() {
        return getMultiRouteResult;
    }

    /**
     * Sets the value of the getMultiRouteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRoute }
     *     
     */
    public void setGetMultiRouteResult(MultiRoute value) {
        this.getMultiRouteResult = value;
    }

}
