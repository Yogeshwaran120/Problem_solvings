package practicepattern;

import java.util.Scanner;

public class p3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=n;i>=1;i--,System.out.println()) {
		for(int j=n;j>i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++) {
			System.out.print("*");
		}

	}
}
}
