package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;

	public StudentController() {
		sArr[0] = new Student("서민성", "조리", 100);
		sArr[1] = new Student("최일석", "공업", 50);
		sArr[2] = new Student("김준호", "골프", 85);
		sArr[3] = new Student("최두훈", "간체", 60);
		sArr[4] = new Student("김혜성", "복지", 20);
	}

	public Student[] printStudent() {
		return sArr;
	}

	public int sumScore() {
		int sum = 0;
		for (  Student s :  sArr  ) {
			sum += s.getScore();
		}

		return sum;
	}

	public double[] avgScore() {
		double[] arr = new double[2];
		arr[0] = sumScore();
		arr[1] = (double) arr[0] / sArr.length;

		return arr;
	}
}
