<%-- 
    Document   : tambah-brg
    Created on : 29-Dec-2020, 17:52:18
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="header.jsp" %>
<body style="background-image: url(image/bg2.png);">
    <div class="main">
        <section class="tambah">
            <div class="container">
                <div class="tambah-content">
                    <!-- Form Tambah Data -->
                    <form method="POST" id="signup-form" class="signup-form" action="proses-tambah-brg.jsp">
                        <h2 class="form-title">Tambah Mahasiswa</h2>
                        <div class="form-group">
                            <input type="number" class="form-input" name="nim" id="nim" required placeholder="NIM" />
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="nama" id="nama" required placeholder="Nama Mahasiswa"/>
                        </div>
                        <div class="form-group">                         
                            <div class="selectdiv">
                                <label>
                                    <select name="jurusan" id="jurusan" required>
                                        <option selected disabled> Jurusan </option>
                                        <option value="TI">TI</option>
                                        <option value="SI">SI</option>
                                        <option value="PR">PR</option>
                                        <option value="DKV">DKV</option>
                                    </select>
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="alamat" id="alamat" required placeholder="Alamat"/>
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-input" name="kontak" id="kontak" required placeholder="Kontak"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" name="submit" id="submit" class="form-submit" value="Tambahkan"/>
                        </div>
                    </form>                   
                </div>
            </div>
        </section>
    </div>
</body>

<%@include file="footer.jsp" %>