
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
 *         &lt;element name="getXYRadiusWithMapResult" type="{http://webservices.maplink2.com.br}MapInfo"/>
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
    "getXYRadiusWithMapResult"
})
@XmlRootElement(name = "getXYRadiusWithMapResponse")
public class GetXYRadiusWithMapResponse {

    @XmlElement(required = true)
    protected MapInfo getXYRadiusWithMapResult;

    /**
     * Gets the value of the getXYRadiusWithMapResult property.
     * 
     * @return
     *     possible object is
     *     {@link MapInfo }
     *     
     */
    public MapInfo getGetXYRadiusWithMapResult() {
        return getXYRadiusWithMapResult;
    }

    /**
     * Sets the value of the getXYRadiusWithMapResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapInfo }
     *     
     */
    public void setGetXYRadiusWithMapResult(MapInfo value) {
        this.getXYRadiusWithMapResult = value;
    }

}
