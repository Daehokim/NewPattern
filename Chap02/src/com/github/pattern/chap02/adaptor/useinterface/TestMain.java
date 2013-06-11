package com.github.pattern.chap02.adaptor.useinterface;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new PrintAdaptor("Test");
		
		System.out.println(p.getAstro());
		System.out.println(p.getParen());
	}

}
