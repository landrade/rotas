
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
 *         &lt;element name="getXYResult" type="{http://webservices.maplink2.com.br}Point"/>
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
    "getXYResult"
})
@XmlRootElement(name = "getXYResponse")
public class GetXYResponse {

    @XmlElement(required = true)
    protected Point getXYResult;

    /**
     * Gets the value of the getXYResult property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getGetXYResult() {
        return getXYResult;
    }

    /**
     * Sets the value of the getXYResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setGetXYResult(Point value) {
        this.getXYResult = value;
    }

}
