/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ent.Chucvu;
import ent.Chuyenmon;
import ent.Dangnhap;
import ent.Nhanvien;
import ent.Phongban;
import ent.Tinhluong;
import ent.Trinhdohocvan;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author MANH TRUONG
 */
@WebService(serviceName = "quanlynhansu_version3_Service")
public class quanlynhansu_version3_Service {

//    @WebMethod
//    public List<Dangnhap> loginfindAll() {
//        Dangnhap user = null;
//        //open connection to database
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        Query q = em.createNamedQuery("Dangnhap.findAll", Dangnhap.class);
//        return q.getResultList();
//    }
//
//    @WebMethod
//    public Dangnhap login(String username, String password) {
//        Dangnhap user = null;
//        //open connection to database
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        Query q = em.createNamedQuery("Dangnhap.login", Dangnhap.class);
//        q.setParameter("user", username);
//        q.setParameter("password", password);
//        List<Dangnhap> list = q.getResultList();
//        if (list.size() > 0) {
//
//            return list.get(0);
//        } else {
//            return null;
//        }
//    }
//
//    ////form nhân viên ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @WebMethod(operationName = "addNhanvien")
//    public String addNhanvien(String manv, String tennv, String phongban, String chucvu, String tdhocvan, String chuyenmon, Date ngaysinh, String gioitinh, String diachi, String sdt, String email) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        if (manv.equals("") || tennv.equals("") || phongban.equals("") || chucvu.equals("") || tdhocvan.equals("") || diachi.equals("") || sdt.equals("") || email.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Nhanvien std = new Nhanvien();
//            std.setMaNv(manv);
//            std.setTenNv(tennv);
//            std.setPhongban(phongban);
//            std.setChucvu(chucvu);
//            std.setTdHocvan(tdhocvan);
//            std.setChuyenmon(chuyenmon);
//            std.setNgaysinh(ngaysinh);
//            std.setGioitinh(gioitinh);
//            std.setDiachi(diachi);
//            std.setSdt(sdt);
//            std.setEmail(email);
//
//            em.getTransaction().begin();
//            em.persist(std);
//            em.getTransaction().commit();
//            return "Thêm thành công";
//        } catch (Exception e) {
//            return "trùng mã thêm";
//        }
//
//    }
//
//    @WebMethod
//    public String updateNhanvien(String manv, String tennv, String phongban, String chucvu, String tdhocvan, String chuyenmon, Date ngaysinh, String gioitinh, String diachi, String sdt, String email) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (manv.equals("") || tennv.equals("") || phongban.equals("") || chucvu.equals("") || tdhocvan.equals("") || diachi.equals("") || sdt.equals("") || email.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Nhanvien std = em.find(Nhanvien.class, manv);
//
//            em.getTransaction().begin();
//            std.setMaNv(manv);
//            std.setTenNv(tennv);
//            std.setPhongban(phongban);
//            std.setChucvu(chucvu);
//            std.setTdHocvan(tdhocvan);
//            std.setChuyenmon(chuyenmon);
//            std.setNgaysinh(ngaysinh);
//            std.setGioitinh(gioitinh);
//            std.setDiachi(diachi);
//            std.setSdt(sdt);
//            std.setEmail(email);
//            em.getTransaction().commit();
//            return "Sửa thành công ";
//        } catch (Exception e) {
//            return "Trùng mã sửa";
//        }
//
//    }
//
//    @WebMethod
//    public List<Nhanvien> findAllNhanvien() {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //query :tạo câu truy vấn 
//        Query q = em.createNamedQuery("Nhanvien.findAll", Nhanvien.class);
//
//        return q.getResultList();
//
//    }
//
//    @WebMethod
//    public String deleteNhanvien(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (rollNumber.equals("")) {
//            return "Không được để trống";
//        }
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Nhanvien stdFind = em.find(Nhanvien.class, rollNumber);
//        em.getTransaction().begin();
//        em.remove(stdFind);
//        em.getTransaction().commit();
//        return "Xóa thành công";
//    }
//
//    @WebMethod
//    public Nhanvien findNhanvien(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Nhanvien stdFind = em.find(Nhanvien.class, rollNumber);
//
//        return stdFind;
//    }
//
//    ////form chức vụ  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @WebMethod
//    public List<Chucvu> findAllChucvu() {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //query :tạo câu truy vấn 
//        Query q = em.createNamedQuery("Chucvu.findAll", Chucvu.class);
//
//        return q.getResultList();
//
//    }
//    //insert and update
//
//    @WebMethod(operationName = "addChucvu")
//    public String addChucvu(String maChucVu, String tenChucVu, String ghichu) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maChucVu.equals("") || tenChucVu.equals("") || ghichu.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Chucvu std = new Chucvu();
//            std.setMaCv(maChucVu);
//            std.setTenCv(tenChucVu);
//            std.setGhichu(ghichu);
//            em.getTransaction().begin();
//            em.persist(std);
//            em.getTransaction().commit();
//            return "Thêm thành công";
//        } catch (Exception e) {
//            return "Trùng mã thêm";
//        }
//
//    }
//
//    @WebMethod
//    public String updateChucvu(String maChucVu, String tenChucVu, String ghichu) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maChucVu.equals("") || tenChucVu.equals("") || ghichu.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Chucvu std = em.find(Chucvu.class, maChucVu);
//            em.getTransaction().begin();
//            std.setMaCv(maChucVu);
//            std.setTenCv(tenChucVu);
//            std.setGhichu(ghichu);
//            em.getTransaction().commit();
//            return "Sửa thành công ";
//        } catch (Exception e) {
//            return "Trùng mã sửa";
//        }
//
//    }
//
//    @WebMethod
//    public String deleteChucvu(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (rollNumber.equals("")) {
//            return "Không được để trống";
//        }
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Chucvu stdFind = em.find(Chucvu.class, rollNumber);
//        em.getTransaction().begin();
//        em.remove(stdFind);
//        em.getTransaction().commit();
//        return "Xóa thành công ";
//    }
//
//    @WebMethod
//    public Chucvu findChucvu(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Chucvu stdFind = em.find(Chucvu.class, rollNumber);
//
//        return stdFind;
//    }
//
//    ////form Chuyên môn  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @WebMethod
//    public List<Chuyenmon> findAllChuyenmon() {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //query :tạo câu truy vấn 
//        Query q = em.createNamedQuery("Chuyenmon.findAll", Chuyenmon.class);
//
//        return q.getResultList();
//
//    }
//
//    //insert and update
//    @WebMethod(operationName = "addChuyenmon")
//    public String addChuyenmon(String maChuyenMon, String tenChuyenMon) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maChuyenMon.equals("") || tenChuyenMon.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Chuyenmon std = new Chuyenmon();
//            std.setMaCm(maChuyenMon);
//            std.setTenCm(tenChuyenMon);
//            em.getTransaction().begin();
//            em.persist(std);
//            em.getTransaction().commit();
//            return "Thêm thành công";
//        } catch (Exception e) {
//            return "Trùng mã thêm";
//        }
//
//    }
//
//    @WebMethod
//    public String updateChuyenmon(String maChuyenMon, String tenChuyenMon) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maChuyenMon.equals("") || tenChuyenMon.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Chuyenmon std = em.find(Chuyenmon.class, maChuyenMon);
//
//            em.getTransaction().begin();
//            std.setMaCm(maChuyenMon);
//            std.setTenCm(tenChuyenMon);
//            em.getTransaction().commit();
//            return "Sửa thành công";
//        } catch (Exception e) {
//            return "Trùng mã sửa";
//        }
//
//    }
//
//    @WebMethod
//    public String deleteChuyenmon(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (rollNumber.equals("")) {
//            return "Không được để trống";
//        }
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Chuyenmon stdFind = em.find(Chuyenmon.class, rollNumber);
//        em.getTransaction().begin();
//        em.remove(stdFind);
//        em.getTransaction().commit();
//        return "Xóa thành công";
//    }
//
//    @WebMethod
//    public Chuyenmon findChuyenmon(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Chuyenmon stdFind = em.find(Chuyenmon.class, rollNumber);
//
//        return stdFind;
//    }
//
//    ////form luong ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @WebMethod
//    public List<Tinhluong> findAllLuong() {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //query :tạo câu truy vấn 
//        Query q = em.createNamedQuery("Tinhluong.findAll", Tinhluong.class);
//
//        return q.getResultList();
//
//    }
//
//    //insert and update
//    @WebMethod(operationName = "addLuong")
//    public String addLuong(String maNhanVien, String tenNhanVien, int luongcb, double songaylam, double thuong) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maNhanVien.equals("") || tenNhanVien.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Tinhluong std = new Tinhluong();
//            std.setMaNv(maNhanVien);
//            std.setTenNv(tenNhanVien);
//            std.setLuongCb(luongcb);
//            std.setSongaylam(songaylam);
//            std.setThuong(thuong);
//            std.setTongTien(luongcb*songaylam+thuong);
//
//            em.getTransaction().begin();
//            em.persist(std);
//            em.getTransaction().commit();
//            return "Thêm thành công";
//        } catch (Exception e) {
//            return "Trùng mã thêm";
//        }
//
//    }
//
//    @WebMethod
//    public String updateLuong(String maNhanVien, String tenNhanVien, int luongcb, double songaylam, double thuong) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        Tinhluong std = em.find(Tinhluong.class, maNhanVien);
//        if (maNhanVien.equals("") || tenNhanVien.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            em.getTransaction().begin();
//            std.setMaNv(maNhanVien);
//            std.setTenNv(tenNhanVien);
//            std.setLuongCb(luongcb);
//            std.setSongaylam(songaylam);
//            std.setThuong(thuong);
//            std.setTongTien(luongcb*songaylam+thuong);
//            em.getTransaction().commit();
//            return "Sửa thành công";
//        } catch (Exception e) {
//            return "Trùng mã sửa";
//        }
//
//    }
//
//    @WebMethod
//    public String deleteLuong(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (rollNumber.equals("")) {
//            return "Không được để trống";
//        }
//
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Tinhluong stdFind = em.find(Tinhluong.class, rollNumber);
//        em.getTransaction().begin();
//        em.remove(stdFind);
//        em.getTransaction().commit();
//        return "Xóa thành công";
//    }
//
//    @WebMethod
//    public Tinhluong findLuong(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Tinhluong stdFind = em.find(Tinhluong.class, rollNumber);
//
//        return stdFind;
//    }
//
//    ////form phòng ban////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @WebMethod
//    public List<Phongban> findAllPhongban() {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //query :tạo câu truy vấn 
//        Query q = em.createNamedQuery("Phongban.findAll", Phongban.class);
//
//        return q.getResultList();
//
//    }
//
//    //insert and update 
//    @WebMethod(operationName = "addPhongban")
//    public String addPhongban(String maPhongBan, String tenPhongBan, int sdt) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maPhongBan.equals("") || tenPhongBan.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Phongban std = new Phongban();
//            std.setMaPb(maPhongBan);
//            std.setTenPb(tenPhongBan);
//            std.setSdt(sdt);
//            em.getTransaction().begin();
//            em.persist(std);
//            em.getTransaction().commit();
//            return "Thêm thành công";
//        } catch (Exception e) {
//            return "Trùng mã thêm";
//        }
//
//    }
//
//    @WebMethod
//    public String updatePhongban(String maPhongBan, String tenPhongBan, int sdt) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maPhongBan.equals("") || tenPhongBan.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Phongban std = em.find(Phongban.class, maPhongBan);
//
//            em.getTransaction().begin();
//            std.setMaPb(maPhongBan);
//            std.setTenPb(tenPhongBan);
//            std.setSdt(sdt);
//            em.getTransaction().commit();
//            return "Sửa thành công";
//        } catch (Exception e) {
//            return "Trùng mã sửa";
//        }
//
//    }
//
//    @WebMethod
//    public String deletePhongban(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (rollNumber.equals("")) {
//            return "Không được để trống";
//        }
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Phongban stdFind = em.find(Phongban.class, rollNumber);
//        em.getTransaction().begin();
//        em.remove(stdFind);
//        em.getTransaction().commit();
//        return "Xóa thành công";
//    }
//
//    @WebMethod
//    public Phongban findPhongban(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        Phongban stdFind = em.find(Phongban.class, rollNumber);
//        
//        return stdFind;
//    }
//
//    ////form trình độ ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @WebMethod
//    public List<Trinhdohocvan> findAllTrinhdohocvan() {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //query :tạo câu truy vấn 
//        Query q = em.createNamedQuery("Trinhdohocvan.findAll", Trinhdohocvan.class);
//
//        return q.getResultList();
//
//    }
//
//    //insert and update
//    @WebMethod(operationName = "addTrinhdohocvan")
//    public String addTrinhdohocvan(String maTrinhDoHocVan, String tenTrinhDoHocVan, String ngonngu) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maTrinhDoHocVan.equals("") || tenTrinhDoHocVan.equals("") || ngonngu.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Trinhdohocvan std = new Trinhdohocvan();
//            std.setMaTdhv(maTrinhDoHocVan);
//            std.setTenTdhv(tenTrinhDoHocVan);
//            std.setNgonngu(ngonngu);
//            em.getTransaction().begin();
//            em.persist(std);
//            em.getTransaction().commit();
//            return "Thêm thành công";
//        } catch (Exception e) {
//            return "Trùng mã thêm";
//        }
//
//    }
//
//    @WebMethod
//    public String updateTrinhdohocvan(String maTrinhDoHocVan, String tenTrinhDoHocVan, String ngonngu) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (maTrinhDoHocVan.equals("") || tenTrinhDoHocVan.equals("") || ngonngu.equals("")) {
//            return "Không được để trống";
//        }
//        try {
//            Trinhdohocvan std = em.find(Trinhdohocvan.class, maTrinhDoHocVan);
//
//            em.getTransaction().begin();
//            std.setMaTdhv(maTrinhDoHocVan);
//            std.setTenTdhv(tenTrinhDoHocVan);
//            std.setNgonngu(ngonngu);
//            em.getTransaction().commit();
//            return "Xóa thành công";
//        } catch (Exception e) {
//            return "Trùng mã sửa";
//        }
//
//    }
//
//    @WebMethod
//    public String deleteTrinhdohocvan(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//        if (rollNumber.equals("")) {
//            return "Không được để trống";
//        }
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Trinhdohocvan stdFind = em.find(Trinhdohocvan.class, rollNumber);
//        em.getTransaction().begin();
//        em.remove(stdFind);
//        em.getTransaction().commit();
//        return "Xóa thành công";
//    }
//
//    @WebMethod
//    public Trinhdohocvan findTrinhdohocvan(String rollNumber) {
//        //open connecttion
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
//        EntityManager em = factory.createEntityManager();
//
//        //tim kiếm sinh viên đã tồn tại chưa 
//        Trinhdohocvan stdFind = em.find(Trinhdohocvan.class, rollNumber);
//
//        return stdFind;
//    }
    @WebMethod
    public List<Dangnhap> loginfindAll() {
        Dangnhap user = null;
        //open connection to database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createNamedQuery("Dangnhap.findAll", Dangnhap.class);
        return q.getResultList();
    }

