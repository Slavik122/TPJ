package com.company;

import java.util.Random;

public class Main {

	public static float calcFunc(float f, byte b){
		return (float)(Math.pow(Math.sin(f),2) + 2*Math.pow(Math.sqrt(Math.abs(b)), 2));
	}
    public static void main(String[] args) {
	    char c2;//ascii values 0...255
	    byte b;//range -128...128
	    float f;//range 1.40239846e-45f...3.40282347e+38f
	    int i = -500;//range -2147483648...2147483647

		System.out.println("Variable i with default value: " + i);

	    f = new Random().nextInt(1_000_000);
        System.out.println("Variable f with random value: " + f);

        i = Math.round(f);
		System.out.println("Variable i with value of variable f: " + i);

		b = (byte) i;
		System.out.println("Variable b with value of variable i: " + b);

		System.out.printf("%.2f", calcFunc(f, b));
    }
}
