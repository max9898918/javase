package com.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Base<T> {
	
	/**
	 * ��ȡ����ķ�������
	 */
	@SuppressWarnings("all")
	public Base(){
		System.out.println(this+"���������ʵ�֣�");
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		Class<T> entityClass = (Class<T>) actualTypeArguments[0];
		System.out.println(entityClass);
		
	}
}
