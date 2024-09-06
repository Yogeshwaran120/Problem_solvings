package practicepattern;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=n*2-1;
    String s=sc.next();
    for(int i=1;i<=k;i++,System.out.println()) {
   
    	for(int j=1;j<=k;j++) {
    	  if(i==j||j==(k-i+1)) {
    		  System.out.print(s);  
    	  }
    	
    	  else {
    		  System.out.print(" ");
    	  }
    }
	}
    
}
}
