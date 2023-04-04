/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller_client.Chucvu;
import controller_client.Chuyenmon;
import controller_client.Dangnhap;
import controller_client.FindAllChucvuResponse;
import controller_client.FindAllChuyenmonResponse;
import controller_client.FindAllLuongResponse;
import controller_client.FindAllNhanvienResponse;
import controller_client.FindAllPhongbanResponse;
import controller_client.FindAllTrinhdohocvanResponse;
import controller_client.LoginfindAllResponse;
import controller_client.Nhanvien;
import controller_client.Phongban;
import controller_client.QuanlynhansuVersion3Service;
import controller_client.Tinhluong;
import controller_client.Trinhdohocvan;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author MANH TRUONG
 */
@Path("quanlynhansu_version3_serviceport")
public class quanlynhansu_version3_ServicePort {

    private QuanlynhansuVersion3Service port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of quanlynhansu_version3_ServicePort
     */
    public quanlynhansu_version3_ServicePort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method login
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Dangnhap>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("login/")
    public JAXBElement<Dangnhap> getLogin(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Dangnhap result = port.login(arg0, arg1);
                return new JAXBElement<controller_client.Dangnhap>(new QName("http//controller_client/", "dangnhap"), controller_client.Dangnhap.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findChucvu
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Chucvu>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findchucvu/")
    public JAXBElement<Chucvu> getFindChucvu(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Chucvu result = port.findChucvu(arg0);
                return new JAXBElement<controller_client.Chucvu>(new QName("http//controller_client/", "chucvu"), controller_client.Chucvu.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addTrinhdohocvan
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addtrinhdohocvan/")
    public String getAddTrinhdohocvan(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addTrinhdohocvan(arg0, arg1, arg2);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addPhongban
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addphongban/")
    public String getAddPhongban(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") int arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addPhongban(arg0, arg1, arg2);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updatePhongban
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("updatephongban/")
    public String getUpdatePhongban(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") int arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.updatePhongban(arg0, arg1, arg2);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllPhongban
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.FindAllPhongbanResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallphongban/")
    public JAXBElement<FindAllPhongbanResponse> getFindAllPhongban() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Phongban> result = port.findAllPhongban();

                class FindAllPhongbanResponse_1 extends controller_client.FindAllPhongbanResponse {

                    FindAllPhongbanResponse_1(java.util.List<controller_client.Phongban> _return) {
                        this._return = _return;
                    }
                }
                controller_client.FindAllPhongbanResponse response = new FindAllPhongbanResponse_1(result);
                return new controller_client.ObjectFactory().createFindAllPhongbanResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method deletePhongban
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("deletephongban/")
    public String getDeletePhongban(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.deletePhongban(arg0);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllChuyenmon
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.FindAllChuyenmonResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallchuyenmon/")
    public JAXBElement<FindAllChuyenmonResponse> getFindAllChuyenmon() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Chuyenmon> result = port.findAllChuyenmon();

                class FindAllChuyenmonResponse_1 extends controller_client.FindAllChuyenmonResponse {

                    FindAllChuyenmonResponse_1(java.util.List<controller_client.Chuyenmon> _return) {
                        this._return = _return;
                    }
                }
                controller_client.FindAllChuyenmonResponse response = new FindAllChuyenmonResponse_1(result);
                return new controller_client.ObjectFactory().createFindAllChuyenmonResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method deleteChuyenmon
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("deletechuyenmon/")
    public String getDeleteChuyenmon(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.deleteChuyenmon(arg0);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllChucvu
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.FindAllChucvuResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallchucvu/")
    public JAXBElement<FindAllChucvuResponse> getFindAllChucvu() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Chucvu> result = port.findAllChucvu();

                class FindAllChucvuResponse_1 extends controller_client.FindAllChucvuResponse {

                    FindAllChucvuResponse_1(java.util.List<controller_client.Chucvu> _return) {
                        this._return = _return;
                    }
                }
                controller_client.FindAllChucvuResponse response = new FindAllChucvuResponse_1(result);
                return new controller_client.ObjectFactory().createFindAllChucvuResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllLuong
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.FindAllLuongResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallluong/")
    public JAXBElement<FindAllLuongResponse> getFindAllLuong() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Tinhluong> result = port.findAllLuong();

                class FindAllLuongResponse_1 extends controller_client.FindAllLuongResponse {

                    FindAllLuongResponse_1(java.util.List<controller_client.Tinhluong> _return) {
                        this._return = _return;
                    }
                }
                controller_client.FindAllLuongResponse response = new FindAllLuongResponse_1(result);
                return new controller_client.ObjectFactory().createFindAllLuongResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method deleteChucvu
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("deletechucvu/")
    public String getDeleteChucvu(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.deleteChucvu(arg0);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method deleteLuong
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("deleteluong/")
    public String getDeleteLuong(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.deleteLuong(arg0);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findLuong
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Tinhluong>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findluong/")
    public JAXBElement<Tinhluong> getFindLuong(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Tinhluong result = port.findLuong(arg0);
                return new JAXBElement<controller_client.Tinhluong>(new QName("http//controller_client/", "tinhluong"), controller_client.Tinhluong.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findPhongban
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Phongban>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findphongban/")
    public JAXBElement<Phongban> getFindPhongban(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Phongban result = port.findPhongban(arg0);
                return new JAXBElement<controller_client.Phongban>(new QName("http//controller_client/", "phongban"), controller_client.Phongban.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllNhanvien
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.FindAllNhanvienResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findallnhanvien/")
    public JAXBElement<FindAllNhanvienResponse> getFindAllNhanvien() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Nhanvien> result = port.findAllNhanvien();

                class FindAllNhanvienResponse_1 extends controller_client.FindAllNhanvienResponse {

                    FindAllNhanvienResponse_1(java.util.List<controller_client.Nhanvien> _return) {
                        this._return = _return;
                    }
                }
                controller_client.FindAllNhanvienResponse response = new FindAllNhanvienResponse_1(result);
                return new controller_client.ObjectFactory().createFindAllNhanvienResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findNhanvien
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Nhanvien>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findnhanvien/")
    public JAXBElement<Nhanvien> getFindNhanvien(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Nhanvien result = port.findNhanvien(arg0);
                return new JAXBElement<controller_client.Nhanvien>(new QName("http//controller_client/", "nhanvien"), controller_client.Nhanvien.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method deleteTrinhdohocvan
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("deletetrinhdohocvan/")
    public String getDeleteTrinhdohocvan(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.deleteTrinhdohocvan(arg0);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findTrinhdohocvan
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Trinhdohocvan>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findtrinhdohocvan/")
    public JAXBElement<Trinhdohocvan> getFindTrinhdohocvan(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Trinhdohocvan result = port.findTrinhdohocvan(arg0);
                return new JAXBElement<controller_client.Trinhdohocvan>(new QName("http//controller_client/", "trinhdohocvan"), controller_client.Trinhdohocvan.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findAllTrinhdohocvan
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.FindAllTrinhdohocvanResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findalltrinhdohocvan/")
    public JAXBElement<FindAllTrinhdohocvanResponse> getFindAllTrinhdohocvan() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Trinhdohocvan> result = port.findAllTrinhdohocvan();

                class FindAllTrinhdohocvanResponse_1 extends controller_client.FindAllTrinhdohocvanResponse {

                    FindAllTrinhdohocvanResponse_1(java.util.List<controller_client.Trinhdohocvan> _return) {
                        this._return = _return;
                    }
                }
                controller_client.FindAllTrinhdohocvanResponse response = new FindAllTrinhdohocvanResponse_1(result);
                return new controller_client.ObjectFactory().createFindAllTrinhdohocvanResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method deleteNhanvien
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("deletenhanvien/")
    public String getDeleteNhanvien(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.deleteNhanvien(arg0);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addNhanvien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @param arg4 resource URI parameter
     * @param arg5 resource URI parameter
     * @param arg6 resource URI parameter
     * @param arg7 resource URI parameter
     * @param arg8 resource URI parameter
     * @param arg9 resource URI parameter
     * @param arg10 resource URI parameter
     * @return an instance of java.lang.String
     */
    @POST
    @Produces("text/plain")
    @Consumes("application/xml")
    @Path("addnhanvien/")
    public String postAddNhanvien(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, JAXBElement<XMLGregorianCalendar> arg6, String arg7, String arg8, String arg9, String arg10) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addNhanvien(arg0, arg1, arg2, arg3, arg4, arg5, arg6.getValue(), arg7, arg8, arg9, arg10);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method loginfindAll
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.LoginfindAllResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("loginfindall/")
    public JAXBElement<LoginfindAllResponse> getLoginfindAll() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<controller_client.Dangnhap> result = port.loginfindAll();

                class LoginfindAllResponse_1 extends controller_client.LoginfindAllResponse {

                    LoginfindAllResponse_1(java.util.List<controller_client.Dangnhap> _return) {
                        this._return = _return;
                    }
                }
                controller_client.LoginfindAllResponse response = new LoginfindAllResponse_1(result);
                return new controller_client.ObjectFactory().createLoginfindAllResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updateNhanvien
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @param arg4 resource URI parameter
     * @param arg5 resource URI parameter
     * @param arg6 resource URI parameter
     * @param arg7 resource URI parameter
     * @param arg8 resource URI parameter
     * @param arg9 resource URI parameter
     * @param arg10 resource URI parameter
     * @return an instance of java.lang.String
     */
    @POST
    @Produces("text/plain")
    @Consumes("application/xml")
    @Path("updatenhanvien/")
    public String postUpdateNhanvien(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, JAXBElement<XMLGregorianCalendar> arg6, String arg7, String arg8, String arg9, String arg10) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.updateNhanvien(arg0, arg1, arg2, arg3, arg4, arg5, arg6.getValue(), arg7, arg8, arg9, arg10);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addChucvu
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addchucvu/")
    public String getAddChucvu(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addChucvu(arg0, arg1, arg2);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addChuyenmon
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addchuyenmon/")
    public String getAddChuyenmon(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addChuyenmon(arg0, arg1);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addLuong
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @param arg4 resource URI parameter
     * @param arg5 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("addluong/")
    public String getAddLuong(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") int arg2, @QueryParam("arg3")
            @DefaultValue("0.0") double arg3, @QueryParam("arg4")
            @DefaultValue("0.0") double arg4, @QueryParam("arg5")
            @DefaultValue("0.0") double arg5) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.addLuong(arg0, arg1, arg2, arg3, arg4, arg5);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updateChucvu
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("updatechucvu/")
    public String getUpdateChucvu(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.updateChucvu(arg0, arg1, arg2);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updateChuyenmon
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("updatechuyenmon/")
    public String getUpdateChuyenmon(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.updateChuyenmon(arg0, arg1);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updateLuong
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @param arg4 resource URI parameter
     * @param arg5 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("updateluong/")
    public String getUpdateLuong(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0") int arg2, @QueryParam("arg3")
            @DefaultValue("0.0") double arg3, @QueryParam("arg4")
            @DefaultValue("0.0") double arg4, @QueryParam("arg5")
            @DefaultValue("0.0") double arg5) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.updateLuong(arg0, arg1, arg2, arg3, arg4, arg5);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method findChuyenmon
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<controller_client.Chuyenmon>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findchuyenmon/")
    public JAXBElement<Chuyenmon> getFindChuyenmon(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                controller_client.Chuyenmon result = port.findChuyenmon(arg0);
                return new JAXBElement<controller_client.Chuyenmon>(new QName("http//controller_client/", "chuyenmon"), controller_client.Chuyenmon.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method updateTrinhdohocvan
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("updatetrinhdohocvan/")
    public String getUpdateTrinhdohocvan(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.updateTrinhdohocvan(arg0, arg1, arg2);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private QuanlynhansuVersion3Service getPort() {
        try {
            // Call Web Service Operation
            controller_client.QuanlynhansuVersion3Service_Service service = new controller_client.QuanlynhansuVersion3Service_Service();
            controller_client.QuanlynhansuVersion3Service p = service.getQuanlynhansuVersion3ServicePort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
