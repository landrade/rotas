
package br.com.maplink2.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRouteStop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteStop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouteStop" type="{http://webservices.maplink2.com.br}RouteStop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteStop", propOrder = {
    "routeStop"
})
public class ArrayOfRouteStop {

    @XmlElement(name = "RouteStop")
    protected List<RouteStop> routeStop;

    /**
     * Gets the value of the routeStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteStop }
     * 
     * 
     */
    public List<RouteStop> getRouteStop() {
        if (routeStop == null) {
            routeStop = new ArrayList<RouteStop>();
        }
        return this.routeStop;
    }

}
