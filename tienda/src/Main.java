public class Main {
  public statis void main(String[] args) {
    Producto p = ProductoFactory.crearProducto("Electronico ");
    ProductoBuilder builder = new ProductoBuilder();
    builder.crearProducto(p);
    builder.setNombre("Laptop");
    builder.setPrecio(2500.50);
    builder.setMarca("HP");
    builder.setStock(5);
    builder.setCategoria("Tecnologia");
    Producto productoFinal = builder.build();
    productoFinal.mostrarInfo();
  }
}
