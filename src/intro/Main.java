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
			System.out.println("Dolar Dün \t : " + dolarDun + " \t Arrow Down " + " \t\nDolar Bugün \t : " + dolarBugun );
		} else if (dolarDun < dolarBugun) {
			System.out.println("Dolar Dün \t : " + dolarDun + " \t Arrow Up " + " \t\nDolar Bugün \t : " + dolarBugun );
		} else {
			System.out.println("Dolar Dün \t : " + dolarDun + " \t Arrow Stable " + " \t\nDolar Bugün \t : " + dolarBugun );
		}
		
		veriTipleri();
	}
	
	public static void veriTipleri() {
		
		byte sekizBit = 127;
		short onaltiBit = 32767;
		int otuzikiBit = 2147483647;
		long altmisdortBit = 9223372; //-9223372036854775808 ile 9223372036854775808
		float folatOtuziki = 15.4f;
		double dbaltmisDort = 15.4;
				
		char yazi1 = 'A';
		String metin = "Stringlerin rengide türbe yeþili haa";
				
		boolean dogruYanlis = true;
		
		System.out.println("Veri Tipleri \t : Atanabilecek maximum degerler tanýmlanmýþtýr. Pozitif olduðu gibi ayný deðerin Negatifi de verilebilir.");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Byte Deðer \t : " + sekizBit);
		System.out.println("Short Deðer \t : " + onaltiBit);
		System.out.println("Integer Deðer \t : " + otuzikiBit);
		System.out.println("Long Deðer \t : " + altmisdortBit);
		 
		System.out.println("Float Deger  \t : " + folatOtuziki);
		System.out.println("Double Deger \t : " + dbaltmisDort);
		 
		System.out.println("Char Deger \t : " + yazi1);
		System.out.println("String Deger \t : " + metin);
		 
		System.out.println("Boolean Dogru  \t : " + dogruYanlis);
	}

}
