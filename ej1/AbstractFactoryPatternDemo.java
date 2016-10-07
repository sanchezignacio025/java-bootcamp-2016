
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {

      //get shape factory
      AbstractFactory marcosFactory = FactoryProducer.getFactory("MARCOS");

      //get an object of Marcos Chico
      Marcos opcion1 = marcosFactory.getMarcos("CHICO");

      //call draw method of Marcos Chico
      opcion1.draw();

      //get an object of Marcos Grande
      Marcos opcion2 = marcosFactory.getMarcos("GRANDE");

      //call draw method of Shape Rectangle
      opcion2.draw();
      
      

      //get cuadrado factory
      AbstractFactory cuadradoFactory = FactoryProducer.getFactory("CUADRADO");

      //get an object of Cuadrado Rectangulo
      Cuadrado cuadrado1 = cuadradoFactory.getCuadrado("RECTANGULO");

      //call fill method of Rectangulo
      cuadrado1.fill();

      //get an object of Cuadrado Redondo
      Cuadrado cuadrado2 = cuadradoFactory.getCuadrado("Redondo");

      //call fill method of Redondo
      cuadrado2.fill();

      
   }
}
