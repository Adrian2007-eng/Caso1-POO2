public class ProductoFactory {
  public static Producto 
  
  crearProducto(String tipo){
  if (tipo.equalsIgnoreCase("Electronico")) {
    return new Electronico();
  } else if (tipo.equalsIgnoreCase("Alimento")) {
    return new Alimento();
  } else {
    return null;
  }
}