    @WebMethod
    public Dangnhap login(String username, String password) {
        Dangnhap user = null;
        //open connection to database
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        Query q = em.createNamedQuery("Dangnhap.login", Dangnhap.class);
        q.setParameter("user", username);
        q.setParameter("password", password);
        List<Dangnhap> list = q.getResultList();
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @WebMethod
    public String dangky(String username, String password, String email) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        if (username.equals("") || password.equals("") || email.equals("")) {
            return "các ô text k được để rỗng";
        }
        try {
            Dangnhap std = new Dangnhap();
            std.setUser(username);
            std.setPassword(password);
            std.setEmail(email);

            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "Thêm thành công";
        } catch (Exception e) {
            return "Tên người dùng đã tồn tại";
        }
    }

//---------------------------------------------------------------nhân viên--------------------------------------------------------------------
    @WebMethod(operationName = "addNhanvien")
    public String addNhanvien(String manv, String tennv, String phongban, String chucvu, String tdhocvan, String chuyenmon, Date ngaysinh, String gioitinh, String diachi, String sdt, String email) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        if (manv.equals("") || tennv.equals("") || phongban.equals("") || chucvu.equals("") || tdhocvan.equals("") || diachi.equals("") || sdt.equals("") || email.equals("")) {
            return "Các ô text k được để rỗng";
        }
        try {
            Nhanvien std = new Nhanvien();
            std.setMaNv(manv);
            std.setTenNv(tennv);
            std.setPhongban(phongban);
            std.setChucvu(chucvu);
            std.setTdHocvan(tdhocvan);
            std.setChuyenmon(chuyenmon);
            std.setNgaysinh(ngaysinh);
            std.setGioitinh(gioitinh);
            std.setDiachi(diachi);
            std.setSdt(sdt);
            std.setEmail(email);

            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "Thêm thành công";
        } catch (Exception e) {
            return "Trùng mã thêm";
        }
    }

    @WebMethod
    public String updateNhanvien(String manv, String tennv, String phongban, String chucvu, String tdhocvan, String chuyenmon, Date ngaysinh, String gioitinh, String diachi, String sdt, String email) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (manv.equals("") || tennv.equals("") || phongban.equals("") || chucvu.equals("") || tdhocvan.equals("") || diachi.equals("") || sdt.equals("") || email.equals("")) {
            return "Các ô text k được để rỗng";
        }
        Nhanvien std = em.find(Nhanvien.class, manv);

        em.getTransaction().begin();
        std.setMaNv(manv);
        std.setTenNv(tennv);
        std.setPhongban(phongban);
        std.setChucvu(chucvu);
        std.setTdHocvan(tdhocvan);
        std.setChuyenmon(chuyenmon);
        std.setNgaysinh(ngaysinh);
        std.setGioitinh(gioitinh);
        std.setDiachi(diachi);
        std.setSdt(sdt);
        std.setEmail(email);
        em.getTransaction().commit();
        return "Sửa thành công ";
    }

    @WebMethod
    public List<Nhanvien> findAllNhanvien() {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //query :tạo câu truy vấn 
        Query q = em.createNamedQuery("Nhanvien.findAll", Nhanvien.class);
        return q.getResultList();
    }

    @WebMethod
    public String deleteNhanvien(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (rollNumber.equals("")) {
            return "Không tìm thấy mã cần xóa";
        }
        //tim kiếm sinh viên đã tồn tại chưa 
        Nhanvien stdFind = em.find(Nhanvien.class, rollNumber);
        em.getTransaction().begin();
        em.remove(stdFind);
        em.getTransaction().commit();
        return "Xóa thành công";
    }

    @WebMethod
    public Nhanvien findNhanvien(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Nhanvien stdFind = em.find(Nhanvien.class, rollNumber);
        return stdFind;
    }

