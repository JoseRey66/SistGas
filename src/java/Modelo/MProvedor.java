
package Modelo;

import Beans.BeansProvedor;
import Cone.Cone;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MProvedor {
    BeansProvedor bProvedor = new BeansProvedor();
    Cone cn = new Cone();
    
    public String Insertar(int id , String Nombre, String Ruc , String Telefono , String Direccion) throws SQLException{
        String sql = "INSERT INTO mydb.provedor ( id_Provedor , nombre , ruc , telefono , direccion_provedor) VALUES ( '"+id+"' ,   '"+Nombre+"', '"+Ruc+"' , '"+Telefono+"' , '"+Direccion+"');";
        cn.ejecutar(sql);
        return "Insertado Correctamente";
    }
    
    public String Actualizar(int id , String Nombre, String Ruc , String Telefono , String Direccion) throws SQLException {
        String sql = "UPDATE mydb.provedor set nombre = '"+Nombre+"' ,"
                                       + "ruc = '"+Ruc+"',"
                                       + "telefono = '"+Telefono+"',"
                                       + "direccion_provedor = '"+Direccion+"'"
                                       +  "where id_Provedor ="  + id;
        cn.ejecutar(sql);
        return "Actualizado Correctamente";
        
    }
    
    public String Eliminar(int id) throws SQLException {
        String sql = "Delete from mydb.provedor where id_Provedor = " + id;
        cn.ejecutar(sql);
        return "Eliminado Correctamente";
   
    }
    
    public List<BeansProvedor> Listar () throws SQLException{
        String sql = "Select * from mydb.provedor";
        cn.getCnx();
        ResultSet rs = cn.ejecutarLista(sql);
        List<BeansProvedor> lst = new ArrayList<BeansProvedor>() ;
        if(rs !=null){
            bProvedor.setId_Proveedor(rs.getInt("id_Provedor"));
            bProvedor.setId_Proveedor(rs.getInt("nombre"));
            bProvedor.setId_Proveedor(rs.getInt("ruc"));
            bProvedor.setId_Proveedor(rs.getInt("telefono"));
            bProvedor.setId_Proveedor(rs.getInt("direccion_provedor"));
            lst.add(bProvedor);
        }
        return lst;
    }
    
    
}
