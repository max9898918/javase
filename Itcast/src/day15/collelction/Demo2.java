package day15.collelction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

------| Collection �������ϵĸ��ӿ�
----------| List  �����ʵ���� List�ӿڵļ����࣬�ü�����߱� ���ص㣺 ���򡢿��ظ���
----------| Set   �����ʵ����Set�ӿڵļ����࣬�ü��Ͼ߱����ص㣺 ���򣬲��� �ظ���
 
Collection---�����ķ�����
	toArray() 
	iterator()
	
	
�����������ã���������ץȡ�����е�Ԫ�ء�


�������ķ�����
	hasNext()   ���Ƿ���Ԫ�ؿɱ����������Ԫ�ؿ��Ա���������true�����򷵻�false ��
          	
 	next()    ��ȡԪ��...
    
      	  
 	remove()  �Ƴ����������һ�η��� ��Ԫ�ء�


NoSuchElementException û��Ԫ�ص��쳣�� 
���ֵ�ԭ�� û��Ԫ�ؿ��Ա������ˡ�����
	
	
 */
public class Demo2 {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("����");
		c.add("��ʣ");
		c.add("����");
		c.add("����");
	
		/*//�������ϵ�Ԫ��------>��ʽһ�� ����ʹ��toArray������
		Object[] arr = c.toArray(); // toArray()  �Ѽ��� ��Ԫ�ش洢��һ�� Object�������� ���ء�
		for(int i = 0 ; i<arr.length ; i++){
			System.out.print(arr[i]+",");
		}
		
		//Ҫ��ʹ��iterator������������
		*/

		Iterator it = c.iterator();  //����һ��������    ���ʣ�iterator()�������ص���һ���ӿ����ͣ�Ϊʲô�ӿ��ֿ��Ե��÷�������ʹ���أ�  iterator ʵ�� �Ϸ��ص���iterator�ӿڵ�ʵ�������
		/*
		while(it.hasNext()){ // hasNext() ���Ƿ���Ԫ�ؿ��Ա�����
			System.out.println("Ԫ�أ�"+ it.next()); //��ȡԪ��
		}
		*/
		
		/*it.next();
		it.next();
		it.remove();  //ɾ�����������һ�η��ص�Ԫ�ء�
*/
		
		//��ռ��� ��Ԫ��
		while(it.hasNext()){
			it.next();
			it.remove();
		}
		
		System.out.println("���ϵ�Ԫ�أ�"+ c);
		
		
		
		
	}
	
}
