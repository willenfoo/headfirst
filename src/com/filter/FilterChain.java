package com.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

	public List<Filter> filters = new ArrayList<Filter>();
	
	public FilterChain add(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	public String doFilter(String msg) {
		for (Filter filter : filters) {
			msg = filter.doFilter(msg);
		}
		return msg;
	}
}
