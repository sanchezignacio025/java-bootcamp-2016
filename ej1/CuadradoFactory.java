
public class CuadradoFactory extends AbstractFactory {
	
   @Override
   public Marcos getMarcos(String marcosType){
      return null;
   }

   @Override
   Cuadrado getCuadrado(String cuadrado) {
   
      if(cuadrado == null){
         return null;
      }		
      
      if(cuadrado.equalsIgnoreCase("REDONDO")){
         return new Redondo();
         
      }else if(cuadrado.equalsIgnoreCase("RECTANGULO")){
         return new Rectangulo();
         
      }
      return null;
   }
}