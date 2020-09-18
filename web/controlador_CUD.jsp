<%-- 
    Document   : controlador_CUD
    Created on : 16/09/2020, 05:38:37 PM
    Author     : JOSE ZAFRA
--%>

<%@page import="java.util.List"%>
<%@page import="Beans.BeansProvedor"%>
<%@page import="Modelo.MProvedor"%>
<%
    BeansProvedor bp = new BeansProvedor();
    
    int id = Integer.parseInt(request.getParameter("txtid"));    
    String Nombre = request.getParameter("txtnombre");
    String Ruc = request.getParameter("txtruc"); 
    String Telefono = request.getParameter("txttelefono");
    String Direccion = request.getParameter("txtdireccion");
    String pboton = request.getParameter("boton");
    
    if(pboton.equals("Grabar"))
    {    
        MProvedor mp = new MProvedor();
        out.print(mp.Insertar(id , Nombre , Ruc , Telefono , Direccion));
    }
    if(pboton.equals("Actualizar"))
    {    
        MProvedor mp = new MProvedor();
        out.print(mp.Actualizar(id , Nombre , Ruc , Telefono , Direccion));
    }
    if(pboton.equals("Eliminar"))
    {    
        MProvedor mp = new MProvedor();
        out.print(mp.Eliminar(id));
    }
    if(pboton.equals("Listar"))
    {    
        MProvedor mp = new MProvedor();
        try{
        List<BeansProvedor> lst = mp.Listar();
        for(int i=0;i<lst.size();i++){
            out.println("......" + lst.get(i).getId_Proveedor());
            out.println("......" + lst.get(i).getNombre());
            out.println("......" + lst.get(i).getRuc());
            out.println("......" + lst.get(i).getTelefono());
            out.println("......" + lst.get(i).getDireccion_proveedor());
            
        }
        }catch(Exception e){
        out.println("Ocurrio un error");
    }
        
    }
   

   
    
%>
    
    
    