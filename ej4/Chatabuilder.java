
public abstract class Chatabuilder {
     protected Chata chata;
     public Chata getChata(){
    	 return chata;
     }
     public void crearChata(){
    	 chata= new Chata();
     }
     public abstract void buildModel();
}
