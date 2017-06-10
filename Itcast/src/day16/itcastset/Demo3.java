package day16.itcastset;
import java.util.HashSet;
import java.util.Scanner;

/*
 ���� ���ܼ���¼���û��������룬����û����������Ѿ����ڼ����У���ô������Ϊ�ظ�Ԫ�أ���������ӵ�HashSet�С�
 
 */
class User{
	
	String userName;
	
	String password;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "{ �û�����"+this.userName+" ���룺"+ this.password+"}";
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.userName.equals(user.userName)&&this.password.equals(user.password);
	}
	
	@Override
	public int hashCode() { //  abc 123   �� 123 abc
		return userName.hashCode()+password.hashCode();
	}
	
}

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet set = new HashSet();
		
		
		while(true){
			System.out.println("�������û���:");
			String userName = scanner.next();
			System.out.println("���������룺");
			String password = scanner.next();
			//����һ������
			User user = new User(userName, password);
			if(set.add(user)){
				System.out.println("ע��ɹ�...");
				System.out.println("��ǰ���û��У�"+ set);
			}else{
				System.out.println("ע��ʧ��...");
			}
		}
		
		
		
		
	}

}
