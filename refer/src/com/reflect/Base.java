package com.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Base<T> {
	
	/**
	 * 获取父类的泛型类型
	 */
	@SuppressWarnings("all")
	public Base(){
		System.out.println(this+"代表子类的实现！");
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		Class<T> entityClass = (Class<T>) actualTypeArguments[0];
		System.out.println(entityClass);
		
	}
}
