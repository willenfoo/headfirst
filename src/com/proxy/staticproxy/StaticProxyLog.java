package com.proxy.staticproxy;

public class StaticProxyLog implements StaticProxy {

	private StaticProxy staticProxy;

	public StaticProxyLog(StaticProxy staticProxy) {
		super();
		this.staticProxy = staticProxy;
	}

	public void say() {
		System.out.println(" log  before");
		staticProxy.say();
		System.out.println(" log  after");
	}
}
