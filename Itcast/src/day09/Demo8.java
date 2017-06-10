package day09;

/*
�ӿڵ����ã�
	1. ����Ľ��  ������ϣ�
	2. ����Լ���淶��
	3. ��չ���ܡ�


*/

//��ͨ��Ǧ����
class Pencil{
	
	String name;

	public Pencil(String name){
		this.name = name;
	}

	public void write(){
		System.out.println(name+"ɳɳ��д...");
	}
}


//��Ƥ�ӿ�
interface Eraser{
	
	public void remove();
}


//����Ƥ��Ǧ��
class PencilWithEraser extends Pencil implements Eraser {

	public PencilWithEraser(String name){
		super(name);
	}


	public void remove(){
		System.out.println("Ϳ��,Ϳ��....");
	}
}


class Demo8 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	
		PencilWithEraser p = new PencilWithEraser("2BǦ��");
		p.write();
		p.remove();
	
	}
}
