package Intermedios.Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
  private int idPedido;
  private int idCliente;
  private List<Producto> productos;
  private String estado;

  public Pedido(int idPedido, int idCliente, String estado) {
    this.idPedido = idPedido;
    this.idCliente = idCliente;
    this.productos = new ArrayList<>();
    this.estado = estado;
  }

  public int getIdPedido() {
    return idPedido;
  }

  

  public int getIdCliente() {
    return idCliente;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}
