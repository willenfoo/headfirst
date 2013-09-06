package com.proxy.staticproxy;

public class StaticProxyClient {

	public static void main(String[] args) {
         
		StaticProxy sp = new StaticProxyLog(new StaticProxyImpl()) ;
		sp.say();
	}

}