//---------------------------------------------------------------chức vụ--------------------------------------------------------------------
    @WebMethod
    public List<Chucvu> findAllChucvu() {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //query :tạo câu truy vấn 
        Query q = em.createNamedQuery("Chucvu.findAll", Chucvu.class);
        return q.getResultList();
    }
    //insert and update

    @WebMethod(operationName = "addChucvu")
    public String addChucvu(String maChucVu, String tenChucVu, String ghichu) {
        if (maChucVu.equals("") || tenChucVu.equals("") || ghichu.equals("")) {
            return "Các ô text k được để rỗng";
        }
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
            EntityManager em = factory.createEntityManager();

            Chucvu std = new Chucvu();
            std.setMaCv(maChucVu);
            std.setTenCv(tenChucVu);
            std.setGhichu(ghichu);
            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
        } catch (Exception e) {
            return "Trùng mã thêm.";
        }
        return "Thêm thành công";
    }

    @WebMethod
    public String updateChucvu(String maChucVu, String tenChucVu, String ghichu) {
        if (maChucVu.equals("") || tenChucVu.equals("") || ghichu.equals("")) {
            return "Các ô text k được để rỗng";
        }
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        Chucvu std = em.find(Chucvu.class, maChucVu);

        em.getTransaction().begin();
        std.setMaCv(maChucVu);
        std.setTenCv(tenChucVu);
        std.setGhichu(ghichu);
        em.getTransaction().commit();
        return "Sửa thành công";
    }

    @WebMethod
    public String deleteChucvu(String rollNumber) {
        if (rollNumber.equals("")) {
            return "Không tìm thấy mã cần xóa";
        }
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Chucvu stdFind = em.find(Chucvu.class, rollNumber);
        em.getTransaction().begin();
        em.remove(stdFind);
        em.getTransaction().commit();
        return "Xóa thành công";
    }

    @WebMethod
    public Chucvu findChucvu(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Chucvu stdFind = em.find(Chucvu.class, rollNumber);
        return stdFind;
    }

