package day16.itcast.list;

import java.util.LinkedList;
import java.util.Random;

/*
���� ʹ��LinkedList�洢һ���˿��ƣ�Ȼ��ʵ��ϴ�ƹ��ܡ�



*/
//�˿���
class Poker{
	
	String  color; //��ɫ
	
	String num;	//����

	public Poker(String color, String num) {
		super();
		this.color = color;
		this.num = num;
	}

	
	@Override
	public String toString() {
		return "{"+color+num+"}";
	}
}

public class Demo2 {
	
	public static void main(String[] args) {
		LinkedList pokers = createPoker();
		shufflePoker(pokers);
		showPoker(pokers);
	}
	
	
	//ϴ�ƵĹ���
	public static void shufflePoker(LinkedList pokers){
		//�������������
		Random random = new Random();
		for(int i = 0 ; i <100; i++){ 
			//���������������ֵ
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			//��������ֵȡ�������ƣ�Ȼ�󽻻������Ƶ�˳��
			Poker poker1 = (Poker) pokers.get(index1);
			Poker poker2 = (Poker) pokers.get(index2);
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
		}
		
	}
	
	
	
	//��ʾ�˿���
	public static void showPoker(LinkedList pokers){
		for(int i = 0 ; i<pokers.size() ; i++){
			System.out.print(pokers.get(i));
			//����
			if(i%10==9){
				System.out.println();
			}
		}
	
	}
	
	
	
	
	//�����˿��Ƶķ���
	public static LinkedList createPoker(){
		//�ü������ڴ洢�˿˶���
		LinkedList list = new LinkedList();		
		//��������洢���еĻ�ɫ�����
		String[] colors = {"����","����","÷��","����"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = 0 ; j<colors.length ; j++){
				list.add(new Poker(colors[j], nums[i]));
			}
		}
		return list;
	}
	
	
}
