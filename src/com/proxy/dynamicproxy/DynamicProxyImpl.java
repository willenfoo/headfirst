package com.proxy.dynamicproxy;

public class DynamicProxyImpl implements DynamicProxy {

	public String say(String name) {
		String returnValue = " welcome to DynamicProxy " + name;
		System.out.println(returnValue);
		return returnValue;
	}
}
