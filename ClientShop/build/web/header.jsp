<%-- 
    Document   : header
    Created on : 08-Jan-2021, 10:56:35
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <!--Stlye Css-->
                <link href="css/bootstrap.min.css" rel="stylesheet"/>
                <link href="css/style.css" rel="stylesheet"/>  
                <link href="css/style.css" rel="stylesheet"/>
                <link href="css/tbh-brg.css" rel="stylesheet"/>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

                    <title>Pet Shop</title>
                    </head>
                    <!--Bar Navigasi-->
                    <nav id="home" class="navbar">
                        <div class="container-fluid">
                            <div class="navbar-header">
                                <!--Logo-->
                                <button type="button" id="toogle-button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                                    <span class="glyphicon glyphicon-menu-hamburger"></span>                     
                                </button>                
                                <a id="logo"  class="navbar-brand" href="daftar-brg.jsp"><img src="image/logo.jpg" style=" max-width: 80px;"></a>
                                <label style="padding-top: 30px;" id="logo"><a href="daftar-brg.jsp"></a>Pet Shop</label>        

                            </div>
                            <!-- Button-button -->
                            <div class="collapse navbar-collapse" id="myNavbar">
                                <ul id="link" class="nav navbar-nav navbar-right">
                                    <li id="first-link"><a  href="daftar-brg.jsp"> Daftar Barang</a></li>
                                    <li><a href="report.jsp">Report</a></li>
                                    <li><a href="profil.jsp">Profil</a></li>                    
                                    <li id="button-link"><a href="logout.jsp">Log out</a></li>
                                </ul>
                            </div>
                        </div>
                    </nav>
