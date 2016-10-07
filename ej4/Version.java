
public class Version {
	
	private Chatabuilder chataBuilder;
	
	public void constructChata(){
		
		chataBuilder.crearChata ();
		chataBuilder.buildModel ();
	}
	
	public void setChataBuilder(Chatabuilder cb){
		chataBuilder = cb;
	}
	public Chata getChata() {
		return chataBuilder.getChata();
		
	}
}