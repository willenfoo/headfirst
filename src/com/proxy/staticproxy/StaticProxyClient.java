package com.proxy.staticproxy;

public class StaticProxyClient {

	public static void main(String[] args) {
         
		StaticProxyLog spl = new StaticProxyLog(new StaticProxyImpl());
		StaticProxyRuntime spr = new StaticProxyRuntime(spl) ;
		StaticProxyTransactional spt = new StaticProxyTransactional(spr) ;
		
		StaticProxy sp = spt;
		sp.say();
	}

}
