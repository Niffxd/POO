package Ejercicios.EjerciciosVarios.Inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
  private List<Producto> productos;

  public Inventario() {
    this.productos = new ArrayList<>();
  }

  public String getProductos() {
    if(productos.isEmpty()) return "No existen productos.";
    else {
      String lista = "\nProductos: \n\n";

      for (Producto item : productos) {
        lista += item.getNombre() + "\n";
      }

      return lista;
    }
  }

  public String getTotalProductos() {
    if(productos.isEmpty()) return "No existen productos.";
    else return "Total de productos: " + productos.size();
  }

  public void agregarProducto(Producto producto) {
    productos.add(producto);
    // System.out.println("Producto agregado.");
  }

  public void eliminarProducto(Producto producto) {
    if(productos.isEmpty()) System.out.println("No existen products.");
    else {
      for (Producto item : productos) {
        if (item.equals(producto)) {
          productos.remove(item);
          item.setStock(0);
          System.out.println("Producto eliminado.");
          break;
        } else {
          System.out.println("Producto no encontrado.");
        }
      }

    }
  }

  public String getValorInventario () {
    if(productos.isEmpty()) return "No existen productos.";
    else {
      double precio = 0;
      for (Producto item : productos) {
        precio += (item.getPrecio() * item.getStock());
      }
      return String.format("El valor total es de: $%.2f", precio);
    }
  }
}
