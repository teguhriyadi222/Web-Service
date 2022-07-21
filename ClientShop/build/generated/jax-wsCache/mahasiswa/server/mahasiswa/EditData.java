
package server.mahasiswa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nim" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jurusan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontak" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editData", propOrder = {
    "nim",
    "nama",
    "jurusan",
    "alamat",
    "kontak"
})
public class EditData {

    protected int nim;
    protected String nama;
    protected String jurusan;
    protected String alamat;
    protected int kontak;

    /**
     * Gets the value of the nim property.
     * 
     */
    public int getNim() {
        return nim;
    }

    /**
     * Sets the value of the nim property.
     * 
     */
    public void setNim(int value) {
        this.nim = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the jurusan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * Sets the value of the jurusan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurusan(String value) {
        this.jurusan = value;
    }

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
    }

    /**
     * Gets the value of the kontak property.
     * 
     */
    public int getKontak() {
        return kontak;
    }

    /**
     * Sets the value of the kontak property.
     * 
     */
    public void setKontak(int value) {
        this.kontak = value;
    }

}
