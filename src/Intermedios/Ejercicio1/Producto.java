package Intermedios.Ejercicio1;

public class Producto {
  private int idProducto;
  private String nombre;
  private double precio;
  private int stock;

  public Producto(int idProducto, String nombre, double precio) {
    this.idProducto = idProducto;
    this.nombre = nombre;
    this.precio = precio;
    this.stock = 0;
  }

  public Producto(int idProducto, String nombre, double precio, int stock) {
    this.idProducto = idProducto;
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  public int getId() {
    return idProducto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}
