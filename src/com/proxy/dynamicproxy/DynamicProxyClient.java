package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyClient {

	public static void main(String[] args) {
		DynamicLogInvocationHandler dlih = new DynamicLogInvocationHandler(new DynamicProxyImpl());
		DynamicRuntimeInvocationHandler drih = new DynamicRuntimeInvocationHandler(new DynamicProxyImpl());
		
		InvocationHandler ih = dlih;
		DynamicProxy dp =  (DynamicProxy)Proxy.newProxyInstance(DynamicProxyImpl.class.getClassLoader(),DynamicProxyImpl.class.getInterfaces(), ih);
		System.out.println(dp.say(" willen "));
	}
}
