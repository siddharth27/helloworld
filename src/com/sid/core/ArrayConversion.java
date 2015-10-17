package com.sid.core;

public class ArrayConversion {
	
	/*Converting the following series:
	 * GGG
	 * RRR
	 * BBB
	 * 
	 * TO:
	 * 
	 * GRB
	 * GRB
	 * GRB
	 */
	

	public static String[][] arraySeries = new String[][]{ {"G","G","G"}, {"R","R","R"}, {"B","B","B"} };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int col=0;col<=arraySeries[0].length-1;col++){
			for(int row=0;row<=arraySeries.length-1;row++){
				
				System.out.print(arraySeries[row][col]);
				
				
			}
			System.out.print("\n");
		}
	}

}
