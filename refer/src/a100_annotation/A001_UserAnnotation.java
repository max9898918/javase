package a100_annotation;
//package a100_annotation;

import java.util.HashMap;
import java.util.Map;


@A000_Annotation()  //ʹ������ע��
public class A001_UserAnnotation {

	@A000_Annotation //ʹ�������Աע��
	private Integer age;

	/*
	//��Ϊע��ķ�Χû�й��캯���������ͷŴ���ͻᱨ��
	@A000_Annotation //ʹ���˹��췽��ע��
	public A001_UserAnnotation(){

	}*/
	
	@A000_Annotation //ʹ�����෽��ע��
	public void a(){
		@A000_Annotation //ʹ���˾ֲ�����ע��
		Map m = new HashMap(0);
	}

	public void b(@A000_Annotation Integer a){ //ʹ���˷�������ע��

	}
}

