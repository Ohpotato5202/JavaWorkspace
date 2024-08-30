package com.kh.chap_01_list.part02_clone.run;

import java.util.Arrays;

import com.kh.chap_01_list.part01_arrayList.model.vo.Music;

public class ArrayRun {
	private static final int DEFAULT_CAPACITI = 10; // 기본생성자 호출시 사용되는 객체의 크기값.
	Music[] mArr; // null
	private int size; //0
	
	public ArrayRun() {
		mArr = new Music[DEFAULT_CAPACITI]; // 기본생성자 호출시 길이 10짜리 Music객체배열 생성.
	}
	
	public ArrayRun(int initialCapacity) {
		mArr = new Music[DEFAULT_CAPACITI];
		
	}
	
	public static void main(String[] args) {
		// 기본생성자 호출(길이 10짜리 배열)
		ArrayRun ar = new ArrayRun();
		System.out.println(ar.size());
		// 매개변수 있는 생성자(길이 5짜리 배열)
		ArrayRun ar2 = new ArrayRun(5);
		
		ar2.add(new Music("스물다섯 스물하나","자우림"));
		ar2.add(new Music("스물다섯 스물하나","자우림"));
		ar2.add(new Music("스물다섯 스물하나","자우림"));
		ar2.add(new Music("스물다섯 스물하나","자우림")); // 3번인덱스
		ar2.add(3, new Music("AK47","뷰티풀너드"));
		ar2.add(3, new Music("시한부","leellamarz"));
		System.out.println(ar2.size());
		
		//ar2.add(null);
		System.out.println(ar);
		System.out.println(ar2);
	}

	// 배열의 마지막 위체에 매개변수로 전달받은 Music m을 추가하는 함수
	public void add(Music m) {
		// 1) 배열의 저장공간이 꽉찬경우 ?
		//    배열을 늘려줘야함.(1칸) ===> 배열복사.Arrays.copyOf();
		if(mArr.length == size) {
			mArr = Arrays.copyOf(mArr, size +1); // 길이 1증가
		}
		// 배열의 길이를 초과하는 경우 에러발생.
		
		mArr[size++] = m; // 값 저장후 size 증가.
		
		
	}

	// 배열의 index위치에 전달받은 Music m을 추가하는 함수
	private void add(int index, Music m) { // 끼워넣기
		// 1) 배열의 범위를 벗어난 index제시시?
		// 출력문 : 저장가능한 인덱스 위치가 아닙니다.
		if(index >= size || index < 0) { // 초기화되지 않은 위치에 값을 추가하거나, 음수를 제시하는 경우
			System.out.println("저장가능한 인덱스 위치가 아닙니다.");
			return;
		}
		
		// 2) 배열의 저장공간이 꽉찬경우 배열의 크기 증가.
		if(size == mArr.length) {
			mArr = Arrays.copyOf(mArr, size +1);
		}
		// 3) index위치에 값을 저장시 이미 값이 들어가 있다면 한칸씩 뒤로 밀어줘야함.
		// [1,2,3,4,5] => 3번 인덱스에 10이라는 값을 넣고싶다?
		// [ 1,2,3,4,5,0]
		// 3_1) 반복문 활용하여 뒤로 밀어주기
		//for(int i = size; i>index; i--) {
			//mArr[i] = mArr[i - 1];
		//}
	    // [1,2,3,4,4,5]
		// 3_2) 배열 복사를 통한 뒤로 밀어주기
		//System.arraycopy(원본배열, 원본에서 복사를 시작한 인덱스, 복사본배열, 복사본배열에서 복사될 인덱스, 복사할 갯수);
		// [1,2,3,4,5,0]
		System.arraycopy(mArr, index, mArr, index +1, size - index); // 성능이나 효율이 더 좋음
		// [1,2,3,4,4,5]
		
		mArr[index] = m;
		size++;
		// [1,2,3, 10, 4,5]
		}
	
	
	// 배열 내부에 "초기화된" 데이터만 문자열로 반황하는 함수
	// []
	// [ "1234" , "1234" ]
	public String toString() {
		// 
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		//반복문 돌리면서 초기화된 데이터의 toStirng()호출
		for(int i = 0; i<size; i++) {
			sb.append(mArr[i].toString());
			sb.append(i != (size -1) ? "," : " "); // 다음값이 있다면 , 없다면 ' '
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public int size() {
		// Size를 반환해주는 함수
		return size;
		
	}
	
	public boolean isEmpty() {
		// 배열 내부의 값이 비어 있는지 반환 해주는 함수
		// 배열 내부에 초기화된 데이터가 1개라도 존재하는가?
		
		return size == 0;
	}
	
	public Music get(int index) {
		//배열의 index위치의 값을 반환해주는 함수

		// 잘못된 인덱스 범위를 제시하는 경우(size기준 체크)
		// 출력문 : 잘못된 인덱스 범위입니다.
		// null값 반환.
		if(index >= size || index < 0) {
			System.out.println("잘못된 인덱스 범위입니다.");
			return null;
		}
			
			return mArr[index];
			
		}
		
	public Music set(int index, Music m) {
		// 잘못된 인덱스 범위를 제시하는 경우(size기준 체크)
		// 출력문 : 잘못된 인덱스 범위입니다.
		if(index >= size || index < 0) {
			System.out.println("잘못된 인덱스 범위입니다.");
			return null;
		}
		Music old =mArr[index]; // 이전에 담겨 있던값.
		
		mArr[index] = m;
		
		return old;
		}
	
		
	public Music remove(int index) {
		// 잘못된 인덱스 범위를 제시하는 경우(size기준 체크)
		// 출력문 : 잘못된 인덱스 범위입니다.
		if(index >= size || index < 0) {
			System.out.println("잘못된 인덱스 범위입니다.");
		    // throw 예외객체;로 예외 강제로 발생시켰음.
			return null;
			
		}
		Music old = mArr[index];
		// 항상 빈공간을 채우기위해, index뒤쪽의 값을 땡겨오는 코드가 있음.
		// 반복문을 활용한 땡기기
		// [m1, m2, m3, m4, m5,]; 에서 2번 인덱스에 값을 삭제 
		// [m1, m2, m4, m5, m5,]; 
	    for(int i = index; i < size - 1; i++) {
	    	mArr[i] = mArr[i+1];
	    	
	    }
	    mArr[size -1] = null;
		// mArr[index] = null;
		size--;
		return old;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


