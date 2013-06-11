package com.github.pattern.chap02.adaptor.useinterface;

public class PrintAdaptor extends Banner implements Print {
	private String str;
		
	public PrintAdaptor(String str) {
		this.str = str;
	}
	
	@Override
	public String getAstro() {
		// TODO Auto-generated method stub
		return getWithAster(str);
	}

	@Override
	public String getParen() {
		// TODO Auto-generated method stub
		return getWithParen(str);
	}
}
