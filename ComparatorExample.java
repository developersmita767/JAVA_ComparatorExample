package Abacus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return s1.getName().compareTo(s2.getName());
	}
}

class PercentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getPercent() == s2.getPercent())
			return 0;
		else if (s1.getPercent() < s2.getPercent())
			return -1;
		else
			return 1;
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student st1 = new Student(1, "Ram", 90, "A");
		Student st2 = new Student(2, "Shyam", 85, "A");
		Student st3 = new Student(3, "Biju", 30, "E");
		Student st4 = new Student(4, "Subrat", 76, "B");
		Student st5 = new Student(5, "Deepak", 49, "D");
		Student st6 = new Student(6, "Ashish", 56, "C");
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		studentList.add(st5);
		studentList.add(st6);
		
		System.out.println("Student details before sorting:");
		Iterator<Student> stIter1=studentList.iterator();
		while(stIter1.hasNext()) {
			Student student=stIter1.next();
			System.out.println(student.getName()+","+student.getPercent());
		}
		System.out.println("==================================");
		Collections.sort(studentList,new PercentComparator());
		Iterator<Student> stIter2=studentList.iterator();
		while(stIter2.hasNext()) {
			Student student=stIter2.next();
			System.out.println(student.getName()+","+student.getPercent());
		}

	}

}
