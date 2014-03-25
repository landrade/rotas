
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
 *         &lt;element name="GetRouteTotalsBatchResult" type="{http://webservices.maplink2.com.br}ArrayOfRouteTotals" minOccurs="0"/>
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
    "getRouteTotalsBatchResult"
})
@XmlRootElement(name = "GetRouteTotalsBatchResponse")
public class GetRouteTotalsBatchResponse {

    @XmlElement(name = "GetRouteTotalsBatchResult")
    protected ArrayOfRouteTotals getRouteTotalsBatchResult;

    /**
     * Gets the value of the getRouteTotalsBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteTotals }
     *     
     */
    public ArrayOfRouteTotals getGetRouteTotalsBatchResult() {
        return getRouteTotalsBatchResult;
    }

    /**
     * Sets the value of the getRouteTotalsBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteTotals }
     *     
     */
    public void setGetRouteTotalsBatchResult(ArrayOfRouteTotals value) {
        this.getRouteTotalsBatchResult = value;
    }

}
