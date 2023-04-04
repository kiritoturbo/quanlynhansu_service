
package controller_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tinhluong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tinhluong"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="luongCb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="songaylam" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tenNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thuong" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tongTien" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tinhluong", propOrder = {
    "luongCb",
    "maNv",
    "songaylam",
    "tenNv",
    "thuong",
    "tongTien"
})
public class Tinhluong {

    protected int luongCb;
    protected String maNv;
    protected double songaylam;
    protected String tenNv;
    protected double thuong;
    protected double tongTien;

    /**
     * Gets the value of the luongCb property.
     * 
     */
    public int getLuongCb() {
        return luongCb;
    }

    /**
     * Sets the value of the luongCb property.
     * 
     */
    public void setLuongCb(int value) {
        this.luongCb = value;
    }

    /**
     * Gets the value of the maNv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaNv() {
        return maNv;
    }

    /**
     * Sets the value of the maNv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaNv(String value) {
        this.maNv = value;
    }

    /**
     * Gets the value of the songaylam property.
     * 
     */
    public double getSongaylam() {
        return songaylam;
    }

    /**
     * Sets the value of the songaylam property.
     * 
     */
    public void setSongaylam(double value) {
        this.songaylam = value;
    }

    /**
     * Gets the value of the tenNv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenNv() {
        return tenNv;
    }

    /**
     * Sets the value of the tenNv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenNv(String value) {
        this.tenNv = value;
    }

    /**
     * Gets the value of the thuong property.
     * 
     */
    public double getThuong() {
        return thuong;
    }

    /**
     * Sets the value of the thuong property.
     * 
     */
    public void setThuong(double value) {
        this.thuong = value;
    }

    /**
     * Gets the value of the tongTien property.
     * 
     */
    public double getTongTien() {
        return tongTien;
    }

    /**
     * Sets the value of the tongTien property.
     * 
     */
    public void setTongTien(double value) {
        this.tongTien = value;
    }

}
