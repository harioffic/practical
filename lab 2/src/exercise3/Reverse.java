package exercise3;

public class Reverse {

	public static void main(String[] args) {
		int num = 987654,reverse=0;
		while(num!=0) {
			int reminder = num%10;
			reverse=reverse*10+reminder;
			num=num/10;
			
			
		}
		System.out.println("The reverse of the given nym is "+ reverse);
		// TODO Auto-generated method stub

	}

}