//    @WebMethod
//    public List<Chucvu> findlikeChucvu(String username) {
//        Dangnhap user = null;
//        //open connection to database
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BTL_QlyNhanSu_WebService_MVCPU");
//        EntityManager em = factory.createEntityManager();
//
//        Query q = em.createNamedQuery("Dangnhap.findLikeTenCV", Chucvu.class);
//        q.setParameter("ten_cv", username);
//        List<Chucvu> list = q.getResultList();
//        if (list.size() > 0) {
//            return q.getResultList();
//        } else {
//            return null;
//        }
//    }
//---------------------------------------------------------------chuyên môn--------------------------------------------------------------------
    @WebMethod
    public List<Chuyenmon> findAllChuyenmon() {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //query :tạo câu truy vấn 
        Query q = em.createNamedQuery("Chuyenmon.findAll", Chuyenmon.class);
        return q.getResultList();
    }

    //insert and update
    @WebMethod(operationName = "addChuyenmon")
    public String addChuyenmon(String maChuyenMon, String tenChuyenMon) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maChuyenMon.equals("") || tenChuyenMon.equals("")) {
            return "Các ô text k được để rỗng";
        }
        try {
            Chuyenmon std = new Chuyenmon();
            std.setMaCm(maChuyenMon);
            std.setTenCm(tenChuyenMon);
            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "Thêm thành công";
        } catch (Exception e) {
            return "Trùng mã thêm";
        }
    }

    @WebMethod
    public String updateChuyenmon(String maChuyenMon, String tenChuyenMon) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maChuyenMon.equals("") || tenChuyenMon.equals("")) {
            return "Các ô text k được để rỗng";
        }

        Chuyenmon std = em.find(Chuyenmon.class, maChuyenMon);
        em.getTransaction().begin();
        std.setMaCm(maChuyenMon);
        std.setTenCm(tenChuyenMon);
        em.getTransaction().commit();
        return "Sửa thành công";
    }

    @WebMethod
    public String deleteChuyenmon(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (rollNumber.equals("")) {
            return "Không tìm thấy mã cần xóa";
        }
        //tim kiếm sinh viên đã tồn tại chưa 
        Chuyenmon stdFind = em.find(Chuyenmon.class, rollNumber);
        em.getTransaction().begin();
        em.remove(stdFind);
        em.getTransaction().commit();
        return "Xóa thành công";
    }

    @WebMethod
    public Chuyenmon findChuyenmon(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Chuyenmon stdFind = em.find(Chuyenmon.class, rollNumber);
        return stdFind;
    }

