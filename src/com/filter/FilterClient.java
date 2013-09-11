package com.filter;

public class FilterClient {

	public static void main(String[] args) {
		String msg = "你好， <script> , 敏感， 打倒鬼吹灯，，。。。。。";
		
		
		/*FilterChain filterChain = new FilterChain();
		filterChain.add(new HtmlFilter());
		
		FilterChain filterChain2 = new FilterChain();
		filterChain2.add(new SensitiveFilter());
		
		filterChain.add(filterChain2);
		
		//System.out.println(filterChain.doFilter(msg));
		MsgProcessor mp = new MsgProcessor(msg, filterChain);
		System.out.println(mp.process());*/
		
		
		
		/*Request request = new Request();
		request.setStr(msg);
		
		Response response = new Response();
		response.setStr("response");
		
		FilterChain filterChain = new FilterChain();
		filterChain.add(new HtmlFilter()).add(new SensitiveFilter());
		
		filterChain.doFilter(request, response);
		
		System.out.println(request.getStr());
		System.out.println(response.getStr());*/
		
		
		Request request = new Request();
		request.setStr(msg);
		
		Response response = new Response();
		response.setStr("response");
		
		FilterChain filterChain = new FilterChain();
		filterChain.add(new HtmlFilter()).add(new SensitiveFilter());
		
		filterChain.doFilter(request, response,filterChain);
		
		System.out.println(request.getStr());
		System.out.println(response.getStr());
	}
}
