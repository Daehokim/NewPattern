package com.github.pattern.chap02.adaptor.useClass;

import com.github.pattern.chap02.adaptor.useinterface.Banner;

public class PrintAdaptor extends Print{
	private String str;
	private Banner ban;
	
	public PrintAdaptor(String str) {
		this.str = str;
		ban = new Banner();
	}
	
	@Override
	public String getAstro() {
		// TODO Auto-generated method stub
		return ban.getWithAster(str);
	}

	@Override
	public String getParen() {
		// TODO Auto-generated method stub
		return ban.getWithParen(str);
	}

}
