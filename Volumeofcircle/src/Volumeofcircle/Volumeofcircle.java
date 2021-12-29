package Volumeofcircle;

import java.util.Scanner;

public class Volumeofcircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double r, h, volume;
		System.out.println("Enter the value of r :");
		r=sc.nextDouble();
		System.out.println("Enter value of h :");
		h=sc.nextDouble();
		volume=3.14*r*2*h;
		System.out.println("Volume of circle = " +volume);
		sc.close();
	}
}
