package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ========== ");
		Student[] sArr = ssm.printStudent();

		for (  Student s :  sArr  ) {
			System.out.println(s.inform());
		}

		System.out.println("========== 학생 성적 출력 ========== ");
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int) dArr[0]);
		System.out.println("학생 점수 평균 : " + dArr[1]);

		System.out.println("========== 성적 결과 출력 ========== ");
		for (  Student s :  sArr  ) {
			String result = s.getScore() < StudentController.CUT_LINE ? "재시험 대상" : "통과";
				System.out.printf("%s학생은 %s입니다.\n", s.getName()
						, result);
			}
	}
	}

