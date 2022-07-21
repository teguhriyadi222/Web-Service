<%-- 
    Document   : report
    Created on : 08-Jan-2021, 11:10:28
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>

<body>
    <div>
        <h2>Laporan Data Barang</h2>
        <%
            try {
                String url = "jdbc:mysql://localhost:3306/store";
                String usern = "root";
                String passw = "";
                Connection con = null;
                Statement stat = null;
                ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(url, usern, passw);
                stat = con.createStatement();
                String query = "select * from barang";
                rs = stat.executeQuery(query);
        %><%
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "inline; filename ="
                    + "Penjualan.xls");
        %>
        <table border="1">
            <tr>
                <th>ID Barang</th>
                <th>Nama Produk</th>
                <th>Jenis</th>
                <th>Stok</th>
                <th>Harga</th>
            </tr>
            <%
                while (rs.next()) {
            %>
            <tr>
                <th><%=rs.getInt(1)%></th>
                <th><%=rs.getString(2)%></th>
                <th><%=rs.getString(3)%></th>
                <th><%=rs.getInt(4)%></th>
                <th><%=rs.getInt(5)%></th>
            </tr>
            <%  }
                } catch (Exception e) {

                }
            %>
        </table>
    </div>       
</body>
