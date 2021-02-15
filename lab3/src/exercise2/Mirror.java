package exercise2;

public class Mirror {
	
	public static String rev(String s)
	{
		return  new StringBuffer(s).reverse().toString();
		
	}
	public static void main(String[] args) {
		String p = "EARTH";
		String s = rev(p);
		System.out.println(p+"|"+s);
		
		
		
		// TODO Auto-generated method stub

	}

}
