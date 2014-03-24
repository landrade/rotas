
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
 *         &lt;element name="findPOIResult" type="{http://webservices.maplink2.com.br}POIInfo"/>
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
    "findPOIResult"
})
@XmlRootElement(name = "findPOIResponse")
public class FindPOIResponse {

    @XmlElement(required = true)
    protected POIInfo findPOIResult;

    /**
     * Gets the value of the findPOIResult property.
     * 
     * @return
     *     possible object is
     *     {@link POIInfo }
     *     
     */
    public POIInfo getFindPOIResult() {
        return findPOIResult;
    }

    /**
     * Sets the value of the findPOIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIInfo }
     *     
     */
    public void setFindPOIResult(POIInfo value) {
        this.findPOIResult = value;
    }

}
