package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		List<student> str=new ArrayList<>();
		student s1=new student(5, "uday", 90);
		str.add(s1);
		
		str.add(new student(2, "rushi", 81));
		str.add(new student(6, "Om", 99));
		str.add(new student(3, "Vinit", 35));
		str.add(new student(1, "Yash", 40));
		str.add(new student(4, "Ram", 50));
		
		System.out.println(str);
		
	}

}
