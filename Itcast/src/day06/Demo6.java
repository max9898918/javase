package day06;

/*
���� ʹ��java������һ���������࣬�������߱�������1�� ������2 ���������������� ������
�����߱�����Ĺ�����Ϊ�� 

Ҫ�� ����ֱ�ӶԲ�����1��������2���������Щ���Խ���ֱ�� �ĸ�ֵ��Ҫ��װ������ (+ - * /  )

���������ṩget����set������

	��Ҫ�ṩset����
*/


//��������
class Calculator{

	private int num1; //������1

	private int num2;  //������2
 
	private	char option ; //�����
	

	//�ṩ�����ķ�����������ֵ....					
	public void initCalculator(int n1 , int n2 , char o){
		num1 = n1;
		num2 = n2;
		if(o=='+'||o=='-'||o=='*'||o=='/'){
			option = o;
		}else{
			option = '+';	
		}
	
	}


	//����Ĺ���
	public void calculate(){
		switch(option){
			case '+':
				System.out.println("���ӷ�����,����ǣ�"+(num1+num2));
				break;
			case '-':
				System.out.println("����������,����ǣ�"+(num1-num2));
				break;
			case '*':
				System.out.println("���˷�����,����ǣ�"+(num1*num2));
				break;
			case '/':
				System.out.println("����������,����ǣ�"+(num1/num2));
				break;
		}
	}


}





class Demo6 
{
	public static void main(String[] args) 
	{
		//������һ������������
		Calculator c = new Calculator();
		//��������ֵ
		c.initCalculator(1,2,'a');
		//���ü������ļ��㹦��
		c.calculate();


	}
}
