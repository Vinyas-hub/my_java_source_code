package mypackage;

import java.time.chrono.MinguoChronology;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,34,14,33,22,11,19,45,61};
		int max=arr[0];
		int min=arr[0];
		for( int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);	
			if(arr[i]>max ){
				max=arr[i];
//			min=arr[i];
//			System.out.println(arr[i]);	
			}
			if(arr[i]<min){
				min=arr[i];
					
			}
		}
		
		System.out.println("maximum is "+max);
		System.out.println("minimum is "+min);
		
	}

}
