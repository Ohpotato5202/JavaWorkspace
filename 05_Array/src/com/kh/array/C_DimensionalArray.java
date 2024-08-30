package com.kh.array;

import java.util.Arrays;

public class C_DimensionalArray {
	// 이차원 배열 : 자료형이 같은 일차원 배열 여러개를 하나로 묶은 것이 2차원 배열
	
	public void method1() { 
		
		/*
		 * 이차원 배열 선언
		 * [표현법]
		 * 자료형 배열명 [][];
		 * 자료형 [][] 배열명;
		 * 자료형 [] 배열명 [];
		 * */
		
		int arr1[][];
		int [][] arr2;
		int [] arr3[];
		
		/*
		 * 이차원 배열 할당 (크기 저장)
		 * 배열명 = new 자료형 [2차원 배열의 크키] [1차원 배열의 크기] 
		 * */
		arr3 = new int[2][3];
		/*[
		   [0,0,0]
		   [0,0,0]
		 * ]
		 * */
		int[][] arr = new int[2][3];
		System.out.println(arr); // 2차원 주소값
		System.out.println(arr[0]); // 1차원 주소값
		System.out.println(arr[0][0]); // 0번째 index000000000000000000000
		
		System.out.println("2차원 배열의 길이(행의 길이) : "+ arr.length);
		
		//1차원 배열의 길이를 알아내는 방법
		System.out.println("1차원 배열의 길이(열의 길이) : "+arr[0].length);
        
		// 외부반복문 (행반복) ==> 행 == 2차원배열
		for(int row = 0; row < arr.length; row++ ) {
			// 내부반복문(열반복) => 열 == 1차원 배열
			for(int col = 0; col < arr[row].length; col++) { //현재 반복중인 1차원 배열의 길이만큼 반복
				System.out.print(arr[row] [col] + " ");
				
			}
			System.out.println();
		}
	}
	
	public void method2() {
		// 순서대로 1,2,3,4,..........15 값을 대입하기
		int[][] arr = new int[3][5]; // 3 * 5 => 15
				
		/*
		 * 비어있는 arr에 1~15까지의 값을 순차적으로 대입후, 출력하기
		 * 
		 * 0행 [1,2,3,4,5]
		 * 1행 [6,7,8,9,10]
		 * 2행 [11,12,13,14,15]
		 * 
		 * arr[0][0] , arr[0][1]
		 * hint) 외부변수 , 중첩반복문
		 * */
		int value = 1;
		for(int row = 0; row < arr.length; row++ ) {
			
			for(int col = 0; col < arr[row].length; col++) {
				// arr[0][0] = 1
				// arr[0][1] = 2
				// ...
				// arr[0][4] = 5;
				// arr[1][0] = 6;
				// arr[1][0] = 6;
				// ...
				// arr[1][4] = 10; 내부반복문종료
				arr [row][col] = value++;
				System.out.printf("%3d ", arr[row][col]); // i, j, low, col 중 사용하면됨
			}
			System.out.println(); // \n
		}
	}
	
	public void method3() {
		int[] iArr = {1,2,3,4,5};
		
		// 2차원 배열 선언 및 초기화
		int [][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
				
		};
		// [3][5]
//		System.out.println(Arrays.toString(arr)); //주소값들만 출력
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		
		}
	}
	public void method4() {
		/*
		 * 가변 배열
		 * 행(2차원 배열)의 크기는 정해졌으나
		 * 행 별 열 (1차원 배열)의 갯수가 정해지지 않은 상태 
		 * 
		 * 행 크기는 생략이 불가, 반드시 지정해야 하지만
		 * 열 크기는 생략이 가능하다. (각 행의 열의 길이 변경가능)
		 * 
		 * */
		int[][] arr = new int[3][]; // 가변 배열
		
		System.out.println(arr); // 2차원배열 주소
		System.out.println(arr[0]); // null , 1차원 주소값
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		/*
		 * [
		 *   [1, 2],
		 *   [3] ,
		 *   [4,5,6]
		 * ]
		 *   */
		int velue = 1;
		for(int row =0; row<arr.length; row++) {
			for(int col =0; col < arr[row].length; col++) {
				arr[row][col] = velue++; 
		
		
		}
	}
	}		
}
