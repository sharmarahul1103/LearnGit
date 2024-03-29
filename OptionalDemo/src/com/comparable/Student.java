package com.comparable;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)
		{  return 0;}
		
		else if(age>st.age)
		{ return 1;}
		else 
		return -1;
	}
	

}
