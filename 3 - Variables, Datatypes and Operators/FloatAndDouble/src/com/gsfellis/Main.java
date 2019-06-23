package com.gsfellis;

public class Main {

    public static void main(String[] args) {
		double pounds;
		double kilograms;
		double ratio = 0.45359237;

		pounds = 280d;
		kilograms = pounds * ratio;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
