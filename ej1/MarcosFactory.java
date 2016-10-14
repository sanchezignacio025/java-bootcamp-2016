
public class MarcosFactory extends AbstractFactory {
	
   @Override
   public Marcos getMarcos(String marcosType){
   
      if(marcosType == null){
         return null;
      }		
      
      if(marcosType.equalsIgnoreCase("SMALL")){
         return new Small();
         
      }else if(marcosType.equalsIgnoreCase("BIG")){
         return new Big();
         
      }
      
      return null;
   }
   
   @Override
   Square getSquare(String square) {
      return null;
   }
}