package day16.itcast.genrictiry;
/*
 ���ͽӿ�
 
���ͽӿڵĶ����ʽ: 

	interface �ӿ���<�����Զ��巺��>{
	
	}

���ͽӿ�Ҫע������
	1. �ӿ����Զ���ķ��͵ľ���������������ʵ��һ���ӿڵ�ʱ��ָ�� �ġ�
	2. �ڽӿ����Զ���ķ��������ʵ�ֽӿڵ�ʱ��û��ָ��������������ͣ���ôĬ��ΪObject���͡�
	
���� Ŀǰ��ʵ��һ���ӿڵ�ʱ���һ�����ȷ��ĿǰҪ�������������ͣ���Ҫ�ȴ������ӿ�ʵ���� �����ʱ���Ҳ���ָ�����͵ľ����������͡�
	
	���Ҫ�ӳ��ӿ��Զ��巺�� �ľ����������ͣ���ô��ʽ���£�
	��ʽ��  
		public class Demo4<T> implements Dao<T>{
		
		}
	
 */

interface Dao<T>{
	
	public void add(T t);	
}

public class Demo4<T> implements Dao<T> {

	public static void main(String[] args) {
		Demo4<String> d = new Demo4<String>();
	}

	public void add(T t){
		
	}


}
