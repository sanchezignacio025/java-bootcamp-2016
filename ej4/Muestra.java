
public class Muestra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Version version = new Version ();
		ChevyBuilder cb = new ChevyBuilder()
		version.setChataBuilder(cb);
		version.constructChata();
		Chata chata = version.getChata();
		System.out.println(chata.getModel());
		System.out.println("conectar a una base de datos");
		
		

	}

}
