
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Extent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="YMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="XMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="YMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extent", propOrder = {
    "xMin",
    "yMin",
    "xMax",
    "yMax"
})
public class Extent {

    @XmlElement(name = "XMin")
    protected double xMin;
    @XmlElement(name = "YMin")
    protected double yMin;
    @XmlElement(name = "XMax")
    protected double xMax;
    @XmlElement(name = "YMax")
    protected double yMax;

    /**
     * Gets the value of the xMin property.
     * 
     */
    public double getXMin() {
        return xMin;
    }

    /**
     * Sets the value of the xMin property.
     * 
     */
    public void setXMin(double value) {
        this.xMin = value;
    }

    /**
     * Gets the value of the yMin property.
     * 
     */
    public double getYMin() {
        return yMin;
    }

    /**
     * Sets the value of the yMin property.
     * 
     */
    public void setYMin(double value) {
        this.yMin = value;
    }

    /**
     * Gets the value of the xMax property.
     * 
     */
    public double getXMax() {
        return xMax;
    }

    /**
     * Sets the value of the xMax property.
     * 
     */
    public void setXMax(double value) {
        this.xMax = value;
    }

    /**
     * Gets the value of the yMax property.
     * 
     */
    public double getYMax() {
        return yMax;
    }

    /**
     * Sets the value of the yMax property.
     * 
     */
    public void setYMax(double value) {
        this.yMax = value;
    }

}
