package exercise2;

import java.util.Scanner;

public class Trafic_signal {

	public static void main(String[] args) {
		System.out.println("Enter the color :");
		Scanner c=new Scanner (System.in);
		String txt =c.nextLine();
		switch(txt) {
			case "red":
				System.out.println("STOP");
				break;
			
			case "green":
				System.out.println("GO");
				break;
			
			case "orange":
				System.out.println("WAIT");
			
			default :
				System.out.println("ENTER THE VALID TRAFFIC COLOR");
		}
		
		
		// TODO Auto-generated method stub

	}

}