//---------------------------------------------------------------tính lương--------------------------------------------------------------------
    @WebMethod
    public List<Tinhluong> findAllLuong() {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //query :tạo câu truy vấn 
        Query q = em.createNamedQuery("Tinhluong.findAll", Tinhluong.class);
        return q.getResultList();
    }

    //insert and update
    @WebMethod(operationName = "addLuong")
    public String addLuong(String maNhanVien, String tenNhanVien, int luongcb, double songaylam, double thuong) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maNhanVien.equals("") || tenNhanVien.equals("")) {
            return "Các ô text k được để rỗng";
        }
        try {
            Tinhluong std = new Tinhluong();
            std.setMaNv(maNhanVien);
            std.setTenNv(tenNhanVien);
            std.setLuongCb(luongcb);
            std.setSongaylam(songaylam);
            std.setThuong(thuong);
            std.setTongTien(luongcb * songaylam + thuong);

            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "Thêm thành công";
        } catch (Exception e) {
            return "Trùng mã thêm";
        }
    }

    @WebMethod
    public String updateLuong(String maNhanVien, String tenNhanVien, int luongcb, double songaylam, double thuong) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        Tinhluong std = em.find(Tinhluong.class, maNhanVien);
        if (maNhanVien.equals("") || tenNhanVien.equals("")) {
            return "Các ô text k được để rỗng";
        }
        em.getTransaction().begin();
        std.setMaNv(maNhanVien);
        std.setTenNv(tenNhanVien);
        std.setLuongCb(luongcb);
        std.setSongaylam(songaylam);
        std.setThuong(thuong);
        std.setTongTien(luongcb * songaylam + thuong);
        em.getTransaction().commit();
        return "Sửa thành công";
    }

    @WebMethod
    public String deleteLuong(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (rollNumber.equals("")) {
            return "Không tìm thấy mã cần xóa";
        }

        //tim kiếm sinh viên đã tồn tại chưa 
        Tinhluong stdFind = em.find(Tinhluong.class, rollNumber);
        em.getTransaction().begin();
        em.remove(stdFind);
        em.getTransaction().commit();
        return "Xóa thành công";
    }

    @WebMethod
    public Tinhluong findLuong(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Tinhluong stdFind = em.find(Tinhluong.class, rollNumber);
        return stdFind;
    }

