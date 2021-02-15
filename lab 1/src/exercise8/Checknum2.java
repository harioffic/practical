package exercise8;

public class Checknum2 {
	
	public static void pow(int n) {
		
		double x = Math.ceil(Math.log(n)/Math.log(2));
		double y = Math.floor(Math.log(n)/Math.log(2));
		if(x==y)
			System.out.println(n +" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}

	public static void main(String[] args) {
		int n =512;
		pow(n);
		
	}

}

