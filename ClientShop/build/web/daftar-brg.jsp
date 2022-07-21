<%-- 
    Document   : daftar-brg
    Created on : 08-Jan-2021, 10:53:14
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<!--Content-->
<body style="background-image: url(image/bg2.png);">
    <div class="container">

        <h2 style="text-align: center;">Daftar Mahasiswa</h2><br>       
        <!--Menu Cari Data-->
        <form method="POST" class="cari">
            <input type="text" placeholder="Masukkan Data yang Ingin Dicari" name="search">
            <button type="submit" id="btn-submit"><i class="fa fa-search"></i></button>
        </form>
        <!--Menu Pengurutan Data-->
        <form method="POST">
            <select name="sortir">
                <option selected disabled>Urutkan Data Berdasarkan</option>
                <option value="nama">Nama</option>
                <option value="jenis">Jenis</option>                    
            </select>          
            <button type="submit" class="btn-primary">Urutkan</button>                          
        </form>
        <!--Tabel-->
        <table cellspacing="1" cellpadding="2" class="table" id="myTable">
            <thead>
                <tr>
                    <th class="c1">Nim</th>
                    <th class="c2">Nama Mahasiswa</th>
                    <th class="c3">Jurusan</th>
                    <th class="c4">Alamat</th>
                    <th class="c5">Kontak</th>
                    <th class="c6">Tindakan</th>
                </tr>
            </thead>
            <tbody> 
                <tr>
                    <!--Isi tabel-->
                    <%
                        String sort = request.getParameter("sortir");
                        String cari = request.getParameter("search");

                server.mahasiswa.Mahasiswa service = new server.mahasiswa.Mahasiswa();
        	server.mahasiswa.Mhsiswa port = service.getMhsiswaPort();
                        if (cari != null) {
                            try {
                                // TODO initialize WS operation arguments here
                                java.lang.String search = cari;
                                // TODO process result here
                                java.util.List<java.lang.Object> result = port.cariData(search);
                                for (int i = 0; i < result.size(); i++) {
                                    out.println(result.get(i));
                                }
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        } else if (sort != null) {
                            try {
                                java.lang.String sortir = sort;
                                // TODO process result here
                                java.util.List<java.lang.Object> result = port.urutkanData(sortir);
                                for (int i = 0; i < result.size(); i++) {
                                    out.println(result.get(i));
                                }
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        } else {
                            try {
                                java.util.List<java.lang.Object> result = port.tampilData();
                                for (int i = 0; i < result.size(); i++) {
                                    out.println(result.get(i));
                                }
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        }
                    %>
                </tr>
            </tbody>
        </table>
        <br><a href="tambah-brg.jsp"><button  class="btn-danger">Tambah Barang</button></a><br><br>
    </div>
</body>

</html>
<%@include file="footer.jsp"%>
