package exercise6;

public class Sq_difference {
	
	static int calculatedifference(int n) {
		
		int x,y,z,a;
		x=(n*(n+1)*(2*n+1)/6); //sum of squares
		y=(n*(n+1)/2); //sum of number
		z=y*y; //square of sum of numbers
		a=Math.abs(x-z);
		return a;
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(calculatedifference(n));
		

	}

}
