
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tankCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="averageConsumption" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fuelPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="averageSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tollFeeCat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "tankCapacity",
    "averageConsumption",
    "fuelPrice",
    "averageSpeed",
    "tollFeeCat"
})
public class Vehicle {

    protected int tankCapacity;
    protected float averageConsumption;
    protected double fuelPrice;
    protected int averageSpeed;
    protected int tollFeeCat;

    /**
     * Gets the value of the tankCapacity property.
     * 
     */
    public int getTankCapacity() {
        return tankCapacity;
    }

    /**
     * Sets the value of the tankCapacity property.
     * 
     */
    public void setTankCapacity(int value) {
        this.tankCapacity = value;
    }

    /**
     * Gets the value of the averageConsumption property.
     * 
     */
    public float getAverageConsumption() {
        return averageConsumption;
    }

    /**
     * Sets the value of the averageConsumption property.
     * 
     */
    public void setAverageConsumption(float value) {
        this.averageConsumption = value;
    }

    /**
     * Gets the value of the fuelPrice property.
     * 
     */
    public double getFuelPrice() {
        return fuelPrice;
    }

    /**
     * Sets the value of the fuelPrice property.
     * 
     */
    public void setFuelPrice(double value) {
        this.fuelPrice = value;
    }

    /**
     * Gets the value of the averageSpeed property.
     * 
     */
    public int getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Sets the value of the averageSpeed property.
     * 
     */
    public void setAverageSpeed(int value) {
        this.averageSpeed = value;
    }

    /**
     * Gets the value of the tollFeeCat property.
     * 
     */
    public int getTollFeeCat() {
        return tollFeeCat;
    }

    /**
     * Sets the value of the tollFeeCat property.
     * 
     */
    public void setTollFeeCat(int value) {
        this.tollFeeCat = value;
    }

}
