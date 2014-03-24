
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="findDistrictResult" type="{http://webservices.maplink2.com.br}DistrictInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "findDistrictResult"
})
@XmlRootElement(name = "findDistrictResponse")
public class FindDistrictResponse {

    @XmlElement(required = true)
    protected DistrictInfo findDistrictResult;

    /**
     * Gets the value of the findDistrictResult property.
     * 
     * @return
     *     possible object is
     *     {@link DistrictInfo }
     *     
     */
    public DistrictInfo getFindDistrictResult() {
        return findDistrictResult;
    }

    /**
     * Sets the value of the findDistrictResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictInfo }
     *     
     */
    public void setFindDistrictResult(DistrictInfo value) {
        this.findDistrictResult = value;
    }

}
