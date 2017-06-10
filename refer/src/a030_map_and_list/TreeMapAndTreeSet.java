package a030_map_and_list;
import java.util.Set;
import java.util.TreeSet;

public class TreeMapAndTreeSet  {
	
	
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();     // Java 7的钻石语法(构造器后面的尖括号中不需要写类型)
		set.add(new Student("Hao LUO", 33));
		set.add(new Student("XJ WANG", 32));
		set.add(new Student("Bruce LEE", 60));
		set.add(new Student("Bob YANG", 22));
		set.add(new Student("Bob YANG", 22));
		for(Student stu : set) {
			System.out.println(stu);
		}
		//      输出结果: 
		//      TreeMapAndTreeSet [name=Bob YANG, age=22]
		//      TreeMapAndTreeSet [name=XJ WANG, age=32]
		//      TreeMapAndTreeSet [name=Hao LUO, age=33]
		//      TreeMapAndTreeSet [name=Bruce LEE, age=60]
	}
}

class Student implements  Comparable<Student>{

	
	private String name;        // 姓名
	private int age;            // 年龄

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "TreeMapAndTreeSet [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Student o) {
		return this.age - o.age; // 比较年龄(年龄的升序)
	}
}