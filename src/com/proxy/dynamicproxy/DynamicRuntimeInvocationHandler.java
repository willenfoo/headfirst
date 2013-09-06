package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicRuntimeInvocationHandler implements InvocationHandler {

	private Object target;
	
	public DynamicRuntimeInvocationHandler(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy,Method method,Object[] args)
			throws Throwable {
		
		System.out.println(" runtime  before");
		
		Object object = method.invoke(target,args) ;    // 调用方法
		
		System.out.println(" runtime  after");
		
		return object;
	}

	 

}
