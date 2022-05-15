package com.my.bysj.util;

public class ServiceFactory {
	
	public static Object getService(Object service){
		System.out.println("获取代理类duixiang");
		return new TransactionInvocationHandler(service).getProxy();
		
	}
	
}
