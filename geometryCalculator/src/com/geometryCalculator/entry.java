package com.geometryCalculator;
import java.util.Scanner;

public class entry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		bangunDatarLuas luas = new bangunDatarLuas();
		bangunDatarKeliling keliling = new bangunDatarKeliling();
		bangunRuang volume = new bangunRuang();
		
		
		System.out.println("+     PROGRAM GEOMETRI    +");
		System.out.println("+=========================+");
		System.out.println("+1. Volume bangun ruang   +");
		System.out.println("+2. Luas bangun datar     +");
		System.out.println("+3. Keliling bangun datar +");
		System.out.println("+=========================+");
		
		int pilihan;
		System.out.print("Masukkan pilihan: ");
		pilihan = input.nextInt();
		switch(pilihan) {
		case 1:
			System.out.println("\n+   PROGRAM BANGUN RUANG  +");
			System.out.println("+=========================+");
			System.out.println("+1. Kubus                 +");
			System.out.println("+2. Bola                  +");
			System.out.println("+3. Balok                 +");
			System.out.println("+4. Kerucut               +");
			System.out.println("+5. Tabung                +");
			System.out.println("+=========================+");	
			int pBR;
			double rusuk, radius, panjang, lebar, tinggi;
			System.out.print("Masukkan pilihan: ");
			pBR = input.nextInt();
			switch(pBR) {
			case 1:
				System.out.println("\n+---Menghitung Kubus---+");
				System.out.println("Masukkan nilai rusuk: ");
				rusuk = input.nextDouble();
				System.out.println("Volume kubus = "+volume.kubus(rusuk));
				break;
			case 2:
				System.out.println("\n+---Menghitung Bola---+");
				System.out.println("Masukkan nilai radius: ");
				radius = input.nextDouble();
				System.out.println("Volume bola = "+volume.bola(radius));
				break;
			case 3:
				System.out.println("\n+---Menghitung Balok---+");
				System.out.println("Masukkan nilai panjang: ");
				panjang = input.nextDouble();
				System.out.println("Masukkan nilai lebar: ");
				lebar = input.nextDouble();
				System.out.println("Masukkan nilai tinggi: ");
				tinggi = input.nextDouble();
				System.out.println("Volume balok = "+volume.balok(panjang, lebar, tinggi));
				break;
			case 4:
				System.out.println("\n+---Menghitung Kerucut---+");
				System.out.println("Masukkan nilai radius: ");
				radius = input.nextDouble();
				System.out.println("Masukkan nilai tinggi: ");
				tinggi = input.nextDouble();
				System.out.println("Volume kerucut = "+volume.kerucut(radius, tinggi));
				break;
			case 5:
				System.out.println("\n+---Menghitung Tabung---+");
				System.out.println("Masukkan nilai radius: ");
				radius = input.nextDouble();
				System.out.println("Masukkan nilai tinggi: ");
				tinggi = input.nextDouble();
				System.out.println("Volume tabung = "+volume.tabung(radius, tinggi));
				break;
			default:
				System.out.println("Masukan tidak valid!!!");
			}
			break;
		case 2:
			System.out.println("\n+PROGRAM LUAS BANGUN DATAR+");
			System.out.println("+=========================+");
			System.out.println("+1. Persegi               +");
			System.out.println("+2. Segitiga              +");
			System.out.println("+3. Lingkaran             +");
			System.out.println("+4. Persegi Panjang       +");
			System.out.println("+5. Trapesium             +");
			System.out.println("+=========================+");
			int pLBD;
			double sisi, alas, a, b, c;
			System.out.print("Masukkan pilihan: ");
			pLBD = input.nextInt();
			switch(pLBD) {
			case 1:
				System.out.println("\n+---Menghitung Persegi---+");
				System.out.println("Masukkan nilai sisi: ");
				sisi = input.nextDouble();
				System.out.println("Luas persegi = "+luas.persegi(sisi));
				break;
			case 2:
				System.out.println("\n+---Menghitung Segitiga---+");
				System.out.println("Masukkan nilai alas: ");
				alas = input.nextDouble();
				System.out.println("Masukkan nilai tinggi: ");
				tinggi = input.nextDouble();
				System.out.println("Luas segitiga = "+luas.segitiga(alas, tinggi));
				break;
			case 3:
				System.out.println("\n+---Menghitung Lingkaran---+");
				System.out.println("Masukkan nilai radius: ");
				radius = input.nextDouble();
				System.out.println("Luas lingkaran = "+luas.lingkaran(radius));
				break;
			case 4:
				System.out.println("+---Menghitung Persegi Panjang---+");
				System.out.println("Masukkan nilai panjang: ");
				panjang = input.nextDouble();
				System.out.println("Masukkan nilai lebar: ");
				lebar = input.nextDouble();
				System.out.println("Luas persegi panjang = "+luas.persegiPanjang(panjang, lebar));
				break;
			case 5:
				System.out.println("+---Menghitung Trapesium---+");
				System.out.println("Masukkan nilai a: ");
				a = input.nextDouble();
				System.out.println("Masukkan nilai b: ");
				b = input.nextDouble();
				System.out.println("Masukkan nilai tinggi: ");
				tinggi = input.nextDouble();
				System.out.println("Luas trapesium = "+luas.trapesium(a, b, tinggi));
				break;
			default:
				System.out.println("Masukan tidak valid!!!");
			}
			break;
		case 3:
			System.out.println("\n+PROGRAM KELILING BANGUN DATAR+");
			System.out.println("+=============================+");
			System.out.println("+1. Persegi                   +");
			System.out.println("+2. Persegi panjang           +");
			System.out.println("+3. Lingkaran                 +");
			System.out.println("+4. Segitiga                  +");
			System.out.println("+5. Layang-layang             +");
			System.out.println("+=============================+");
			int pKBD;
			double d;
			System.out.print("Masukkan pilihan: ");
			pKBD = input.nextInt();
			switch(pKBD) {
			case 1:
				System.out.println("\n+---Menghitung Persegi---+");
				System.out.println("Masukkan nilai sisi: ");
				sisi = input.nextDouble();
				System.out.println("Keliling persegi = "+keliling.persegi(sisi));
				break;
			case 2:
				System.out.println("\n+---Menghitung Persegi Panjang---+");
				System.out.println("Masukkan nilai panjang: ");
				panjang = input.nextDouble();
				System.out.println("Masukkan nilai lebar: ");
				lebar = input.nextDouble();
				System.out.println("keliling persegi panjang = "+keliling.persegiPanjang(panjang, lebar));
				break;
			case 3:
				System.out.println("\n+---Menghitung Lingkaran---+");
				System.out.println("Masukkan nilai radius: ");
				radius = input.nextDouble();
				System.out.println("Keliling lingkaran = "+keliling.lingkaran(radius));
				break;
			case 4:
				System.out.println("+---Menghitung Segitiga---+");
				System.out.println("Masukkan nilai a: ");
				a = input.nextDouble();
				System.out.println("Masukkan nilai b: ");
				b = input.nextDouble();
				System.out.println("Masukkan nilai c: ");
				c = input.nextDouble();
				System.out.println("Keliling segitiga = "+keliling.segitiga(a, b, c));
				break;
			case 5:
				System.out.println("+---Menghitung Layang-Layang---+");
				System.out.println("Masukkan nilai a: ");
				a = input.nextDouble();
				System.out.println("Masukkan nilai b: ");
				b = input.nextDouble();
				System.out.println("Masukkan nilai c: ");
				c = input.nextDouble();
				System.out.println("Masukkan nilai d: ");
				d = input.nextDouble();
				System.out.println("Keliling layang-layang = "+keliling.layangLayang(a, b, c, d));
				break;
			default:
				System.out.println("Masukan tidak valid!!!");
			break;
		}
		input.close();
	}

}
}
