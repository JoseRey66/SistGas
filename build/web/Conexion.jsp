
<%@page contentType="text/html" pageEncoding="UTF-8"

      import="java.sql.Connection"
      import="java.sql.DriverManager"
      import="java.sql.ResultSet"
      import="java.sql.Statement"
      import="java.sql.SQLException" 
      %>

      <%
      String sql = " ";
      String driver = "com.mysql.jdbc.Driver";
      String usuario = "root";
      String contraseña = "jose66";
      
      try{
      Connection cnx ;
      Statement st ;
      Class.forName(driver);
     
      cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",usuario,contraseña); 
      st = cnx.createStatement();
      out.println("Conexion Establecida");
      }catch(Exception e){
          out.println("ERROR: " + e.getMessage());
          
      }
      
      %>