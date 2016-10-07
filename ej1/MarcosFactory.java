
public class MarcosFactory extends AbstractFactory {
	
   @Override
   public Marcos getMarcos(String marcosType){
   
      if(marcosType == null){
         return null;
      }		
      
      if(marcosType.equalsIgnoreCase("CHICO")){
         return new Chico();
         
      }else if(marcosType.equalsIgnoreCase("GRANDE")){
         return new Grande();
         
      }
      
      return null;
   }
   
   @Override
   Cuadrado getCuadrado(String cuadrado) {
      return null;
   }
}