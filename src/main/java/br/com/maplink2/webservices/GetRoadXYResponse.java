
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
 *         &lt;element name="getRoadXYResult" type="{http://webservices.maplink2.com.br}Point"/>
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
    "getRoadXYResult"
})
@XmlRootElement(name = "getRoadXYResponse")
public class GetRoadXYResponse {

    @XmlElement(required = true)
    protected Point getRoadXYResult;

    /**
     * Gets the value of the getRoadXYResult property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getGetRoadXYResult() {
        return getRoadXYResult;
    }

    /**
     * Sets the value of the getRoadXYResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setGetRoadXYResult(Point value) {
        this.getRoadXYResult = value;
    }

}
