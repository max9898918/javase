package day16.itcastset;

import java.util.HashSet;
import java.util.Set;

/*
���� ����ϵ��
------------| Collection �������ϵĸ��ӿ�
----------------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ��� 
-------------------| ArrayList  ArrayList �ײ���ά����һ��Object����ʵ�ֵġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
-------------------| LinkedList LinkedList �ײ���ʹ�����������ݽṹʵ�ֵģ� �ص㣺 ��ѯ�ٶ�������ɾ�졣
-------------------| Vector(�˽⼴��)  �ײ�Ҳ��ά����һ��Object������ʵ�ֵģ�ʵ����ArrayList��һ���ģ�����Vector���̰߳�ȫ�ģ�����Ч�ʵ͡�

----------------| Set  �����ʵ����Set�ӿڵļ����࣬�߱����ص㣺 ���򣬲����ظ���

���� ���Ԫ�� ��˳����Ԫ�س�����˳���ǲ�һ�� �ġ�


*/
public class Demo1 {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("����");
		set.add("����");
		set.add("����");
		System.out.println("��ӳɹ���"+set.add("����"));
		System.out.println(set);
		
		
		
	}

}
