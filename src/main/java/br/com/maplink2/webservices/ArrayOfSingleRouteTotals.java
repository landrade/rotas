
package br.com.maplink2.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSingleRouteTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSingleRouteTotals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SingleRouteTotals" type="{http://webservices.maplink2.com.br}SingleRouteTotals" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSingleRouteTotals", propOrder = {
    "singleRouteTotals"
})
public class ArrayOfSingleRouteTotals {

    @XmlElement(name = "SingleRouteTotals")
    protected List<SingleRouteTotals> singleRouteTotals;

    /**
     * Gets the value of the singleRouteTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleRouteTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleRouteTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleRouteTotals }
     * 
     * 
     */
    public List<SingleRouteTotals> getSingleRouteTotals() {
        if (singleRouteTotals == null) {
            singleRouteTotals = new ArrayList<SingleRouteTotals>();
        }
        return this.singleRouteTotals;
    }

}
