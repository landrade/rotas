
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleRouteTotals" type="{http://webservices.maplink2.com.br}ArrayOfSingleRouteTotals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRoute", propOrder = {
    "singleRouteTotals"
})
public class MultiRoute {

    protected ArrayOfSingleRouteTotals singleRouteTotals;

    /**
     * Gets the value of the singleRouteTotals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSingleRouteTotals }
     *     
     */
    public ArrayOfSingleRouteTotals getSingleRouteTotals() {
        return singleRouteTotals;
    }

    /**
     * Sets the value of the singleRouteTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSingleRouteTotals }
     *     
     */
    public void setSingleRouteTotals(ArrayOfSingleRouteTotals value) {
        this.singleRouteTotals = value;
    }

}
