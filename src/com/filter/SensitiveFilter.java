package com.filter;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replaceAll("敏感", "不敏感");
	}

}
