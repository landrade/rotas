
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
 *         &lt;element name="findRoadResult" type="{http://webservices.maplink2.com.br}RoadInfo"/>
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
    "findRoadResult"
})
@XmlRootElement(name = "findRoadResponse")
public class FindRoadResponse {

    @XmlElement(required = true)
    protected RoadInfo findRoadResult;

    /**
     * Gets the value of the findRoadResult property.
     * 
     * @return
     *     possible object is
     *     {@link RoadInfo }
     *     
     */
    public RoadInfo getFindRoadResult() {
        return findRoadResult;
    }

    /**
     * Sets the value of the findRoadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadInfo }
     *     
     */
    public void setFindRoadResult(RoadInfo value) {
        this.findRoadResult = value;
    }

}
