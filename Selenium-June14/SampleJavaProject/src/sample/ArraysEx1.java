package sample;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		int[] int1 = new int[5];
		int[] int2 = {1,2,3,4,5}; 
		int[] int3 = new int[]{13,12,11,15,14}; 
		
		int int4[] = {1,2,3,4,5}; 
		
//		System.out.println(int2[0]);
//		
//		for(int i=0;i<int2.length;i++){
//			System.out.println(int2[i]);
//		}
		System.out.println("-----------------before sorting-----------------");
		
		for( int i:int3){
			System.out.println(i);
		}
		
		System.out.println("-----------------after sorting-----------------");
		
		Arrays.sort(int3);
		
		for( int i:int3){
			System.out.println(i);
		}

	}

}