//---------------------------------------------------------------phòng ban--------------------------------------------------------------------
    @WebMethod
    public List<Phongban> findAllPhongban() {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //query :tạo câu truy vấn 
        Query q = em.createNamedQuery("Phongban.findAll", Phongban.class);
        return q.getResultList();
    }

    //insert and update 
    @WebMethod(operationName = "addPhongban")
    public String addPhongban(String maPhongBan, String tenPhongBan, int sdt) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maPhongBan.equals("") || tenPhongBan.equals("")) {
            return "Các ô text k được để rỗng";
        }
        try {
            Phongban std = new Phongban();
            std.setMaPb(maPhongBan);
            std.setTenPb(tenPhongBan);
            std.setSdt(sdt);
            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "Thêm thành công";
        } catch (Exception e) {
            return "Trùng mã thêm";
        }
    }

    @WebMethod
    public String updatePhongban(String maPhongBan, String tenPhongBan, int sdt) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maPhongBan.equals("") || tenPhongBan.equals("")) {
            return "Các ô text k được để rỗng";
        }
        Phongban std = em.find(Phongban.class, maPhongBan);

        em.getTransaction().begin();
        std.setMaPb(maPhongBan);
        std.setTenPb(tenPhongBan);
        std.setSdt(sdt);
        em.getTransaction().commit();
        return "Sửa thành công";
    }

    @WebMethod
    public String deletePhongban(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (rollNumber.equals("")) {
            return "Không tìm thấy mã cần xóa";
        }
        //tim kiếm sinh viên đã tồn tại chưa 
        Phongban stdFind = em.find(Phongban.class, rollNumber);
        em.getTransaction().begin();
        em.remove(stdFind);
        em.getTransaction().commit();
        return "Xóa thành công";
    }

    @WebMethod
    public Phongban findPhongban(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Phongban stdFind = em.find(Phongban.class, rollNumber);
        return stdFind;
    }

