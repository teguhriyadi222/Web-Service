<%-- 
    Document   : proses-login
    Created on : 08-Jan-2021, 10:48:46
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- start web service invocation --%><hr/>
<%
    try {
server.mahasiswa.Mahasiswa service = new server.mahasiswa.Mahasiswa();
	server.mahasiswa.Mhsiswa port = service.getMhsiswaPort();
        // TODO initialize WS operation arguments here
        java.lang.String username = request.getParameter("username");
        java.lang.String password = request.getParameter("password");
        // TODO process result here
        int result = port.login(username, password);
        if (result == 0) {
            out.print("gagal");
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("daftar-brg.jsp");
            out.print("berhasil");
        }
    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
%>
<%-- end web service invocation --%><hr/>

