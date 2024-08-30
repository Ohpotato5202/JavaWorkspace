package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * 배열 복사 1) 얕은 복사 : 배열의 주소값만을 복사
	 * 
	 * 2) 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 내부의 값들을 복사
	 */

	public void method1() {

		// 원본 배열
		int[] orgins = { 1, 2, 3, 4, 5 };

		System.out.println("===== 원본 배열 출력 ======");
		for (int i = 0; i < orgins.length; i++)
			System.out.println(orgins[i] + " ");

		// 1 2 3 4 5

		// 얕은 복사
		int[] copy = orgins; // orgins의 주소값 대입
		System.out.println("===== 복사본 배열 출력 ======");
		for (int i = 0; i < orgins.length; i++)
			System.out.print(copy[i] + " ");

		copy[2] = 9999;
		System.out.println("===== 복사본 배열 수정 후 ======");

		System.out.println("===== 원본 배열 출력 ======");
		for (int i = 0; i < orgins.length; i++)
			System.out.println(orgins[i] + " ");

		System.out.println("===== 복사본 배열 출력 ======");
		for (int i = 0; i < orgins.length; i++)
			System.out.print(copy[i] + " ");

		System.out.println("orgins 와 copy는 동일합니까? " + (orgins == copy));
		// 같은 주소값을 공유해서 사용하고 있기 떄문에 복사본 배열 수정시 원본배열에도
		// 영향을 끼친다.
	}

	public void method2() {
		// 1. for문을 통한 복사
		// 새로운 배열을 생성한 후 인덱스 별 내부값을 일일히 대입하는 방법.

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[origin.length];

		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];

		}

		System.out.println("===== 원본 배열 출력 ======");
		for (int i = 0; i < origin.length; i++)
			System.out.print(origin[i] + " ");

		System.out.println("===== 복사본 배열 출력 ======");
		for (int i = 0; i < origin.length; i++)
			System.out.print(copy[i] + " ");

		copy[2] = 9999; // 복사본 배열 수정

		System.out.println("===== 원본 배열 출력 ======");
		for (int i = 0; i < origin.length; i++)
			System.out.print(origin[i] + " ");

		System.out.println("===== 복사본 배열 출력 ======");
		for (int i = 0; i < origin.length; i++)
			System.out.print(copy[i] + " ");

	}

	public void method3() {

		// 2. System클래스의 arraycopy메소드를 활용한 깊은 복사
		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[10];
		// System.arraycopy(원본 배열명, 원본 배열의 복사를 시작할 인덱스, 복사본 배열명
		// 배열의 복사될 시작 인덱스, 복사할 갯수)
		System.arraycopy(origin, 0, copy, 0, 5);

		// 잘못된 범위의 인덱스를 제시했을때는 오류가 발생함.
//		System.arraycopy(origin, 2, copy, 9, 2);
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}

	public void method4() {
		// 3. Arrays클래스에서 제공하는 copyof메소드를 이용한 복사
		int[] origin = { 1, 2, 3, 4, 5 };

		// 복사본배열 = Arrays.copyof(원본배열명, 복사할갯수);
		int[] copy = Arrays.copyOf(origin, 7); // 복사할갯수 == copy배열의 크기

		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.print(" -----------------  ");
		copy(origin, 7);

		/*
		 * 2. System.arraycopy 메소드 : 몇 번 인덱스 부터 몇개를 어느 위치의 인덱스에 복사할건지 직접 지정 가능
		 * 
		 * 3. Arrays.copyOf 메소드 : 무조건 원본의 0번 인덱스 부터 내가 제시한 갯수만큼 복사가 진행된다 내가 제시한 길이가
		 * 원본배열보다 크다면, 나머지는 0으로 채워진다.
		 */
	}

	public void method5() {
		// 4. clone메소드를 통한 복사
		int[] origin = { 1, 2, 3, 4, 5 };

		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone(); // 주소값만 다르고, 원본배열과 완전 동일한 배열을 반환

		System.out.println(Arrays.toString(copy));
		// Arrays.toSting(배열)
		// => 앞과 뒤에 [] 붙히고 사이에는 각 인덱스의 값을 ,를 찍어가면서 보여준다.

		// toSting함수 구형
		System.out.print(" [ ");
		for (int i = 0; i < copy.length; i++) {
			if (i < copy.length - 1) { // 마지막 인덱스가 아니라면
				System.out.print(copy[i] + ", ");
			} else {
				System.out.print(copy[i]);
			}
		}
		System.out.print(" ] ");
	}

	public void copy(int[] origin, int size) {

		int[] copy = new int[size];

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];

		}

		for (int i = 0; i < copy.length; i++)
			System.out.print(copy[i] + " ");
	}

}
