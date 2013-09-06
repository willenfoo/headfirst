package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicLogInvocationHandler implements InvocationHandler {

	private Object target;
	
	public DynamicLogInvocationHandler(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy,Method method,Object[] args)
			throws Throwable {
		System.out.println(" log  before");
		
		Object object = method.invoke(target,args) ;    // 调用方法
		
		System.out.println(" log  after");
		return object;
	}

	 

}
