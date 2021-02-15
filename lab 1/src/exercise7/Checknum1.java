package exercise7;

import java.util.Scanner;

public class Checknum1 {

	public static void main(String[] args) {
		int num;
		boolean value=false;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		num=s.nextInt();
		
		int digit =num%10;
		num=num/10;
		
		while(num>0) {
			if(digit<=num%10) {
				value=true;
				break;
				
			}
			digit=num%10;
			num=num/10;
			
		}
		
		if(value) {
			System.out.println(num+" are not in increasing order");
			
		}
		else {
			System.out.println(num+" are in increasing order");
		}
	}

}
