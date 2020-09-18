<%-- 
    Document   : Eliminar
    Created on : 17/09/2020, 06:36:51 PM
    Author     : JOSE ZAFRA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <h1> Provedor </h1> <br>
        <form action="controlador_CUD.jsp">
        ID:  <input type ="text" class="form-control" name ="txtid" value="0" placeholder="Ingrese Nombre" ><br>
        <input type="submit" name="boton" value="Eliminar">
      
    </body>
</html>
