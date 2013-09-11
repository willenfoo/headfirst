package com.filter;

public class HtmlFilter implements Filter  {

	@Override
	public String doFilter(String msg) {
		return msg.replaceAll("<", "[").replaceAll(">", "]");
	}

	@Override
	public void doFilter(Request request, Response response) {
		request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
	}

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + " HtmlFilter";

		filterChain.doFilter(request, response, filterChain);
		
		response.str += " HtmlFilter";
	}

}
