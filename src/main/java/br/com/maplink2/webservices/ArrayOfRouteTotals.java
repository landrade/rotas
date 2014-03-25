
package br.com.maplink2.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRouteTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRouteTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RouteTotals" type="{http://webservices.maplink2.com.br}RouteTotals" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRouteTotals", propOrder = {
    "routeTotals"
})
public class ArrayOfRouteTotals {

    @XmlElement(name = "RouteTotals")
    protected List<RouteTotals> routeTotals;

    /**
     * Gets the value of the routeTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteTotals }
     * 
     * 
     */
    public List<RouteTotals> getRouteTotals() {
        if (routeTotals == null) {
            routeTotals = new ArrayList<RouteTotals>();
        }
        return this.routeTotals;
    }

}
