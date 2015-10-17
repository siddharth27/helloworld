package com.sid.core;

/*
 *       					INSERTION SORT
 *       					--------------
 * Start from 5 and we keep comparing to all the integers behind it.
 * Eg.. Here we compare 5 with 6, then 2 with 5 & 6 and so onn
 * If the int at previous position is > than the current int then we replace
 * Complexity and worst case is O(n^2)
 * */

public class InsertionSort {
static int arr[] = {6,5,2,4,1,3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++){
			int x = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>x){
				arr[j]=arr[j-1];
				j-=1;
				arr[j]=x;
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]);
		}
	}

}
