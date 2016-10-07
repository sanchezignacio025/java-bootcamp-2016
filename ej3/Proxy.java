
public class Proxy {

	Chevy chevy;

	public Proxy() {
		System.out.println("El chevy se la banca");
	}

	public void chataNacional() {
		if (chevy == null) {
			chevy = new Chevy();
		}
		chevy.chataNacional();
	}

	

}