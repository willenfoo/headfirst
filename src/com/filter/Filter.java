package com.filter;

public interface Filter {

	public String doFilter(String msg);
	
	public void doFilter(Request request, Response response);
	
	public void doFilter(Request request, Response response,FilterChain filterChain);
}
