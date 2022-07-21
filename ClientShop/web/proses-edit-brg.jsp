
    <%-- start web service invocation --%><hr/>
    <%
    try {
	server.mahasiswa.Mahasiswa service = new server.mahasiswa.Mahasiswa();
	server.mahasiswa.Mhsiswa port = service.getMhsiswaPort();
	 // TODO initialize WS operation arguments here
	int nim = Integer.valueOf(request.getParameter("nim"));
        java.lang.String nama = request.getParameter("nama");
        java.lang.String jurusan = request.getParameter("jurusan");
        java.lang.String alamat = request.getParameter("alamat");
        int kontak = Integer.valueOf(request.getParameter("kontak"));
        port.editData(nim, nama, jurusan, alamat, kontak);
        response.sendRedirect("daftar-brg.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
  
