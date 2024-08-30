package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			int[] arr = pc.personCount();

			System.out.println("학생은 최대  3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + arr[0] + "명 입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + arr[1] + "명 입니다.");

			System.out.println("1. 학생메뉴");
			System.out.println("2. 사원메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				studentMenu();
				break;
			case "2":
				employeeMenu();
				break;
			case "9":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}

		}

	}

	public void studentMenu() {
		while (true) {
			int studentCount = pc.personCount()[0];
			if (studentCount != 3) {
				System.out.println("1. 학생 추가");
			} else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가" + "메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			String menu = sc.nextLine();
			sc.nextLine();

			switch (menu) {
			case "2":
				printStudent();
				break;
			case "9":
				System.out.println("메인으로");
				return;
			case "1":
				if (studentCount < 3) {
					insertStudent();
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

	public void employeeMenu() {
		while (true) {
			int employeeCount = pc.personCount()[1];
			if (employeeCount != 10) {
				System.out.println("1. 사원 추가");
			} else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가" + "메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			String menu = sc.nextLine();
			sc.nextLine();

			switch (menu) {
			case "2":
				printEmployee();
				break;
			case "9":
				System.out.println("메인으로");
				return;
			case "1":
				if (employeeCount < 3) {
					insertEmployee();
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			
			System.out.print("학생 몸무게 : ");
			double width = sc.nextDouble();
			
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, height, grade, major);
			
			int count = pc.personCount()[0];
			if(count == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
			System.out.print("그만 하시려면 N, 이어하시려면 아무키나 누르세요 : ");
			char ch = sc.nextLine().charAt(0);
			if( ch == 'N') {
				break;
			}
		}
	}

	public void printStudent() {
		Student[] ss = pc.printStudent();   // 얕은 복사
		// null값이 나올 수 있음.
		// PersonController에 존재하는 s객체배열을 직접 조작할수 있다.
		
		for(Student s  :  ss  ) {
			if(s != null)
			System.out.println(s);
		}
	}

	public void insertEmployee() {
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		double width = sc.nextDouble();
		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();
		System.out.print("사원 부서 : ");
		String dept = sc.nextLine();
	}

	public void printEmployee() {

	}

}
