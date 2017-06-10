package day13.stringbuffer;
/*
�����ҪƵ���޸��ַ��� �����ݣ�����ʹ���ַ������� �ࣨStringBuffer����


StringBuffer ��ʵ����һ���洢�ַ� ��������

������Ŀ��ʹ��Stringbuffer�� �εĹ��캯������ һ������ʱ��Ĭ�ϵĳ�ʼ�����Ƕ��٣� ������Ȳ���ʹ���ˣ��Զ��������ٱ���
	StringBuffer �ײ���������һ���ַ�������ܴ洢�ַ����� �ģ����ַ�������Ĭ�� �ĳ�ʼ������16�� ����ַ�����ĳ��Ȳ���ʹ��ʱ���Զ�����1����


StringBuffer ��һ���洢�ַ������� 

�����ľ߱� ����Ϊ
	
	String 
	
	����
		append(boolean b)    ��������������� �����ݵ�������
		insert(int offset, boolean b)  ָ�����������ֵ�������Ӧ �����ݡ� 

	ɾ��
		delete(int start, int end)  ����ָ���Ŀ�ʼ�����������ֵɾ����Ӧ�����ݡ�
		deleteCharAt(int index)   ����ָ�� ������ֵɾ��һ���ַ���
	
	
	�޸�
	
		replace(int start, int end, String str) ����ָ�� �Ŀ�ʼ���������ֵ�����ָ�������ݡ�
		reverse()   ��ת�ַ�������������ݡ�  abc--->cba
		
        setCharAt(int index, char ch)  ��ָ������ֵ���ַ��滻ָ�����ַ��� 
        substring(int start, int end)  ����ָ��������ֵ��ȡ�Ӵ���
		ensureCapacity(int minimumCapacity)  ָ��StringBuffer�ڲ����ַ����鳤�ȵġ�
		
	�鿴
		indexOf(String str, int fromIndex) ����ָ�����ַ�����һ�γ��ֵ�����ֵ,����ָ����ʼ���ҵ�λ�á�
		lastIndexOf(String str) 
		
		capacity() �鿴��ǰ�ַ�����ĳ��ȡ� 
		length() 
		
		charAt(int index) 
		toString()   ���ַ��������������ת���ַ������ء�
		

StringBuffer �� StringBuilder����ͬ���벻ͬ����
	
	��ͬ�㣺
		1. �����඼���ַ��������ࡣ
		2. ������ķ�������һ�µġ�
	��ͬ�㣺
		1. StringBuffer���̰߳�ȫ��,����Ч�ʵ� ��StringBuilder���̷߳ǰ�ȫ��,����Ч�ʸߡ�
		2. StringBuffer��jdk1.0���� �ģ�StringBuilder ��jdk1.5��ʱ����ֵġ�
		
�Ƽ�ʹ�ã� StringBuilder����Ϊ����Ч�ʸߡ�
		


		
		
		
		
*/

public class Demo2 {
	
	public static void main(String[] args) {
		//��ʹ��StringBuffer�޲εĹ��캯������һ���ַ��������ࡣ
		StringBuffer sb = new StringBuffer(); 
		sb.append("abc");
		/*
		��� 
		sb.append(true);
		sb.append(3.14f);
		����
		
		sb.insert(2, "С��");
		*/
		
		/*
		ɾ��
		sb.delete(2, 4); //  ɾ����ʱ��Ҳ�ǰ�ͷ����β
		sb.deleteCharAt(3); //����ָ�� ������ֵɾ��һ���ַ�
		
		�޸�	
		sb.replace(2, 4, "��С��");
		
		sb.reverse(); // ��ת�ַ���������
		
		sb.setCharAt(3, '��');
		
		String subString = sb.substring(2, 4);
		System.out.println("�Ӵ������ݣ�"+ subString);
		
		�鿴
	
		int index = sb.indexOf("abc", 3);
		System.out.println("����ֵΪ��"+index);
			
		sb.append("javajava");
		System.out.println("�鿴�ַ�����ĳ��ȣ�"+ sb.capacity());
		*/
		
		System.out.println("�洢���ַ�������"+sb.length());
		System.out.println("����ָ��������ֵ�����ַ���"+sb.charAt(2) );
		System.out.println("�ַ�������������ݣ�"+ sb);
		
		String content = sb.toString();
		test(content);
	}
	
	public static void test(String str){
		
	}
	
}
