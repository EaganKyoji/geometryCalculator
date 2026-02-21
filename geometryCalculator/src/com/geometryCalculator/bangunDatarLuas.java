package com.geometryCalculator;

public class bangunDatarLuas {
		public double persegi(double sisi) {
			return sisi*sisi;
		}
		public double segitiga(double alas, double tinggi) {
			return 1.0/2*alas*tinggi;
		}
		public double lingkaran(double radius) {
			return Math.PI*radius*radius;
		}
		public double persegiPanjang(double panjang, double lebar) {
			return panjang*lebar;
		}
		public double trapesium(double a, double b, double t) {
			return 1.0/2*(a+b)*t;
		}
}
 	