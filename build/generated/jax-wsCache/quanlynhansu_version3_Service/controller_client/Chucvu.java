
package controller_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chucvu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chucvu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ghichu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maCv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tenCv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chucvu", propOrder = {
    "ghichu",
    "maCv",
    "tenCv"
})
public class Chucvu {

    protected String ghichu;
    protected String maCv;
    protected String tenCv;

    /**
     * Gets the value of the ghichu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhichu() {
        return ghichu;
    }

    /**
     * Sets the value of the ghichu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhichu(String value) {
        this.ghichu = value;
    }

    /**
     * Gets the value of the maCv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaCv() {
        return maCv;
    }

    /**
     * Sets the value of the maCv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaCv(String value) {
        this.maCv = value;
    }

    /**
     * Gets the value of the tenCv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenCv() {
        return tenCv;
    }

    /**
     * Sets the value of the tenCv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenCv(String value) {
        this.tenCv = value;
    }

}
