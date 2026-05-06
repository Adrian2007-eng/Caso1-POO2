public abstract class Producto {
  protected String nombre;
  protected double precio;
  protected String marca;
  protected int stock;
  protected String categoria;
  
  public void mostrarInfo(){
    System.out.println("nombre: " + nombre);
    System.out.println("Precio: " + precio);
    System.out.println("Marca: " + marca);
    System.out.println("Stock: " + stock);
    System.out.println("Categoria: " + categoria);
  }
}
