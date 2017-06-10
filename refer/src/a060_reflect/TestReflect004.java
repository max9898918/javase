package a060_reflect;

import java.lang.reflect.Constructor;
/**
 * ͨ���������ʵ����һ����Ķ���ͻ�ȡȫ���Ĺ��캯��
 * @author Administrator
 *
 */
public class TestReflect004 {
	public static void main(String[] args) throws Exception {
        Class<?> class1 = null;
        class1 = Class.forName("a060_reflect.User");
        // ��һ�ַ�����ʵ����Ĭ�Ϲ��췽��������set��ֵ
        User user = (User) class1.newInstance();
        user.setAge(20);
        user.setName("Rollen");
        System.out.println("ʵ����Ĭ�Ϲ��췽��������set��ֵ��"+user);
        // ��� User [age=20, name=Rollen]
       
        // �ڶ��ַ��� ��ȡȫ���Ĺ��캯�� ʹ�ù��캯����ֵ
        Constructor<?> cons[] = class1.getConstructors();
        // �鿴ÿ�����췽����Ҫ�Ĳ���
        System.out.println("-------------���濪ʼ��ӡ���췽���Ĳ�����Ϣ-------------");
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) { //��ȡ�������ͺ͸���
                if (j == clazzs.length - 1){ //���һ���Ͳ���Ӷ���
                	 System.out.print(clazzs[j].getName());
                }else{
                	 System.out.print(clazzs[j].getName() + ",");
                }
            }
            System.out.println(")");
        }
        /* // �������Ҫ�����췽������Ĳ������ھ����ĸ���������ĸ����캯����
        cons[0] ()
        cons[1] (int,java.lang.String)
        cons[2] (java.lang.String)    */
        
        System.out.println("\n-----------------------------");
        user = (User) cons[0].newInstance("����");
        System.out.println("cons[2].newInstance(����);���ù��캯����user��ֵ�� "+ user);
      
        // ��� User [age=0, name=����]
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println("newInstance(20, Rollen);���ù��캯����user��ֵ��"+ user);
        // ��� User [age=20, name=Rollen]
    }
}

class User {
    private int age;
    private String name;
    public User() {
        super();
    }
    public User(String name) {
        super();
        this.name = name;
    }
    public User(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}