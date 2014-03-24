
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="road" type="{http://webservices.maplink2.com.br}Road"/>
 *         &lt;element name="roadDetail" type="{http://webservices.maplink2.com.br}RoadDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadLocation", propOrder = {
    "road",
    "roadDetail"
})
public class RoadLocation {

    @XmlElement(required = true)
    protected Road road;
    @XmlElement(required = true)
    protected RoadDetail roadDetail;

    /**
     * Gets the value of the road property.
     * 
     * @return
     *     possible object is
     *     {@link Road }
     *     
     */
    public Road getRoad() {
        return road;
    }

    /**
     * Sets the value of the road property.
     * 
     * @param value
     *     allowed object is
     *     {@link Road }
     *     
     */
    public void setRoad(Road value) {
        this.road = value;
    }

    /**
     * Gets the value of the roadDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RoadDetail }
     *     
     */
    public RoadDetail getRoadDetail() {
        return roadDetail;
    }

    /**
     * Sets the value of the roadDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadDetail }
     *     
     */
    public void setRoadDetail(RoadDetail value) {
        this.roadDetail = value;
    }

}
