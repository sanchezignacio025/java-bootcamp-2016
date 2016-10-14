
public class Chevy extends Chata {

	public Chevy() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("No es un chevy");
		}
	}


}