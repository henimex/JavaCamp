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
		
		
		veriTipleri();
		
	}
	
	public static void veriTipleri() {
				//Veri Tipleri : veri tibleri + ve - arasýnda maksimum degerleri verilmiþtir.
				byte sekizBit = 127;
				short onaltiBit = 32767;
				int otuzikiBit = 2147483647;
				long altmisdortBit = 9223372; //-9223372036854775808 ile 9223372036854775808
				float folatOtuziki = 15.4f;
				double dbaltmisDort = 15.4;
				
				char yazi1 = 'A';
				String metin = "Stringlerin rengide türbe yeþili haa";
				
				boolean dogruYanlis = true;
				System.out.println("Veri Tipleri : Atanabilecek maximum degerler tanýmlanmýþtýr. Pozitif olduðu gibi ayný deðerin Negatifi de verilebilir.");
				System.out.println("---------------------------------------------------------------");
				System.out.println("Byte Deðer: " + sekizBit);
		        System.out.println("Short Deðer: " + onaltiBit);
		        System.out.println("Integer Deðer: " + otuzikiBit);
		        System.out.println("Long Deðer: " + altmisdortBit);
		 
		        System.out.println("Float Deger: " + folatOtuziki);
		        System.out.println("Double Deger: " + dbaltmisDort);
		 
		        System.out.println("Char Deger: " + yazi1);
		        System.out.println("String Deger: " + metin);
		 
		        System.out.println("Boolean Dogru: " + dogruYanlis);
	}

}
