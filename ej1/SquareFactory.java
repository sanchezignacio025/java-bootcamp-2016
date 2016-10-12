
public class SquareFactory extends AbstractFactory {
	
   @Override
   public Marcos getMarcos(String marcosType){
      return null;
   }

   @Override
   Cuadrado getSquare(String square) {
   
      if(square == null){
         return null;
      }		
      
      if(square.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      }else if(square.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }
      return null;
   }
}