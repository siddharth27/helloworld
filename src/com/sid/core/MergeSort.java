package com.sid.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class MergeSort {
	
	
	
	public static int[] mergeSort(int [] arr){
		
		if(arr.length<=1){
			return arr;
		}
		
		
		System.out.println("array length = "+arr.length);
		
		
		int left_arr[] = new int[arr.length / 2];
		int right_arr[] = new int[arr.length-left_arr.length];
		
		System.out.println("left = "+left_arr.length);
		System.out.println("rigth = "+right_arr.length);
		
		System.arraycopy(arr, 0, left_arr, 0, left_arr.length);
		System.arraycopy(arr, left_arr.length, right_arr, 0, right_arr.length);
		
		mergeSort(left_arr);
		mergeSort(right_arr);
		
		
		merge(left_arr,right_arr,arr);
		return arr;
	}
	
	private static void merge(int[] left_arr, int[] right_arr,int[] arr) {
		int first_left = 0;
		int first_right = 0;
		int j = 0;
		while(first_left<left_arr.length && first_right<right_arr.length){
			if(left_arr[first_left]<right_arr[first_right]){
				arr[j] = left_arr[first_left];
				first_left++;
			}
			else{
				arr[j] = right_arr[first_right];
				first_right++;
			}
			j++;
		}
		
		System.arraycopy(left_arr, first_left, arr, j, left_arr.length-first_left);
		System.arraycopy(right_arr, first_right, arr, j, right_arr.length-first_right);
		
	}
	
	public void display(int[] sorted_arr){
		for(int i=0;i<sorted_arr.length;i++){
			System.out.print(sorted_arr[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		String list="";
        int i=0,n=0;
        
        MergeSort s= new MergeSort();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter the list of elements,one element per line");
        System.out.println(" write 'STOP' when list is completed ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
        elementlist=mergeSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Merge Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }

	}

}
