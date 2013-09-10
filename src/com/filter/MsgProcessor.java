package com.filter;

public class MsgProcessor {

	String msg;

	//Filter[] filters = {new HtmlFilter(),new SensitiveFilter()};
	
	FilterChain filterChain;
	
	public FilterChain getFilterChain() {
		return filterChain;
	}


	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}


	public MsgProcessor(String msg) {
		super();
		this.msg = msg;
	}
	 
	 
	public MsgProcessor(String msg, FilterChain filterChain) {
		super();
		this.msg = msg;
		this.filterChain = filterChain;
	}

	public String process() {
		return filterChain.doFilter(msg);
	}

}
