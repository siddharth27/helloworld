package com.sid.core;

public class BubbleSort {

	static int arr[] = {1,1,1,0,1,0,1,0};
	
	public static void main(String[] args) {
		
		System.out.println("UnSorted Array");
		System.out.println("--------------");
		display();
		
		int n=arr.length;
		int t=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-1;j++){
				if(arr[j-1]>arr[j]){
					t= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		System.out.println("Sorted Array");
		System.out.println("--------------");
		display();
	}
	
	public static void display(){
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]);
		}
		System.out.println();
	}

}
