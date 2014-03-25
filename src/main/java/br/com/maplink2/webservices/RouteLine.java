
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RGB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transparency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLine", propOrder = {
    "width",
    "rgb",
    "transparency"
})
public class RouteLine {

    protected int width;
    @XmlElement(name = "RGB")
    protected String rgb;
    protected double transparency;

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the rgb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRGB() {
        return rgb;
    }

    /**
     * Sets the value of the rgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRGB(String value) {
        this.rgb = value;
    }

    /**
     * Gets the value of the transparency property.
     * 
     */
    public double getTransparency() {
        return transparency;
    }

    /**
     * Sets the value of the transparency property.
     * 
     */
    public void setTransparency(double value) {
        this.transparency = value;
    }

}
