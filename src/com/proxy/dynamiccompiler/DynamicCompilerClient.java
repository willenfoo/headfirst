package com.proxy.dynamiccompiler;

public class DynamicCompilerClient {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		 
		DynamicCompiler dc = JDKDynamicCompiler.proxy(DynamicCompiler.class);
		
		System.out.println(dc.say(" willen "));
	}

}
