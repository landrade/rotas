
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFuelUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totaltollFeeCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalfuelCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxiFare1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="taxiFare2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteTotals", propOrder = {
    "totalDistance",
    "totalTime",
    "totalFuelUsed",
    "totaltollFeeCost",
    "totalfuelCost",
    "totalCost",
    "taxiFare1",
    "taxiFare2"
})
public class RouteTotals {

    protected double totalDistance;
    protected String totalTime;
    protected double totalFuelUsed;
    protected double totaltollFeeCost;
    protected double totalfuelCost;
    protected double totalCost;
    protected double taxiFare1;
    protected double taxiFare2;

    /**
     * Gets the value of the totalDistance property.
     * 
     */
    public double getTotalDistance() {
        return totalDistance;
    }

    /**
     * Sets the value of the totalDistance property.
     * 
     */
    public void setTotalDistance(double value) {
        this.totalDistance = value;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTime(String value) {
        this.totalTime = value;
    }

    /**
     * Gets the value of the totalFuelUsed property.
     * 
     */
    public double getTotalFuelUsed() {
        return totalFuelUsed;
    }

    /**
     * Sets the value of the totalFuelUsed property.
     * 
     */
    public void setTotalFuelUsed(double value) {
        this.totalFuelUsed = value;
    }

    /**
     * Gets the value of the totaltollFeeCost property.
     * 
     */
    public double getTotaltollFeeCost() {
        return totaltollFeeCost;
    }

    /**
     * Sets the value of the totaltollFeeCost property.
     * 
     */
    public void setTotaltollFeeCost(double value) {
        this.totaltollFeeCost = value;
    }

    /**
     * Gets the value of the totalfuelCost property.
     * 
     */
    public double getTotalfuelCost() {
        return totalfuelCost;
    }

    /**
     * Sets the value of the totalfuelCost property.
     * 
     */
    public void setTotalfuelCost(double value) {
        this.totalfuelCost = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     */
    public void setTotalCost(double value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the taxiFare1 property.
     * 
     */
    public double getTaxiFare1() {
        return taxiFare1;
    }

    /**
     * Sets the value of the taxiFare1 property.
     * 
     */
    public void setTaxiFare1(double value) {
        this.taxiFare1 = value;
    }

    /**
     * Gets the value of the taxiFare2 property.
     * 
     */
    public double getTaxiFare2() {
        return taxiFare2;
    }

    /**
     * Sets the value of the taxiFare2 property.
     * 
     */
    public void setTaxiFare2(double value) {
        this.taxiFare2 = value;
    }

}
