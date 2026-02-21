package com.geometryCalculator;

public class bangunRuang {
	public double kubus(double rusuk) {
		return rusuk*rusuk*rusuk;
	}
	public double bola(double radius) {
		return 4.0/3*Math.PI*radius*radius*radius;
	}
	public double kerucut(double radius, double tinggi) {
		return 1.0/3*Math.PI*radius*radius*tinggi;
	}
	public double balok(double panjang, double lebar, double tinggi) {
		return panjang*lebar*tinggi;
	}
	public double tabung(double radius, double tinggi) {
		return Math.PI*radius*radius*tinggi ;
	}
}
