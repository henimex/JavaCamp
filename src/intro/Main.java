package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String subeButonu = "�nternet Subesi Butonu";
		System.out.println(subeButonu);

		double dolarDun = 8;
		double dolarBugun = 7;
		int vade = 3;
				

		if (dolarDun > dolarBugun) {
			System.out.println("Dolar D�n : " + dolarDun + "Arrow Down " + "Dolar Bug�n : " + dolarBugun );
		} else if (dolarDun < dolarBugun) {
			System.out.println("Dolar D�n : " + dolarDun + "Arrow Up " + "Dolar Bug�n : " + dolarBugun );
		} else {
			System.out.println("Dolar D�n : " + dolarDun + "Arrow Stable " + "Dolar Bug�n : " + dolarBugun );
		}
	}

}
