package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
/**
 * ͨ������ѧϰjava���䣨��������������棩
 * @author Administrator
 * �������ڣ�2017-03-03
 */
public class Demo1{
	@Test
	public void run4(){
		new Person();
	}
	
	/**
	 * 1.ͨ��������ƴ�����Userʵ����ͨ��set������ֵ
	 */
	@Test
	public void run3(){
		try {
			Class<?> class1 = Class.forName("com.reflect.Person");
			Person person = (Person) class1.newInstance();
			person.setAge(18);
			person.setName("����");
			System.out.println("ͨ��������ƴ�����Userʵ����ͨ��set������ֵ��"+person);
			System.out.println("----------------------------------------");

			Constructor<?>[] constructors = class1.getConstructors();//��ȡ���еĹ��캯��
			System.out.println("������"+constructors.length+"�����캯����");
			
			for(int i=0; i<constructors.length; i++){//���forѭ��������ӡ������Ϣ
				Class<?> parameTypes[] = constructors[i].getParameterTypes();
				
				System.out.print("cons[" + i + "] (");
				for (int j = 0; j < parameTypes.length; j++) { //��ȡ�������ͺ͸���
					if (j == parameTypes.length - 1){ //���һ���Ͳ���Ӷ���
						System.out.print(parameTypes[j].getName());
					}else{
						System.out.print(parameTypes[j].getName() + ",");
					}
				}
				System.out.println(")");
				
				if(parameTypes.length == 1){//���ù��캯���������Ը�ֵ
					person = (Person) constructors[i]
							.newInstance("����һ�������Ĺ��췽����");
					System.out.println(person);
				}else if(parameTypes.length == 2){
					System.out.println(constructors[i].newInstance(20, "ִ�������������Ĺ��췽���������Ը�ֵ��"));
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
	 * 1.��ȡһ����ĸ���
	 * 2.��ȡʵ�ֵĽӿ�
	 */
	@Test
	public void run2(){
		try {
			Class<?> class1 = Class.forName("com.reflect.Person"); // һ�����������ʽ
			System.out.println(class1.getSuperclass());
			System.out.println("-------------------------------");

			Class<?>[] interfaces = class1.getInterfaces(); //��ȡʵ�ֵĽӿ�����
			System.out.println(class1.getName()+" ʵ����"+interfaces.length+"���ӿڣ�");
			for(int i=0;i<interfaces.length;i++){
				System.out.println("��"+(i+1)+"���ӿ�Ϊ: "+ interfaces[i].getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}


	/**
	 * 1.ʵ����Class���������ַ�ʽ
	 * 2.ͨ��һ�������������İ���������
	 */
	@Test
	public void run1(){
		try {
			Class<?> class1 = Class.forName("com.reflect.Person"); // һ�����������ʽ
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
