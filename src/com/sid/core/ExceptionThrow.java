package com.sid.core;

public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new MyException();
		}
		catch(MyException me){
			me.printStackTrace();
		}
	}

}
