package com.filter;

public class MsgProcessor {

	String msg;

	Filter[] filters = {new HtmlFilter(),new SensitiveFilter()};
	public MsgProcessor(String msg) {
		super();
		this.msg = msg;
	}
	 
	 
	public String process() {
		for (Filter filter : filters) {
			msg = filter.doFilter(msg);
		}
		return msg;
	}

}
