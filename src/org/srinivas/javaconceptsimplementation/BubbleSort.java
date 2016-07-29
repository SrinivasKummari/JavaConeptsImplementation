package org.srinivas.javaconceptsimplementation;

public class BubbleSort {

	public static void bubbleSortalgo(int[] arr){
		int size=arr.length;
		for(int i=size;i>=0;i--){
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={5,4,3,2,1};
		bubbleSortalgo(arr);
	}

}
