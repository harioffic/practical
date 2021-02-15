package exercise4;

import java.util.Arrays;
import java.util.Collections;

public class Remove_dupl {
	static int Removeduplicates(int arr[],int n){
		if(n==0||n==1)
			return n;
		int j=0;
		
		for (int i=0;i<n-1;i++)
			if(arr[i] !=arr[i+1])
				arr[j++]=arr[i];
		arr[j++]=arr[n-1];
		return j;
		
		
	}

	public static void main(String[] args) {
		int arr[]={1,2,2,3,4,5,6,6,7};
		int n=arr.length;
		
		n=Removeduplicates(arr,n);
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+"");
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.printf("Descending order of array",Arrays.toString(arr));
		
		
		

	}

}
