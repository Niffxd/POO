package Ejercicios.EjerciciosVarios.Inventario;

public class Main {
  public static void main(String[] args) {
    Inventario inventario = new Inventario();

    Producto producto1 = new Producto("Libro", 24.52,5);
    Producto producto2 = new Producto("Pelota", 12.2,6);
    Producto producto3 = new Producto("Mouse", 10.4,10);
    Producto producto4 = new Producto("Tableta", 200.12,15);
    Producto producto5 = new Producto("Radio", 24.72,51);
    Producto producto6 = new Producto("Campana", 19.6,52);
    Producto producto7 = new Producto("Silla", 90.3,14);

    inventario.agregarProducto(producto1);
//    inventario.agregarProducto(producto2);
//    inventario.agregarProducto(producto3);
//    inventario.agregarProducto(producto4);
//    inventario.agregarProducto(producto5);
//    inventario.agregarProducto(producto6);
//    inventario.agregarProducto(producto7);

    System.out.println(inventario.getProductos());

    System.out.println(inventario.getTotalProductos());

    System.out.println(inventario.getValorInventario());

    inventario.eliminarProducto(producto2);
  }
}
