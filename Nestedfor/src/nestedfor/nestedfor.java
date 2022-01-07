package nestedfor;

import java.util.Scanner;

public class nestedfor {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int x;
	System.out.println("Enter the value of x");
	x=sc.nextInt();
	if(x%2==0) {
	System.out.println("The number is even");}
	else { System.out.println("The number is odd");
	}
	sc.close();
}
}