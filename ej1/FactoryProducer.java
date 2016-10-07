
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("MARCOS")){
         return new MarcosFactory();
         
      }else if(choice.equalsIgnoreCase("CUADRADO")){
         return new CuadradoFactory();
      }
      
      return null;
   }
}
