
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
 *         &lt;element name="getRouteTotalsResult" type="{http://webservices.maplink2.com.br}RouteTotals"/>
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
    "getRouteTotalsResult"
})
@XmlRootElement(name = "getRouteTotalsResponse")
public class GetRouteTotalsResponse {

    @XmlElement(required = true)
    protected RouteTotals getRouteTotalsResult;

    /**
     * Gets the value of the getRouteTotalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link RouteTotals }
     *     
     */
    public RouteTotals getGetRouteTotalsResult() {
        return getRouteTotalsResult;
    }

    /**
     * Sets the value of the getRouteTotalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTotals }
     *     
     */
    public void setGetRouteTotalsResult(RouteTotals value) {
        this.getRouteTotalsResult = value;
    }

}
