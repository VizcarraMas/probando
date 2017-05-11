package productos;

import java.sql.ResultSet;

public class productoss {
   Conexion cn = new Conexion();

    public void insertar(String id, String nombre, String precio, String presentacion) {
        cn.UID("INSERT INTO productos(id,nombre,precio,presentacion) VALUES('" + id + "','" + nombre + "','" + precio + "','" + presentacion + "')");
    } 
     public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(id) FROM productos"));
    }
     public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(id) FROM productos"));
    }
//     public ResultSet llenarTabla() {
//        return (cn.getValores("SELECT id,nombre,precio,presentacion FROM productos"));
//    }
}
