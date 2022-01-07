package perimeterofperallelogram;

import java.util.Scanner;

public class perimeterofperallelogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double a, b, perimeter;
		System.out.println("Enter the value of a :");
		a=sc.nextDouble();
		System.out.println("Enter the value of b :");
		b=sc.nextDouble();
		perimeter=2*(a+b);
		System.out.println("Perimeter of Perallelogram =" +perimeter);
		sc.close();
	}


}
