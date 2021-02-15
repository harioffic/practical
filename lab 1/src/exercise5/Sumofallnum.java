package exercise5;

public class Sumofallnum {
	
	static int sum(int n) {
		int a1,a2,a3;
		a1=((n/3))*(2*3+(n/3-1)*3)/2;
		a2=((n/5))*(2*5+(n/5-1)*5)/2;
		a3=((n/20))*(2*20+(n/20-1)*20)/2;
		
		return a1+a2+a3;
	}
	public static void main(String[] args) {
		int n=40;
		System.out.print(sum(20));

	}

}
