
package br.com.maplink2.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRouteSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouteSummary" type="{http://webservices.maplink2.com.br}RouteSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteSummary", propOrder = {
    "routeSummary"
})
public class ArrayOfRouteSummary {

    @XmlElement(name = "RouteSummary")
    protected List<RouteSummary> routeSummary;

    /**
     * Gets the value of the routeSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteSummary }
     * 
     * 
     */
    public List<RouteSummary> getRouteSummary() {
        if (routeSummary == null) {
            routeSummary = new ArrayList<RouteSummary>();
        }
        return this.routeSummary;
    }

}
