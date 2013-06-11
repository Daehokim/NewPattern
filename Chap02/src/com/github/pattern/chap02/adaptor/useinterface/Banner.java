package com.github.pattern.chap02.adaptor.useinterface;

public class Banner {
	public String getWithParen(String str) {
		return "(" + str + ")";
	}
	
	public String getWithAster(String str){
		return "*"+ str + "*";
	}
}
