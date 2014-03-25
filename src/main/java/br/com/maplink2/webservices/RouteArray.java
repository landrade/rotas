
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *         &lt;element name="Dest" type="{http://webservices.maplink2.com.br}RouteStop"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteArray", propOrder = {
    "origin",
    "dest"
})
public class RouteArray {

    @XmlElement(name = "Origin", required = true)
    protected RouteStop origin;
    @XmlElement(name = "Dest", required = true)
    protected RouteStop dest;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setOrigin(RouteStop value) {
        this.origin = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link RouteStop }
     *     
     */
    public RouteStop getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteStop }
     *     
     */
    public void setDest(RouteStop value) {
        this.dest = value;
    }

}
