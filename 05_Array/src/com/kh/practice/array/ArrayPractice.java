package com.kh.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요

		int[] arr = new int[10]; // 길이 10짜리 배열 선언 및 할당

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 0=> 1, 1 => 2
			System.out.print(arr[1] + " ");

		}
	}

	public void practice2() {
//       길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] arr = new int[10];

		int valur = 10;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			arr[i] = valur--;
			System.out.print(arr[i] + " ");

		}
	}

	public void practice3() {
//		 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		System.out.print("양의 정수 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int index = 0; index < size; index++) {
			arr[index] = index + 1;
//			arr[index] = value ++;

			System.out.print(arr[index] + " ");
		}
	}

	public void practice4() {
//       길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.	

		String[] arr = /* new String[] */ { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(arr[1]); // 간단하게

		for (int i = 0; i < arr.length; i++) { // 반복문을 사용하여 찾는 법
			if (arr[i].equals("귤"))
				System.out.print(arr[i]);
		}

	}

	public void practice5() {
//		 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); // i

		char arr[] = new char[str.length()]; // [a.p.p.l.i.c.a.t.i.o.n]

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}

		System.out.printf("%s에 %c가 존재하는 위치 (인덱스) : ", str, ch);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print(ch + " 개수 : " + count);

	}

	public void practice6() {
//		 “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 0 || num > 6) {
			System.out.print("잘못 입력하셨습니다.");
			return;
		}
		System.out.print(arr[num] + "요일");

	}

	public void practice7() {

//		1) 사용자가 배열의 길이를 직접 입력하여
		System.out.print("정수 : ");
		int size = sc.nextInt();
//		2) 그 값만큼 정수형 배열을 선언 및 할당하고
		int arr[] = new int[size]; // 0, 0, 0,

//		3) 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		for (int i = 0; i < size; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();

		}
//		4) 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		int sum = 0;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
//		5) 각 인덱스에 저장된 값들의 합을 출력하세요
		System.out.printf("\n총 합 : " + sum);
	}

	public void practice8() {
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.

//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			practice8();
			return;
		}
		int[] arr = new int[num];
		int middle = num / 2 + 1; // 배열의 중간지점

		// 1번 방법
		int value = 1;
		for (int i = 0; i < num; i++) {
			arr[i] = value;
			value += (i <= middle ? 1 : -1);
		}
		// 2번 방법
		int value2 = 1;
		for (int i = 0; i <= middle; i++) {
			arr[i] = i + 1;
			arr[i] = value2++;
		}
		for (int i = middle + 1; i < num; i++) {
			arr[1] = arr[i + 1] + 1;
			arr[i] = value2--;
		}

//			3 => 2 => (num/2 +1)
//			5 => 3
//			7 => 4
	}

	public void practice9() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

		String[] arr = { "양념", "후라이드", "깐풍", "파닭", "신호등" };

		System.out.print("치킨 이름을 입력하세요. : ");
		String str = sc.nextLine();

		boolean isTrue = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				isTrue = false;
				System.out.println(str + "치킨 배달 가능");
//				return 매서드 종료시켜서 아래 출력이 안뜨게 하기
//				break 사용시 뒤에 문구 무조건 뜸

			}
		}
		if (isTrue) {
			System.out.println(str + "은(는) 없는 메뉴입니다.");
		}
	}

	public void practice10() {
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요

		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine(); // 123456-1234567

		// 문자열의 길이만큼의 크기를 가진 문자배열생성
		char[] origin = new char[str.length()]; // ['','','','','','','',]
		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i); // ['1','2','3','4','5','6','-'...]
		}
		char[] copy = origin.clone(); // 깊은 복사

		// 123456-1234567
		// 012354678
		for (int i = 0; i < copy.length; i++) {
			if (i > 7) {
				copy[i] = '*';
				System.out.print("*"); // 주민번호뒤 6자리는 *출력
			} else {
				System.out.print(copy[i]);
			}
		}
	}

	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요

		int[] arr = new int[10]; // [,0,0,0,0,0,0,0...]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");

		}

	}

	public void practice12() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		int min = arr[0]; // 최소값
		int max = arr[0]; // 최대값

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("\n최대 값 : " + max);
		System.out.println("최소 값 : " + min);

	}

	public void practice13() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 (int) (Math.random() * 10 + 1);
//		중복된 값이 없게 배열에 초기화한 후 출력하세요

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			// 중복값 신경 안쓰고 저장.
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}

		System.out.print(Arrays.toString(arr));
		// [10,3,5,8,9,0,0,0,0,0]
	}

	public void practice14() {
//		로또 번호 자동 생성기 프로그램을 작성하는데 
//		중복 값 없이 오름차순으로 정렬하여 출력하세요.
//		Arrays.solt(배열); 배열을 오름차순 정렬해주는 함수.
//		[5, 7, 1, 3] -> 1 3 5 7로 정렬

		int arr[] = new int[6]; // 1~45 => (int)(Math.random() * 45 + 1)
		int[] random = new int[45]; // [,0,0,0,0,0,0,0...];

		for (int i = 0; i < arr.length;) {
			int ran = (int) (Math.random() * 45 + 1);

			if (random[ran - 1] == 0) {
				arr[i] = ran;
				random[ran - 1] = 1;
				i++;
//
//			for (int j = 0; j < i; j++) {
//				if (arr[j] == arr[i]) {
//					i--;
//					break;
			}
		}

		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
	}

	public void practice15() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.

		System.out.print("문자열 : ");
		String str = sc.nextLine(); // application
		char[] origin = str.toCharArray();
		// a p p l i c a t i o n

		char[] copy = new char[origin.length];

		int copyIndex = 0;
		for (int i = 0; i < origin.length; i++) {
			copy[copyIndex] = origin[i];
			for (int j = 0; j < copyIndex; j++) {
				if (copy[j] == origin[i]) {
//					copy[i] = ' ';
					copyIndex--;
					break;

				}
			}

			// 중복값이 있는경우 copy[i}에는 값추가 x
			copyIndex++;
		}
		System.out.println(Arrays.toString(copy));
		int count = 0;
		// 값 출력을 위한 반복문
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] == ' ') {
				continue;
			}
			System.out.print(copy[i] + (i != copy.length - 1 ? " , " : ""));
			count++;
		}

		System.out.println("\n문자 개수 : " + count);

	}

	public void practice16() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt(); // 3
		sc.nextLine(); // \문자 제거
		String[] arr = new String[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();

		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		    char ch = sc.nextLine().charAt(0);
		    if (ch == 'y' || ch == 'Y') {
			// 값 추가

			System.out.print("더 입력하고 싶은 개수 : ");
			int moreSize = sc.nextInt(); // 2
			sc.nextInt();
			// 깊은 복사
			String[] newArr = new String[arr.length + moreSize];
			// [null, null, null, null]
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			for (int i = 0; i < arr.length; i++) {
//					if(newArr[i] != null) continue;
//					비어있는 인덱스 위치에서 부터 값을 초기화
				System.out.print((i + 1) + "번째 문자열 : ");
				newArr[i] = sc.nextLine();
			}
			// 얕은 복사
			arr = newArr;
		} else {
			// 값 출력
			System.out.println(Arrays.toString(arr));
			break;
		}
		}
	}
}

