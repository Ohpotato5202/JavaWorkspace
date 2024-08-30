package com.kh.chap03_stream.part02_methods;

import java.util.Arrays;
import java.util.List;

public class StreamMethods {
	/*
	 * 스트림은 중간연산 메서드들과 최종연산 메서드들.
	 * 
	 * 자주 사용되는 중간 연산 메서드들. 매개변수로 람다식을 받은 후 메서드 내부에서 연산처리시 사용됨.
	 * 1) distcnt : 중복값 제거
	 * 2) filter  : 내부요소 필터링
	 * 3) map     : A값을 매개변수로 받아서 B값을 반환 (데이터 변환작업)
	 * 4) peek    : 중간확인 메서드. 현재요소를 가져와서 원하는작업 처리가능
	 * 5) sort    : 정렬메서드
	 * ...
	 * 
	 * 최종연산 메서드들
	 * 1) Iterating   : forEach -> 요소를 단순 반복
	 * 2) Collecting  : Collect(Collectors.?) -> 스트림 내부요소를 List,set,array계열등으로 반환
	 * 3) Calculating : min , max , sum , average ... -> 최소 최대값등 산술연산시 사용하는 최종 연산메서드.
	 * 4) Matching    : anyMatch, noneMatch, allMatch .. -> 스트림 내부 요소들에 특정 조건을 만족하는지 검사하는 메서드
	 * 5) Reduction   : reduce라는 메서드를 사용해서 요소 내부의 값을 다양한 방법으로 연산후 결과값을 반환.
	 *                  Calculating계열의 메서드가 아닌 개발자가 직접 연산과 관련된 코드를 쓸때 사용함.
	 * */

	public static void main(String[] args) {
		StreamMethods sm = new StreamMethods();
		sm.test1();
	}
	
	public void test1() {
		// 중간처리 메서드들 + forEach
		// 1) distinct, filter
		List<Integer> list = List.of(1,2,5,6,7,7,9,4,4);
		list.stream()
		    .distinct()
		    .filter(num -> num % 2 != 0)
		    .forEach(System.out::println);
		
		String[] names = {"강감찬", "강원래", "홍길동", "강형욱", "초난강"};
		Arrays.stream(names)
		      .filter(name -> name.startsWith("강"))
		      .forEach(System.out::println);
		
		// 2) map : 데이터변환시 사용. 현재요소(T)를 받아서 다른요소(R)로 바꿔주는 메소드
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		list2.stream()
		     .map(n -> n * 10) // 1 -> 10, 2 -> 20, 3 -> 30...
		     .map(n -> n * 20) 
		     .forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
