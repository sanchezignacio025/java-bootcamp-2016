
public class ProxyMain {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();

		Ford ford = new Ford();
		ford.chataNacional();

		proxy.chataNacional();
		
	}

}
