
package server.mahasiswa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for urutkanData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="urutkanData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sortir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urutkanData", propOrder = {
    "sortir"
})
public class UrutkanData {

    protected String sortir;

    /**
     * Gets the value of the sortir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortir() {
        return sortir;
    }

    /**
     * Sets the value of the sortir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortir(String value) {
        this.sortir = value;
    }

}
