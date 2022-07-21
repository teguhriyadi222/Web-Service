

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<!--Content-->
<body style="background-image: url(image/bg2.png);">
    <div class="main">
        <section class="tambah">
            <div class="container">
                <div class="tambah-content">
                    <form method="POST" id="signup-form" class="signup-form" action="proses-edit-brg.jsp">
                        <!--Form Edit-->
                        <h2 class="form-title">Edit Mahasiswa</h2>

                        <%
                            try {
                                server.mahasiswa.Mahasiswa service = new server.mahasiswa.Mahasiswa();
                                server.mahasiswa.Mhsiswa port = service.getMhsiswaPort();
                                int nim = Integer.valueOf(request.getParameter("nim"));
                                // TODO process result here
                                java.util.List<java.lang.Object> result = port.getData(nim);
                                for (int i = 0; i < result.size(); i++) {
                                    out.println(result.get(i));
                                }
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        %>


                    </form>                   
                        
                        
                        
                        
                </div>
            </div>
        </section>
    </div>
</body>

<%@include file="footer.jsp" %>