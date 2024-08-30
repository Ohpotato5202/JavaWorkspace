package com.kh.chap02_objectArrey.run;

import java.util.Arrays;

import com.kh.chap02_objectArrey.model.vo.Phone;

public class ObjectRun {

	public static void main(String[] args) {

		Phone[] arr = new Phone[3]; //

		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));

		arr[0] = new Phone();
		arr[1] = new Phone("갤럭시s","23","삼성",1500000);
		arr[2] = new Phone("갤럭시z플립","5","삼성",1500000);
		
		arr[0].setName("i phone");
		arr[0].setBrand("apple");
		arr[0].setSeries("15");
		arr[0].setPrice(1500000);
		
		System.out.println(Arrays.toString(arr));
		
		// 핸드폰 배열의 길이 만큼 반복하면서
		// 반복중인 핸드폰의 정보를 출력하고,
		// 핸드폰들 가격의 총합과 평균가격을 계산해서 출력하시오
		System.out.println("----------------------");
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i].getPrice();
		}
		System.out.println("총 가격 : " +sum);
		System.out.println("평균 가격 : " + (double) sum/ arr.length);
		
		///////////////////////////////////////////////////////////
		/*
		 * 향상된 반복문
		 * 
		 * 이전 for(초기식; 조건식; 증감식) 반복문은 basic loop이라고 부름
		 * 
		 * for each문(향상된 반복문)
		 * - 배열 또는 컬렉션과 사용됨
		 * - 배열 또는 컬렉션의 0번 인덱스 부터 마지막 인덱스까지 순차적으로 접근하는게 목적일때 사용함.
		 * 
		 * - 초기식, 조건식, 증감식이 없음
		 * - 반복하는 횟수는 배열이나 컬렉션의 크기에 의해 정해진다.
		 * 
		 * for ( 인덱스에 담긴값을 저장할 변수 선언 : 배열변수명 ) {
		 *     // 반복적으로 실행할 내용
		 * 
		 * }
		 * */
		System.out.println("==============================");
		int total = 0;
		
		for( Phone ph : arr) {
			System.out.println(ph);
			total += ph.getPrice();
			
		}
		System.out.println("가격 총합 : " +total);
	}
}
