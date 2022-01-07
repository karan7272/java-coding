package AreaOfEquilateralTriangle;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
 public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
	 double a, sqr, area;
	 System.out.println("Enter Value Of A = ");
	 a=sc.nextDouble();
	 sqr=a*a;
	 area=(1.73*sqr)/4;
	 System.out.println("Area Of Equilateraltriangle : "+area);
	 sc.close();
 }
}
