
public class Version {
	
	private ChataBuilder chataBuilder;
	
	public void constructChata(){
		
		chataBuilder.crearChata();
		chataBuilder.buildModel();
	}
	
	public void setChataBuilder(ChataBuilder cb){
		chataBuilder = cb;
	}
	public Chata getChata() {
		return chataBuilder.getChata();
		
	}
}