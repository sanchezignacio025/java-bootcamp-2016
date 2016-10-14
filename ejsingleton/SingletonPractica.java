
class SingletonPractica {
	private static SingletonPractica singletonPractica = null;

	private SingletonPractica() {
	}

	public static SingletonPractica getInstance() {
		if (singletonPractica == null) {
			singletonPractica = new SingletonPractica();
		}
		return singletonPractica;
	}

	public void sayNacho() {
		System.out.println("Este ejercicio esta muy bien hecho");
	}
}


