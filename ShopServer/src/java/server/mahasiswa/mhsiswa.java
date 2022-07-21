/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.mahasiswa;

import server.mahasiswa.koneksi;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "mahasiswa")
public class mhsiswa {

    /**
     * This is a sample web service operation
     */
    koneksi kon = new koneksi();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @WebMethod(operationName = "login")
    public int login(
            @WebParam(name = "username") String user,
            @WebParam(name = "password") String pass) {

        //TODO write your implementation code here:
        int status = 0;
        try {
            con = kon.getCon();
            ps = con.prepareStatement("select * from user where username = ? AND password = ?");
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                status = 1;
            } else {
                status = 0;
            }
            con.close();
        } catch (Exception ex) {

        }
        return status;
    }

    @WebMethod(operationName = "tampilData")
    public List tampilData() {
        List daftar = new ArrayList();
        String sql_daftar = "select * from mhs";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql_daftar);
            while (rs.next()) {
                daftar.add("<td class=\\\"c1\\\">" + rs.getInt("nim") + "</td>"
                        + "<td class=\\\"c2\\\">" + rs.getString("nama") + "</td>"
                        + "<td class=\\\"c3\\\">" + rs.getString("jurusan") + "</td>"
                        + "<td class=\\\"c4\\\">" + rs.getString("alamat") + "</td>"
                        + "<td class=\\\"c5\\\">" + rs.getInt("kontak") + "</td>"
                        + "<td class=\\\"c6\\\"><button class=\"btn-info\"><a href=\"edit-brg.jsp?nim=" + rs.getInt("nim")
                        + "\">Edit</a></button> || <button class=\"btn-danger\"><a href=\"proses-hapus-brg.jsp?nim=" + rs.getInt("nim") + "\">Hapus</a></button></td><tr>");
            }

            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return daftar;
    }

    @WebMethod(operationName = "tambahData")
    public void tambahData(
            @WebParam(name = "nim") int nim,
            @WebParam(name = "nama") String nama,
            @WebParam(name = "jurusan") String jurusan,
            @WebParam(name = "alamat") String alamat,
            @WebParam(name = "kontak") int kontak
    ) {
        try {
            con = kon.getCon();
            ps = con.prepareStatement("insert into mhs value (?,?,?,?,?)");
            ps.setInt(1, nim);
            ps.setString(2, nama);
            ps.setString(3, jurusan);
            ps.setString(4, alamat);
            ps.setInt(5, kontak);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @WebMethod(operationName = "getData")
    public List getData(
            @WebParam(name = "nim") int nim) {
        List mhs = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            ps = con.prepareStatement("select * from mhs where nim=?");
            ps.setInt(1, nim);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mhs.add("<div class=\"form-group\">\n"
                        + "                            <input type=\"number\" class=\"form-input\" name=\"nim\" nim=\"nim\" placeholder=\"NIM\" value=\"" + rs.getInt("nim") + "\" readonly=\"true\">\n"
                        + "                        </div>\n"
                        + "                        <div class=\"form-group\">\n"
                        + "                            <input type=\"text\" class=\"form-input\" name=\"nama\" nim=\"nama\" placeholder=\"Nama\" value=\"" + rs.getString("nama") + "\">\n"
                        + "                        </div>\n"
                        + "                        <div class=\"form-group\">                         \n"
                        + "                            <div class=\"selectdiv\">\n"
                        + "                                <label>\n"
                        + "                                    <select name=\"jurusan\" nim=\"jurusan\">\n"
                        + "                                        <option selected disabled> Pilih Jenis yang diinginkan </option>\n"
                        + "                                        <option value=\"TI\">TI</option>\n"
                        + "                                        <option value=\"SI\">SI</option>\n"
                        + "                                        <option value=\"PR\">PR</option>\n"
                        + "                                        <option value=\"DKV\">DKV</option>\n"
                        + "                                    </select>\n"
                        + "                                </label>\n"
                        + "                            </div>\n"
                        + "                        </div>\n"
                        + "                        <div class=\"form-group\">\n"
                        + "                            <input type=\"text\" class=\"form-input\" name=\"alamat\" nim=\"alamat\" placeholder=\"alamat\" value=\"" + rs.getString("alamat") + "\">\n"
                        + "                        </div>\n"
                        + "                        <div class=\"form-group\">\n"
                        + "                            <input type=\"number\" class=\"form-input\" name=\"kontak\" nim=\"kontak\" placeholder=\"kontak\" value=\"" + rs.getInt("kontak") + "\">\n"
                        + "                        </div>\n"
                        + "                        <div class=\"form-group\">\n"
                        + "                            <input type=\"submit\" name=\"submit\" nim=\"submit\" class=\"form-submit\" value=\"Ubah\"/>\n"
                        + "                        </div>");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return mhs;
    }

    @WebMethod(operationName = "editData")
    public void editData(
            @WebParam(name = "nim") int nim,
            @WebParam(name = "nama") String nama,
            @WebParam(name = "jurusan") String jurusan,
            @WebParam(name = "alamat") String alamat,
            @WebParam(name = "kontak") int kontak
    ) {
        try {
            con = kon.getCon();
            ps = con.prepareStatement("update mhs set nim=?,nama=?,jurusan=?,alamat=? where kontak=?");
            ps.setInt(1, nim);
            ps.setString(2, nama);
            ps.setString(3, jurusan);
            ps.setString(4, alamat);
            ps.setInt(5, kontak);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Perubahan data gagal dilakukan disebabkan oleh " + e.toString());
        }
    }

    @WebMethod(operationName = "hapusData")
    public void hapusData(
            @WebParam(name = "nim") int nim) {
        try {
            con = kon.getCon();
            ps = con.prepareStatement("delete from mhs where nim = ?");
            ps.setInt(1, nim);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Data gagal dihapus " + e.toString());
        }
    }

    @WebMethod(operationName = "cariData")
    public List cariData(@WebParam(name = "search") String search) {
        //TODO write your implementation code here:
        List barang = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            ps = con.prepareStatement("select * from mhs where nama like ? OR jurusan like ?");
            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                barang.add("<td class=\\\"c1\\\">" + rs.getInt("nim") + "</td>"
                   + "<td class=\\\"c2\\\">" + rs.getString("nama") + "</td>"
                        + "<td class=\\\"c3\\\">" + rs.getString("jurusan") + "</td>"
                        + "<td class=\\\"c4\\\">" + rs.getString("alamat") + "</td>"
                        + "<td class=\\\"c5\\\">" + rs.getInt("kontak") + "</td>"
                        + "<td class=\\\"c6\\\"><button class=\"btn-info\"><a href=\"edit-brg.jsp?nim=" + rs.getInt("nim")
                        + "\">Edit</a></button> || <button class=\"btn-danger\"><a href=\"proses-hapus-brg.jsp?nim=" + rs.getInt("nim") + "\">Hapus</a></button></td><tr>");
            }
            conn.close();
        } catch (Exception e) {

        }
        return barang;
    }

    @WebMethod(operationName = "urutkanData")
    public List urutkanData(@WebParam(name = "sortir") String sortir) {
        //TODO write your implementation code here:
        List barang = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiwa", "root", "");
            Statement st = conn.createStatement();
            con = kon.getCon();
            if (sortir.equals("nama")){
                ps = con.prepareStatement("SELECT * from mhs order by nama");
            } if(sortir.equals("jurusan")){
                ps = con.prepareStatement("SELECT * from mhs order by jurusan ASC");
            }          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                barang.add("<td class=\\\"c1\\\">" + rs.getInt("nim") + "</td>"
                    + "<td class=\\\"c2\\\">" + rs.getString("nama") + "</td>"
                        + "<td class=\\\"c3\\\">" + rs.getString("jurusan") + "</td>"
                        + "<td class=\\\"c4\\\">" + rs.getString("alamat") + "</td>"
                        + "<td class=\\\"c5\\\">" + rs.getInt("kontak") + "</td>"
                        + "<td class=\\\"c6\\\"><button class=\"btn-info\"><a href=\"edit-brg.jsp?nim=" + rs.getInt("nim")
                        + "\">Edit</a></button> || <button class=\"btn-danger\"><a href=\"proses-hapus-brg.jsp?nim=" + rs.getInt("nim") + "\">Hapus</a></button></td><tr>");
            }
            conn.close();
        } catch (Exception e) {

        }
        return barang;
    }
}
