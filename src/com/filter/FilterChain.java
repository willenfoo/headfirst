package com.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	public List<Filter> filters = new ArrayList<Filter>();
	
	int index = 0;
	
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

	@Override
	public void doFilter(Request request, Response response) {
		for (Filter filter : filters) {
			filter.doFilter(request,response);
		}
	}

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		if (index == filters.size()) {
			return ;
		}
		Filter filter = filters.get(index);
		index ++;
		filter.doFilter(request, response, filterChain);
	}
}
