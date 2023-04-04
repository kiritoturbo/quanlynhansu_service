
package controller_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for nhanvien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nhanvien"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chucvu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chuyenmon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diachi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gioitinh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ngaysinh" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="phongban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tdHocvan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tenNv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nhanvien", propOrder = {
    "chucvu",
    "chuyenmon",
    "diachi",
    "email",
    "gioitinh",
    "maNv",
    "ngaysinh",
    "phongban",
    "sdt",
    "tdHocvan",
    "tenNv"
})
public class Nhanvien {

    protected String chucvu;
    protected String chuyenmon;
    protected String diachi;
    protected String email;
    protected String gioitinh;
    protected String maNv;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngaysinh;
    protected String phongban;
    protected String sdt;
    protected String tdHocvan;
    protected String tenNv;

    /**
     * Gets the value of the chucvu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChucvu() {
        return chucvu;
    }

    /**
     * Sets the value of the chucvu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChucvu(String value) {
        this.chucvu = value;
    }

    /**
     * Gets the value of the chuyenmon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChuyenmon() {
        return chuyenmon;
    }

    /**
     * Sets the value of the chuyenmon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChuyenmon(String value) {
        this.chuyenmon = value;
    }

    /**
     * Gets the value of the diachi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * Sets the value of the diachi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiachi(String value) {
        this.diachi = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the gioitinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGioitinh() {
        return gioitinh;
    }

    /**
     * Sets the value of the gioitinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGioitinh(String value) {
        this.gioitinh = value;
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
     * Gets the value of the ngaysinh property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaysinh() {
        return ngaysinh;
    }

    /**
     * Sets the value of the ngaysinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaysinh(XMLGregorianCalendar value) {
        this.ngaysinh = value;
    }

    /**
     * Gets the value of the phongban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhongban() {
        return phongban;
    }

    /**
     * Sets the value of the phongban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhongban(String value) {
        this.phongban = value;
    }

    /**
     * Gets the value of the sdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * Sets the value of the sdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdt(String value) {
        this.sdt = value;
    }

    /**
     * Gets the value of the tdHocvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdHocvan() {
        return tdHocvan;
    }

    /**
     * Sets the value of the tdHocvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdHocvan(String value) {
        this.tdHocvan = value;
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

}
