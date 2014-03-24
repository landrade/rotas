
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
 *         &lt;element name="cidade" type="{http://webservices.maplink2.com.br}City"/>
 *         &lt;element name="ao" type="{http://webservices.maplink2.com.br}AddressOptions"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cidade",
    "ao",
    "token"
})
@XmlRootElement(name = "findCity")
public class FindCity {

    @XmlElement(required = true)
    protected City cidade;
    @XmlElement(required = true)
    protected AddressOptions ao;
    protected String token;

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCidade(City value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the ao property.
     * 
     * @return
     *     possible object is
     *     {@link AddressOptions }
     *     
     */
    public AddressOptions getAo() {
        return ao;
    }

    /**
     * Sets the value of the ao property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressOptions }
     *     
     */
    public void setAo(AddressOptions value) {
        this.ao = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
