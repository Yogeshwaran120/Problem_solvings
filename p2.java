package practicepattern;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=n*2-1;
		for(int i=1;i<=n;i++,System.out.println()) {
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
		for(int i=1;i<=3;i++,System.out.println()) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=val-8;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
		}

	}

}
