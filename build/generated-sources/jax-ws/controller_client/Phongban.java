
package controller_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phongban complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phongban"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maPb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sdt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tenPb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phongban", propOrder = {
    "maPb",
    "sdt",
    "tenPb"
})
public class Phongban {

    protected String maPb;
    protected int sdt;
    protected String tenPb;

    /**
     * Gets the value of the maPb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaPb() {
        return maPb;
    }

    /**
     * Sets the value of the maPb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaPb(String value) {
        this.maPb = value;
    }

    /**
     * Gets the value of the sdt property.
     * 
     */
    public int getSdt() {
        return sdt;
    }

    /**
     * Sets the value of the sdt property.
     * 
     */
    public void setSdt(int value) {
        this.sdt = value;
    }

    /**
     * Gets the value of the tenPb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenPb() {
        return tenPb;
    }

    /**
     * Sets the value of the tenPb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenPb(String value) {
        this.tenPb = value;
    }

}
