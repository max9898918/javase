package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
/**
 * 通过本类学习java反射（最基本的在最下面）
 * @author Administrator
 * 创建日期：2017-03-03
 */
public class Demo1{
	@Test
	public void run4(){
		new Person();
	}
	
	/**
	 * 1.通过反射机制创建的User实例并通过set方法赋值
	 */
	@Test
	public void run3(){
		try {
			Class<?> class1 = Class.forName("com.reflect.Person");
			Person person = (Person) class1.newInstance();
			person.setAge(18);
			person.setName("美美");
			System.out.println("通过反射机制创建的User实例并通过set方法赋值："+person);
			System.out.println("----------------------------------------");

			Constructor<?>[] constructors = class1.getConstructors();//获取所有的构造函数
			System.out.println("该类有"+constructors.length+"个构造函数！");
			
			for(int i=0; i<constructors.length; i++){//这个for循环用来打印参数信息
				Class<?> parameTypes[] = constructors[i].getParameterTypes();
				
				System.out.print("cons[" + i + "] (");
				for (int j = 0; j < parameTypes.length; j++) { //获取参数类型和个数
					if (j == parameTypes.length - 1){ //最后一个就不会加逗号
						System.out.print(parameTypes[j].getName());
					}else{
						System.out.print(parameTypes[j].getName() + ",");
					}
				}
				System.out.println(")");
				
				if(parameTypes.length == 1){//调用构造函数并给属性赋值
					person = (Person) constructors[i]
							.newInstance("调用一个参数的构造方法！");
					System.out.println(person);
				}else if(parameTypes.length == 2){
					System.out.println(constructors[i].newInstance(20, "执行了两个参数的构造方法并给属性赋值！"));
				}
			}



		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 1.获取一个类的父类
	 * 2.获取实现的接口
	 */
	@Test
	public void run2(){
		try {
			Class<?> class1 = Class.forName("com.reflect.Person"); // 一般采用这种形式
			System.out.println(class1.getSuperclass());
			System.out.println("-------------------------------");

			Class<?>[] interfaces = class1.getInterfaces(); //获取实现的接口数组
			System.out.println(class1.getName()+" 实现了"+interfaces.length+"个接口！");
			for(int i=0;i<interfaces.length;i++){
				System.out.println("第"+(i+1)+"个接口为: "+ interfaces[i].getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}


	/**
	 * 1.实例化Class类对象的三种方式
	 * 2.通过一个对象获得完整的包名和类名
	 */
	@Test
	public void run1(){
		try {
			Class<?> class1 = Class.forName("com.reflect.Person"); // 一般采用这种形式
			Class<? extends Person> class2 = new Person().getClass();
			Class<Person> class3 = Person.class;

			System.out.println(class1);
			System.out.println(class2);
			System.out.println(class3);

			System.out.println("-------------------");
			System.out.println(class1.getName() );

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
