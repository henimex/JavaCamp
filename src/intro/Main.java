package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String subeButonu = "Ýnternet Subesi Butonu";
		System.out.println(subeButonu);

		int dolarDun = 650;
		int dolarBugun = 1650;

		if (dolarDun > dolarBugun) {
			System.out.println("Arrow Down");
		} else if (dolarDun < dolarBugun) {
			System.out.println("Arrow Up");
		} else {
			System.out.println("Stable Arrow");
		}
	}

}
