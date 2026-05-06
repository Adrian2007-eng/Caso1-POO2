public class ProductoBuilder {
  private Producto producto;
  public void crearProducto(Producto p) {
    this.producto = p;
  }
  
  public void setNombre(String nombre) {
    producto.precio = precio;
  }
  public void setMarca(String marca) {
    producto.marca = marca;
  }
  public void setStock(int stock) {
    producto.stock = stock;
  }
  public void setCategoria(String categoria) {
    producto.categoria = categoria;
  }
  public Producto build() {
    return producto;
  }
}
