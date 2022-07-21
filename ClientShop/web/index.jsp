<%-- 
    Document   : index
    Created on : 08-Jan-2021, 10:46:35
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Style Css -->
        <link href="css/bootstrap.min.css" rel="stylesheet"/>        
        <link href="css/login.css" rel="stylesheet"/>
        <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>
        <title>Login to Pet Shop</title>
    </head>
<!-- Tampilan Login -->
    <body>
        <div id="login">
            <h1><strong>Selamat Datang. </strong> Silahkan Log In</h1>
            <form action="proses-login.jsp" method="post">
                <fieldset>
                    <p><input name="username" type="text" required value="Username" 
                              onBlur="if (this.value == '')this.value = 'Username'" 
                              onFocus="if (this.value == 'Username')this.value = ''"></p>
                    <p><input name="password" type="password" required value="Password" 
                              onBlur="if (this.value == '')this.value = 'Password'" 
                              onFocus="if (this.value == 'Password')this.value = ''"></p>
                    <p><input type="submit" value="Login"></p>
                </fieldset>
            </form>      
        </div>
    </body>
</html>