package com.bilgeadam.lesson012;

public class Otobus {

	String renk;
	int yolcuKapasitesi;
	int uzunluk;
	String marka;
	Guzergah guzegah;

	public void otobusBilgileri() {

		System.out.println("renk:" + renk);
		System.out.println("yolcu kapasitesi: " + yolcuKapasitesi);
		System.out.println("uzunluk: " + uzunluk);
		System.out.println("marka: " + marka);
	}

	public void hareketeGec() {
		System.out.println("Otobus harekete geçiyor");
	}

	public void hızlan() {

		System.out.println("Otobus hızlanıyor");
	}

	public void yavasla() {
		System.out.println("Otobus yavaşlıyor");
	}

	public void dur() {

		System.out.println("Otobus durdu");
	}

}
