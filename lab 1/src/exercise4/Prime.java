package exercise4;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int a ;
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		a=s.nextInt();
		for(int i=2;i<a;i++) {
			p=0;
			for(int j = 2;j<i;j++) {
				if(i%j==0)
					p=1;
				
			}
			if(p==0)
				System.out.println(i);		}
		
	}

}
