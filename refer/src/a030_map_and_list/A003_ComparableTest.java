package a030_map_and_list;

import java.util.*;
/**
 * 技术点是接口Comparable的compareTo方法的使用
 * 主要解决对象的比较和排序
 * 创建时间：2017-01-16
 * @author Administrator
 */
/*public class A003_ComparableTest {

	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee("harry Hacker", 35000);//调用构造方法给成员变量name和salary赋值
		emp[1] = new Employee("carl cracke", 75000);
		emp[2] = new Employee("tony Tester", 38000);
		
		Arrays.sort(emp); // sort方法可以实现对对象数组排序，但是必须实现 Comparable接口

		for (Employee e : emp){
			System.out.println("id=" + e.getId() + "  name=" + e.getName() + ".salary=" + e.getSalary());
		}
			
	}
}

class Employee implements Comparable<Employee> {
	public Employee(String n, double s) {
		name = n;
		salary = s;
		Random ID = new Random();
		id = ID.nextInt(100);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public int compareTo(Employee other) {
		if (id < other.id) // 这里比较的是什么 sort方法实现的就是按照此比较的东西从小到大排列
		return -1;
		if (id > other.id)
			return 1;
		return 0;
	}

	private int id;
	private String name;
	private double salary;
}
*/

/*
 *  //把上面的代码注释起来、就可以放开这个例子了
 * import java.util.*; */

 
public class A003_ComparableTest implements Comparable{
    private double mark;
    private String name;
     
    public A003_ComparableTest(String name,double mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if(!(o instanceof A003_ComparableTest)) return 1;//这句鬼代码没什么用
        A003_ComparableTest tmp=(A003_ComparableTest)o;
        if(this.getMark()>tmp.getMark()) return 1;
        if(this.getMark()<tmp.getMark()) return -1;
        return 0;
    }
    public double getMark() {
        return mark;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     
    public static void main(String args[]){
        List<A003_ComparableTest> list=new ArrayList<A003_ComparableTest>();
        for(int i=0;i<10;i++){
            list.add(new A003_ComparableTest("S_NAME_"+i,Math.random()*100));
        }
        for(A003_ComparableTest s:list){
            System.out.println(s.getName()+" --- "+s.getMark());
        }
        System.out.println("---------------------------------\n区别在于下面的打印是按mark值进行排序的");
     
        //Collections.sort(list);
        for(A003_ComparableTest s:list){
            System.out.println(s.getName()+" --- "+s.getMark());
        }
    }
}