package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String subeButonu = "Ýnternet Subesi Butonu";
		System.out.println(subeButonu);

		double dolarDun = 8;
		double dolarBugun = 7;
		int vade = 3;
				

		if (dolarDun > dolarBugun) {
			System.out.println("Dolar Dün : " + dolarDun + "Arrow Down " + "Dolar Bugün : " + dolarBugun );
		} else if (dolarDun < dolarBugun) {
			System.out.println("Dolar Dün : " + dolarDun + "Arrow Up " + "Dolar Bugün : " + dolarBugun );
		} else {
			System.out.println("Dolar Dün : " + dolarDun + "Arrow Stable " + "Dolar Bugün : " + dolarBugun );
		}
	}

}
