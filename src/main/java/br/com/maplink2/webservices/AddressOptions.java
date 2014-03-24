
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usePhonetic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultRange" type="{http://webservices.maplink2.com.br}ResultRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressOptions", propOrder = {
    "usePhonetic",
    "searchType",
    "resultRange"
})
public class AddressOptions {

    protected boolean usePhonetic;
    protected int searchType;
    @XmlElement(required = true)
    protected ResultRange resultRange;

    /**
     * Gets the value of the usePhonetic property.
     * 
     */
    public boolean isUsePhonetic() {
        return usePhonetic;
    }

    /**
     * Sets the value of the usePhonetic property.
     * 
     */
    public void setUsePhonetic(boolean value) {
        this.usePhonetic = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     */
    public int getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     */
    public void setSearchType(int value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the resultRange property.
     * 
     * @return
     *     possible object is
     *     {@link ResultRange }
     *     
     */
    public ResultRange getResultRange() {
        return resultRange;
    }

    /**
     * Sets the value of the resultRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultRange }
     *     
     */
    public void setResultRange(ResultRange value) {
        this.resultRange = value;
    }

}
