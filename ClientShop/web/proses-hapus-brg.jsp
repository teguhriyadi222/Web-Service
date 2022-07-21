<%-- 
    Document   : hapus-brg
    Created on : 08-Jan-2021, 11:02:48
    Author     : Administrator
--%>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	server.mahasiswa.Mahasiswa service = new server.mahasiswa.Mahasiswa();
	server.mahasiswa.Mhsiswa port = service.getMhsiswaPort();
	 // TODO initialize WS operation arguments here
	int nim = Integer.valueOf(request.getParameter("nim"));
	port.hapusData(nim);
        response.sendRedirect("daftar-brg.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>


   