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
		
		
		veriTipleri();
		
	}
	
	public static void veriTipleri() {
				//Veri Tipleri : veri tibleri + ve - aras�nda maksimum degerleri verilmi�tir.
				byte sekizBit = 127;
				short onaltiBit = 32767;
				int otuzikiBit = 2147483647;
				long altmisdortBit = 9223372; //-9223372036854775808 ile 9223372036854775808
				float folatOtuziki = 15.4f;
				double dbaltmisDort = 15.4;
				
				char yazi1 = 'A';
				String metin = "Stringlerin rengide t�rbe ye�ili haa";
				
				boolean dogruYanlis = true;
				System.out.println("Veri Tipleri : Atanabilecek maximum degerler tan�mlanm��t�r. Pozitif oldu�u gibi ayn� de�erin Negatifi de verilebilir.");
				System.out.println("---------------------------------------------------------------");
				System.out.println("Byte De�er: " + sekizBit);
		        System.out.println("Short De�er: " + onaltiBit);
		        System.out.println("Integer De�er: " + otuzikiBit);
		        System.out.println("Long De�er: " + altmisdortBit);
		 
		        System.out.println("Float Deger: " + folatOtuziki);
		        System.out.println("Double Deger: " + dbaltmisDort);
		 
		        System.out.println("Char Deger: " + yazi1);
		        System.out.println("String Deger: " + metin);
		 
		        System.out.println("Boolean Dogru: " + dogruYanlis);
	}

}
