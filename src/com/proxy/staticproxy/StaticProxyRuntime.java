package com.proxy.staticproxy;

public class StaticProxyRuntime implements StaticProxy {

	private StaticProxy staticProxy;

	public StaticProxyRuntime(StaticProxy staticProxy) {
		super();
		this.staticProxy = staticProxy;
	}

	public void say() {
		System.out.println(" runtime  before");
		staticProxy.say();
		System.out.println(" runtime  after");
	}
}
