package exercise1;

public class Sumofcubes {
	
	public static int Sumofcubes(int n) {
		int x = (n*(n+1)/2);
	
		return x*x;
		
	}


	public static void main(String[] args) {
		int n=5;
		System.out.println(Sumofcubes(n));
		
	}
	
}
	
