
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scaleBar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mapSize" type="{http://webservices.maplink2.com.br}MapSize"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapOptions", propOrder = {
    "scaleBar",
    "mapSize"
})
public class MapOptions {

    protected boolean scaleBar;
    @XmlElement(required = true)
    protected MapSize mapSize;

    /**
     * Gets the value of the scaleBar property.
     * 
     */
    public boolean isScaleBar() {
        return scaleBar;
    }

    /**
     * Sets the value of the scaleBar property.
     * 
     */
    public void setScaleBar(boolean value) {
        this.scaleBar = value;
    }

    /**
     * Gets the value of the mapSize property.
     * 
     * @return
     *     possible object is
     *     {@link MapSize }
     *     
     */
    public MapSize getMapSize() {
        return mapSize;
    }

    /**
     * Sets the value of the mapSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSize }
     *     
     */
    public void setMapSize(MapSize value) {
        this.mapSize = value;
    }

}
