package Intermedios.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private int idCliente;
  private String nombre;
  private String correo;
  private List<Producto> carrito;


  public Cliente(int idCliente, String nombre, String correo) {
    this.idCliente = idCliente;
    this.nombre = nombre;
    this.correo = correo;
    this.carrito = new ArrayList<>();
  }

  public void agregarProducto(Producto producto) {
    carrito.add(producto);
  }

  public void eliminarProducto(Producto producto) {
    carrito.remove(producto);
  }

  public void verProductos() {
    if(carrito.isEmpty()) {
      System.out.println("No hay productos.");
    } else {
      System.out.println("\nCarrito: \n\n");
      for (Producto producto : carrito) {
        System.out.println("Producto: " + producto.getNombre() + ".\n");
      }
    }
  }

  public int getIdCliente() {
    return idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }
}
