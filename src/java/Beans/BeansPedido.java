
package Beans;

import java.sql.Timestamp;

public class BeansPedido {
    private int id_Pedido;
    private Timestamp fecha_Inicio;
    private int precio;
    private int id_Estado_Pedido;
    private int id_Producto;
    private int id_Repartdor;
    private int id_Cliente;
    private Timestamp fecha_Entrega;

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public Timestamp getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Timestamp fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_Estado_Pedido() {
        return id_Estado_Pedido;
    }

    public void setId_Estado_Pedido(int id_Estado_Pedido) {
        this.id_Estado_Pedido = id_Estado_Pedido;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getId_Repartdor() {
        return id_Repartdor;
    }

    public void setId_Repartdor(int id_Repartdor) {
        this.id_Repartdor = id_Repartdor;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Timestamp getFecha_Entrega() {
        return fecha_Entrega;
    }

    public void setFecha_Entrega(Timestamp fecha_Entrega) {
        this.fecha_Entrega = fecha_Entrega;
    }
    
}
