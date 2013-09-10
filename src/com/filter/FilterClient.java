package com.filter;

public class FilterClient {

	public static void main(String[] args) {
		String msg = "你好， <script> , 敏感， 打倒鬼吹灯，，。。。。。";
		
		MsgProcessor mp = new MsgProcessor(msg);
		System.out.println(mp.process());
	}
}
