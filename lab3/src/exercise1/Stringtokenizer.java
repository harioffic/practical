package exercise1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer {
	

	public static void main(String[] args) {
		int n;
		int sum =0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer with space between: ");
		String sc =s.nextLine();
		StringTokenizer sm = new StringTokenizer(sc," ");
		while(sm.hasMoreTokens()) {
			String temp = sm.nextToken();
			n=Integer.parseInt(temp);
			System.out.println(n);
			sum = sum+n;
			
		}
		
		System.out.println("sum of the integer is :"+ sum);
		s.close();
		
		// TODO Auto-generated method stub

	}

}
