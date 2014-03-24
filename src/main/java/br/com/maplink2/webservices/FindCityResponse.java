
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
 *         &lt;element name="findCityResult" type="{http://webservices.maplink2.com.br}CityLocationInfo"/>
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
    "findCityResult"
})
@XmlRootElement(name = "findCityResponse")
public class FindCityResponse {

    @XmlElement(required = true)
    protected CityLocationInfo findCityResult;

    /**
     * Gets the value of the findCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link CityLocationInfo }
     *     
     */
    public CityLocationInfo getFindCityResult() {
        return findCityResult;
    }

    /**
     * Sets the value of the findCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityLocationInfo }
     *     
     */
    public void setFindCityResult(CityLocationInfo value) {
        this.findCityResult = value;
    }

}
