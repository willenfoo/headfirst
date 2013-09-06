package com.proxy.staticproxy;

public class StaticProxyTransactional implements StaticProxy {

	private StaticProxy staticProxy;

	public StaticProxyTransactional(StaticProxy staticProxy) {
		super();
		this.staticProxy = staticProxy;
	}

	public void say() {
		System.out.println(" Transactional  before");
		staticProxy.say();
		System.out.println(" Transactional  after");
	}
}
