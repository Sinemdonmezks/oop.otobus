package com.bilgeadam.lesson012;

public class OtobusTest {

	public static void main(String[] args) {
		Otobus otobus = new Otobus();

		otobus.renk = "pembe";
		otobus.marka = "Mersedes";
		otobus.uzunluk = 10;

		otobus.otobusBilgileri();
		System.out.println("--------------------");

		otobus.hareketeGec();
		otobus.hızlan();
		otobus.yavasla();
		otobus.dur();

		System.out.println("--------------------");
		Durak durak1 = new Durak();
		durak1.adres = "Bursa";
		durak1.durakAdı = "Çamlıca";
		durak1.durakNo = "12";

		Durak durak2 = new Durak();
		durak2.adres = "Bursa";
		durak2.durakAdı = "Odunluk";
		durak2.durakNo = "13";

		Durak durak3 = new Durak();
		durak3.adres = "Bursa";
		durak3.durakAdı = "Mihraplı";
		durak3.durakNo = "14";

		Guzergah guzergah = new Guzergah();// güzergah nesnesi olustu

		guzergah.hatNo = "E2";
		guzergah.duraklar = new Durak[3];
		guzergah.duraklar[0] = durak1;
		guzergah.duraklar[1] = durak2;
		guzergah.duraklar[2] = durak3;

		otobus.guzegah = guzergah;

		for (int i = 0; i < otobus.guzegah.duraklar.length; i++) {
			System.out.println(otobus.guzegah.duraklar[i].durakNo + ",");
		}
		System.out.println("---------------");
		Durak[] duraklar = otobus.guzegah.duraklar;
		for (int i = 0; i < duraklar.length; i++) {
			System.out.println(duraklar[i].durakNo + ",");
		}
	}
}
