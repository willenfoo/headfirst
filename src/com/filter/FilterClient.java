package com.filter;

public class FilterClient {

	public static void main(String[] args) {
		String msg = "你好， <script> , 敏感， 打倒鬼吹灯，，。。。。。";
		
		
		FilterChain filterChain = new FilterChain();
		filterChain.add(new HtmlFilter()).add(new SensitiveFilter());
		
		MsgProcessor mp = new MsgProcessor(msg, filterChain);
		System.out.println(mp.process());
	}
}
