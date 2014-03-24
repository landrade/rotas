
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
 *         &lt;element name="getAddressResult" type="{http://webservices.maplink2.com.br}AddressLocation"/>
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
    "getAddressResult"
})
@XmlRootElement(name = "getAddressResponse")
public class GetAddressResponse {

    @XmlElement(required = true)
    protected AddressLocation getAddressResult;

    /**
     * Gets the value of the getAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLocation }
     *     
     */
    public AddressLocation getGetAddressResult() {
        return getAddressResult;
    }

    /**
     * Sets the value of the getAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLocation }
     *     
     */
    public void setGetAddressResult(AddressLocation value) {
        this.getAddressResult = value;
    }

}
