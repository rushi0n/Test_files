package Exam;

import java.util.Comparator;

public class student {
	private int roll;
	private String name;
	private float marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nroll = " + roll + " name = " + name + " marks = " + marks;
	}
	public student(int roll, String name, float marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


}
