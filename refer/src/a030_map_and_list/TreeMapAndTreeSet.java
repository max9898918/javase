package a030_map_and_list;
import java.util.Set;
import java.util.TreeSet;

public class TreeMapAndTreeSet  {
	
	
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>();     // Java 7����ʯ�﷨(����������ļ������в���Ҫд����)
		set.add(new Student("Hao LUO", 33));
		set.add(new Student("XJ WANG", 32));
		set.add(new Student("Bruce LEE", 60));
		set.add(new Student("Bob YANG", 22));
		set.add(new Student("Bob YANG", 22));
		for(Student stu : set) {
			System.out.println(stu);
		}
		//      ������: 
		//      TreeMapAndTreeSet [name=Bob YANG, age=22]
		//      TreeMapAndTreeSet [name=XJ WANG, age=32]
		//      TreeMapAndTreeSet [name=Hao LUO, age=33]
		//      TreeMapAndTreeSet [name=Bruce LEE, age=60]
	}
}

class Student implements  Comparable<Student>{

	
	private String name;        // ����
	private int age;            // ����

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "TreeMapAndTreeSet [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Student o) {
		return this.age - o.age; // �Ƚ�����(���������)
	}
}