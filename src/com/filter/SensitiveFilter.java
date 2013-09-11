package com.filter;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replaceAll("敏感", "不敏感");
	}

	@Override
	public void doFilter(Request request, Response response) {
		request.str = request.str.replaceAll("敏感", "不敏感");
	}

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {

		request.str = request.str.replaceAll("敏感", "不敏感") + " SensitiveFilter";
		
		filterChain.doFilter(request, response, filterChain);
		
		response.str += " SensitiveFilter";
	}

}
