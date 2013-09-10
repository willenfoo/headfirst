package com.filter;

public class HtmlFilter implements Filter  {

	@Override
	public String doFilter(String msg) {
		return msg.replaceAll("<", "[").replaceAll(">", "]");
	}

}
