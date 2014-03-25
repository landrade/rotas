
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="twoLaneHighway" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="secondLaneUnderConstruction" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="oneLaneRoadway" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pavingWorkInProgress" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dirtRoad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="roadwayInPoorConditions" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ferry" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadType", propOrder = {
    "twoLaneHighway",
    "secondLaneUnderConstruction",
    "oneLaneRoadway",
    "pavingWorkInProgress",
    "dirtRoad",
    "roadwayInPoorConditions",
    "ferry"
})
public class RoadType {

    protected double twoLaneHighway;
    protected double secondLaneUnderConstruction;
    protected double oneLaneRoadway;
    protected double pavingWorkInProgress;
    protected double dirtRoad;
    protected double roadwayInPoorConditions;
    protected double ferry;

    /**
     * Gets the value of the twoLaneHighway property.
     * 
     */
    public double getTwoLaneHighway() {
        return twoLaneHighway;
    }

    /**
     * Sets the value of the twoLaneHighway property.
     * 
     */
    public void setTwoLaneHighway(double value) {
        this.twoLaneHighway = value;
    }

    /**
     * Gets the value of the secondLaneUnderConstruction property.
     * 
     */
    public double getSecondLaneUnderConstruction() {
        return secondLaneUnderConstruction;
    }

    /**
     * Sets the value of the secondLaneUnderConstruction property.
     * 
     */
    public void setSecondLaneUnderConstruction(double value) {
        this.secondLaneUnderConstruction = value;
    }

    /**
     * Gets the value of the oneLaneRoadway property.
     * 
     */
    public double getOneLaneRoadway() {
        return oneLaneRoadway;
    }

    /**
     * Sets the value of the oneLaneRoadway property.
     * 
     */
    public void setOneLaneRoadway(double value) {
        this.oneLaneRoadway = value;
    }

    /**
     * Gets the value of the pavingWorkInProgress property.
     * 
     */
    public double getPavingWorkInProgress() {
        return pavingWorkInProgress;
    }

    /**
     * Sets the value of the pavingWorkInProgress property.
     * 
     */
    public void setPavingWorkInProgress(double value) {
        this.pavingWorkInProgress = value;
    }

    /**
     * Gets the value of the dirtRoad property.
     * 
     */
    public double getDirtRoad() {
        return dirtRoad;
    }

    /**
     * Sets the value of the dirtRoad property.
     * 
     */
    public void setDirtRoad(double value) {
        this.dirtRoad = value;
    }

    /**
     * Gets the value of the roadwayInPoorConditions property.
     * 
     */
    public double getRoadwayInPoorConditions() {
        return roadwayInPoorConditions;
    }

    /**
     * Sets the value of the roadwayInPoorConditions property.
     * 
     */
    public void setRoadwayInPoorConditions(double value) {
        this.roadwayInPoorConditions = value;
    }

    /**
     * Gets the value of the ferry property.
     * 
     */
    public double getFerry() {
        return ferry;
    }

    /**
     * Sets the value of the ferry property.
     * 
     */
    public void setFerry(double value) {
        this.ferry = value;
    }

}
