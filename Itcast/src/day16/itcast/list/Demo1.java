package day16.itcast.list;

import java.util.Enumeration;
import java.util.Vector;

/*
���� ����ϵ��
------------| Collection �������ϵĸ��ӿ�
----------------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ��� 
-------------------| ArrayList  ArrayList �ײ���ά����һ��Object����ʵ�ֵġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
-------------------| LinkedList LinkedList �ײ���ʹ�����������ݽṹʵ�ֵģ� �ص㣺 ��ѯ�ٶ�������ɾ�졣
-------------------| Vector(�˽⼴��)  �ײ�Ҳ��ά����һ��Object������ʵ�ֵģ�ʵ����ArrayList��һ���ģ�����Vector���̰߳�ȫ�ģ�����Ч�ʵ͡�

----------------| Set  �����ʵ����Set�ӿڵļ����࣬�߱����ص㣺 ���򣬲����ظ���

������: ˵��ArrayLsit��Vector������?
	��ͬ�㣺 ArrayList��Vector�ײ㶼��ʹ����Object����ʵ�ֵġ�
	
	��ͬ�㣺 
		1. ArrayList���̲߳�ͬ���ģ�����Ч�ʸߡ� 
		   Vector���߳�ͬ���ģ�����Ч�ʵ͡�
		2. ArrayList��JDK1.2���֣�Vector��jdk1.0��ʱ����ֵġ�
*/
public class Demo1 {

	public static void main(String[] args) {
		Vector v  =  new Vector();
		//���Ԫ��
		v.addElement("����");
		v.addElement("����");
		v.addElement("����");
		//�����ü���
		Enumeration e = v.elements(); //��ȡ������
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
		
		
	}
}
