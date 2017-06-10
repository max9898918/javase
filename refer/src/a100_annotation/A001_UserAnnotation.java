package a100_annotation;
//package a100_annotation;

import java.util.HashMap;
import java.util.Map;


@A000_Annotation()  //使用了类注解
public class A001_UserAnnotation {

	@A000_Annotation //使用了类成员注解
	private Integer age;

	/*
	//因为注解的范围没有构造函数、所以释放代码就会报错
	@A000_Annotation //使用了构造方法注解
	public A001_UserAnnotation(){

	}*/
	
	@A000_Annotation //使用了类方法注解
	public void a(){
		@A000_Annotation //使用了局部变量注解
		Map m = new HashMap(0);
	}

	public void b(@A000_Annotation Integer a){ //使用了方法参数注解

	}
}

