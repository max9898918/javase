package a060_reflect;

import java.lang.reflect.Constructor;
/**
 * 通过反射机制实例化一个类的对象和获取全部的构造函数
 * @author Administrator
 *
 */
public class TestReflect004 {
	public static void main(String[] args) throws Exception {
        Class<?> class1 = null;
        class1 = Class.forName("a060_reflect.User");
        // 第一种方法，实例化默认构造方法，调用set赋值
        User user = (User) class1.newInstance();
        user.setAge(20);
        user.setName("Rollen");
        System.out.println("实例化默认构造方法，调用set赋值："+user);
        // 结果 User [age=20, name=Rollen]
       
        // 第二种方法 获取全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class1.getConstructors();
        // 查看每个构造方法需要的参数
        System.out.println("-------------下面开始打印构造方法的参数信息-------------");
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) { //获取参数类型和个数
                if (j == clazzs.length - 1){ //最后一个就不会加逗号
                	 System.out.print(clazzs[j].getName());
                }else{
                	 System.out.print(clazzs[j].getName() + ",");
                }
            }
            System.out.println(")");
        }
        /* // 结果（先要看构造方法里面的参数、在决定哪个数组调用哪个构造函数）
        cons[0] ()
        cons[1] (int,java.lang.String)
        cons[2] (java.lang.String)    */
        
        System.out.println("\n-----------------------------");
        user = (User) cons[0].newInstance("参数");
        System.out.println("cons[2].newInstance(参数);调用构造函数给user赋值： "+ user);
      
        // 结果 User [age=0, name=参数]
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println("newInstance(20, Rollen);调用构造函数给user赋值："+ user);
        // 结果 User [age=20, name=Rollen]
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