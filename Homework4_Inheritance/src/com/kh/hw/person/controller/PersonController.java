package com.kh.hw.person.controller;

import java.util.Arrays;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] arr = new int[2];
		
		for(Student sc : s) {
			if(sc == null) continue;
				arr[0]++;
		}
		
		for(Employee emp : e) {
			if(emp != null) arr[1]++;
			
		}
		
		return arr;
		
		
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		  //   int index = personCount()[0]; 
		
		s[personCount()[0]] = new Student(name, age, height, weight, grade, major);
		
	}

	public Student[] printStudent() {
		
		// 1)번
		Student[] copy = new Student[3];
		int studentCount = personCount()[0];
		System.arraycopy(s, 0, copy, 0, studentCount);
		
		// 2)번 
		Student[] copy2 = Arrays.copyOf(s, studentCount);
		
			return copy; 
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
			
		
		
	}

	public Employee[] printEmployee() {
		return null;
	}

}
