
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {

      //get shape factory
      AbstractFactory marcosFactory = FactoryProducer.getFactory("MARCOS");

      //get an object of Marcos Small
      Marcos opcion1 = marcosFactory.getMarcos("SMALL");

      //call draw method of Marcos Small
      opcion1.draw();

      //get an object of Marcos Big
      Marcos opcion2 = quareFactory.getMarcos("Big");

      //call draw method of Shape Rectangle
      opcion2.draw();
      
      

      //get cuadrado factory
      AbstractFactory squareFactory = FactoryProducer.getFactory("SQUARE");

      //get an object of Square Rectangle
      Cuadrado cuadrado1 = squareFactory.getSquare("RECTANGLE");

      //call fill method of Rectangle
      cuadrado1.fill();

      //get an object of Square Circle
      Square square2 = squareFactory.getSquare("Redondo");

      //call fill method of Circle
      square2.fill();

      
   }
}
