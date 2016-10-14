
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("MARCOS")){
         return new MarcosFactory();
         
      }else if(choice.equalsIgnoreCase("SQUARE")){
         return new SquareFactory();
      }
      
      return null;
   }
}