//---------------------------------------------------------------trình độ học vấn--------------------------------------------------------------------
    @WebMethod
    public List<Trinhdohocvan> findAllTrinhdohocvan() {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //query :tạo câu truy vấn 
        Query q = em.createNamedQuery("Trinhdohocvan.findAll", Trinhdohocvan.class);
        return q.getResultList();
    }

    //insert and update
    @WebMethod(operationName = "addTrinhdohocvan")
    public String addTrinhdohocvan(String maTrinhDoHocVan, String tenTrinhDoHocVan, String ngonngu) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maTrinhDoHocVan.equals("") || tenTrinhDoHocVan.equals("") || ngonngu.equals("")) {
            return "Các ô text k được để rỗng";
        }
        try {
            Trinhdohocvan std = new Trinhdohocvan();
            std.setMaTdhv(maTrinhDoHocVan);
            std.setTenTdhv(tenTrinhDoHocVan);
            std.setNgonngu(ngonngu);
            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            return "Thêm thành công";
        } catch (Exception e) {
            return "Trùng mã thêm";
        }
    }

    @WebMethod
    public String updateTrinhdohocvan(String maTrinhDoHocVan, String tenTrinhDoHocVan, String ngonngu) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (maTrinhDoHocVan.equals("") || tenTrinhDoHocVan.equals("") || ngonngu.equals("")) {
            return "Các ô text k được để rỗng";
        }
        Trinhdohocvan std = em.find(Trinhdohocvan.class, maTrinhDoHocVan);

        em.getTransaction().begin();
        std.setMaTdhv(maTrinhDoHocVan);
        std.setTenTdhv(tenTrinhDoHocVan);
        std.setNgonngu(ngonngu);
        em.getTransaction().commit();
        return "Sửa thành công";
    }

    @WebMethod
    public String deleteTrinhdohocvan(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();
        if (rollNumber.equals("")) {
            return "Không tìm thấy mã cần xóa";
        }
        //tim kiếm Trinhdohocvan đã tồn tại chưa 
        Trinhdohocvan stdFind = em.find(Trinhdohocvan.class, rollNumber);
        em.getTransaction().begin();
        em.remove(stdFind);
        em.getTransaction().commit();
        return "Xóa thành công";
    }

    @WebMethod
    public Trinhdohocvan findTrinhdohocvan(String rollNumber) {
        //open connecttion
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("quanlynhansu_service_version3PU");
        EntityManager em = factory.createEntityManager();

        //tim kiếm sinh viên đã tồn tại chưa 
        Trinhdohocvan stdFind = em.find(Trinhdohocvan.class, rollNumber);
        return stdFind;
    }
}
