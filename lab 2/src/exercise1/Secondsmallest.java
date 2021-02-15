package exercise1;

import java.util.Arrays;

public class Secondsmallest {
	public static int s_small(int[] a, int total) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		int a[]= {8,6,9,4};
		System.out.println("second smallest :"+s_small(a,5));

	}

}
