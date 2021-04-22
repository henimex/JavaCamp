package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String subeButonu = "�nternet Subesi Butonu";
		System.out.println(subeButonu);

		double dolarDun = 8;
		double dolarBugun = 7;
		int vade = 3;

		if (dolarDun > dolarBugun) {
			System.out.println("Dolar D�n \t : " + dolarDun + " \t Arrow Down " + " \t\nDolar Bug�n \t : " + dolarBugun);
		} else if (dolarDun < dolarBugun) {
			System.out.println("Dolar D�n \t : " + dolarDun + " \t Arrow Up " + " \t\nDolar Bug�n \t : " + dolarBugun);
		} else {
			System.out.println("Dolar D�n \t : " + dolarDun + " \t Arrow Stable " + " \t\nDolar Bug�n \t : " + dolarBugun);
		}
		
		veriTipleri();
		
		System.out.println("----------------------D�ng�ler--------------------------");
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "�ift�i Kredi";
		String kredi3 = "Ta��t Kredi";
		String kredi4 = "Konut Kredi";
		String kredi5 = "Bayram Kredi";
		
		String[] kredilerStrings = {"H�zl� Kredi","�ift�i Kredi","Ta��t Kredi","Konut Kredi","Bayram Kredi"};
		
		System.out.println("----------------------FOREACH--------------------------");
		for (String kredi : kredilerStrings) {
			System.out.println(kredi);
		}
		
		System.out.println("----------------------FOR--------------------------");
		for (int i = 0; i<kredilerStrings.length; i++) {
			System.out.println((i+1) + ".Kredi :  " + kredilerStrings[i] );
		}
		
		System.out.println("----------------------Referans Tipler--------------------------");
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
	}

	public static void veriTipleri() {

		byte sekizBit = 127;
		short onaltiBit = 32767;
		int otuzikiBit = 2147483647;
		long altmisdortBit = 9223372; // -9223372036854775808 & 9223372036854775808
		float folatOtuziki = 15.4f;
		double dbaltmisDort = 15.4;

		char yazi1 = 'A';
		String metin = "Stringlerin rengide t�rbe ye�ili haa";

		boolean dogruYanlis = true;

		System.out.println(
				"Veri Tipleri \t : Atanabilecek maximum degerler tan�mlanm��t�r. Pozitif oldu�u gibi ayn� de�erin Negatifi de verilebilir.");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Byte De�er \t : " + sekizBit);
		System.out.println("Short De�er \t : " + onaltiBit);
		System.out.println("Integer De�er \t : " + otuzikiBit);
		System.out.println("Long De�er \t : " + altmisdortBit);

		System.out.println("Float Deger  \t : " + folatOtuziki);
		System.out.println("Double Deger \t : " + dbaltmisDort);

		System.out.println("Char Deger \t : " + yazi1);
		System.out.println("String Deger \t : " + metin);

		System.out.println("Boolean Dogru  \t : " + dogruYanlis);
	}

}
