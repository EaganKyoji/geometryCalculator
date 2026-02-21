package com.geometryCalculator;

public class bangunDatarKeliling {
	public double persegi(double sisi) {
		return 4*sisi;
	}
	public double persegiPanjang(double panjang, double lebar) {
		return 2*(panjang+lebar);
	}
	public double lingkaran(double radius) {
		return 2*Math.PI*radius;
	}
	public double segitiga(double a, double b, double c) {
		return a+b+c;
	}
	public double layangLayang(double a, double b, double c, double d) {
		return a+b+c+d;
	}
}
