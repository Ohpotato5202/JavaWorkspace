package com.kh.chap_01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap_01_list.part01_arrayList.model.compare.MusicComparator;
import com.kh.chap_01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	/*
	 * Collection? 자료구조 프레임워크
	 * 
	 * 자료구조 - 방대한 데이터들을 효율적으로 다루고자 할 때 필요한 개념.
	 * 프레임워크 - 효율적인 기능들이 정의되어있는 틀.
	 * 
	 * -> 데이터들이 새롭게 추가되거나, 삭제되거나 수정이 되는 기능들이 이미 정의되어있는 틀 
	 * -> 댜량의 데이터들을 관리하고자 할때 배열을 가지고도 충분히 사용 가능했으나, 좀 더 사용하기 쉽게
	 *    다양한 기능들을 보완시켜준게 컬렉션.
	 * 
	 * 배열과 List의 차이점
	 *  - 배열의 단점
	 *  1. 크기를 지정하면 변경 불가. => 즉, 한번 지정한 크기를 중간에 바꿀수 없다.
	 *  2. 삭제시 비어있는 공간을 한칸씩 떙겨오는 작업이 필요하다.
	 *  3. 자료형을 한개만 관리할수 있다.
	 *  
	 *  - List의 장점
	 *  1. 크기의 제약이 없음.
	 *   => 크기지정을 해줄 필요도 없고, 만일 크기지정을 해도 알아서 크기가 늘어남.
	 *   => 크기가 늘어나면 깊은 복사를 해주는 메서드가 내장되어 있음.
	 *  2. 중간지점에 데이터가 추가, 삭제 되는 경우 기존값들을 밀거나 떙겨오는 코드가 내장되어 있음.
	 *  3. 기본적으로 여러타입의 데이터를 저장할수 있음. (+ 제네릭 성정을 통해 한타입의 데이터만 들어오게도 가능)
	 *  
	 *  방대한 데이터를 단지 담아만두고 조회만할거다? => 배열써도 상관없음
	 *  방대한 데이터들이 빈번하게 추가, 삭제, 수정 될것 같다 => 컬렉션(List)사용.
	 *  
	 *  컬렉션의 3가지 분류
	 *  List 계열 : 담고자하는 값(value)만 저장함.
	 *             값 저장시 index를 사용하여 순서를 유지한다.
	 *             중복값을 허용한다.
	 *  구현클래스  : ArrayList , LingkedList, Vector
	 *  
	 *  Set  계열 : 중복값을 허용하지 않는다. ★★★★★
	 *             담고자하는 값(value)만 저장함.
	 *             값 저장시 index를 사용하지 않아서 순서유지가 불가능.
	 *   구현클래스 : HashSet , TreeSet
	 *  
	 *  Map  계열 : key(키) + 담고자하는 값(value)세트로 저장시킴.
	 *             값 저장시 index를 사용하지 않아서 순서유지가 불가능함.
	 *             key값은 중복 허용하지 않고
	 *             value값은 중복을 허용함.
	 *   구현클래스 : HashMap, Properties, TreeMap 
	 *  
	 * */
	

	public static void main(String[] args) {
		
		//List /*<String>*/ list = new ArraryList(); // 내부적으로 크기 10짜리 배열이 생성됨.
		
		/*
		 * 제네릭 (  <E>  )
		 * 별도의 제네릭 지정 없이 컬렉션 객체들을 생성하면 <E>에는 자동으로 <Object>가 할당됨.
		 * 해당 컬렉션에 다양한 타입의 데이터를 담을 수 있게 된다. (다형성에 의해)
		 * 
		 * 객체 생성시 <Music>으로 생성하게 되면 해당 컬렉션에는 Music자료형의 데이터만 담을 수 있음.
		 * 
		 * 제네릭 성정 하는 이유
		 * 1. 타입 안정성 확보를 위해. -> 명시한 타입의 객체만 저장 가능 하도록 제한을 두기 위해서.
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할때 발생하는 귀찮은 형변환 절차를 없애기 위하여.
		 * */
		
		List<Music> list = new ArrayList<>(10); // 내부적으로 크기 10짜리 Music[] 배열이 생성됨.
		
		System.out.println(list);
		
        // ArrayList내부의 클래스		
		// 1. add(E e) : 리스트의 "끝"에 전달된 매개변수를 추가하는 메소드.
		list.add(new Music("Tears","소찬휘"));
		list.add(new Music("스물다섯스물하나","자우림"));
		list.add(new Music("스토커","10CM"));
		
		System.out.println(list);
		
		// 2. add(int index, E e) : 리스트에 전달되는 index위치에 매개변수 e를 추가시켜주는 메소드
		list.add(1, new Music("눈사람", "정승환")); // 앞에 쓰는 숫자별로 위치 달라짐
		
		System.out.println(list);
		
		// 3. set(int index, E e) : 리스트에 해당 인덱스값을 매개변수 e로 "변경"시켜주는 메소드
		list.set(2, new Music("밤이되니까", "펀치")); // 유요한범위로 제시해야함 // set은 변경 add순서 바꾸기
		
		System.out.println(list);
		
		// 4. remove(int index) : 리스트에 해당 인덱스 값을 삭제시켜주는 메소드
		list.remove(1); // 뒤쪽의 값들이 한칸씩 떙겨져옴.
		
		System.out.println(list);
		
		// 5. size() : 리스트에 담겨있는 데이터(객체)수를 반환해주는 메소드. 
		System.out.println("리스트에 담겨있는 데이터의 수 : "+list.size()); // 초기화된 데이터수에 따라 수가 다름
		
		// 6. get(int index) : E => 리스트에서  index위치의 값을 반환.
		System.out.println("0번인덱스의 값 ? "+list.get(0));
		
		// 제네릭 설정 전, Music객체 내부의 title필드 확인시
		System.out.println("0번 인덱스의 title값 ? " + ( ((Music)list.get(0)).getTitle()));
	
		// 제네릭 설정 후 , Music객체 내부의 title필드 확인시
		System.out.println("0번 인덱스의 title값 ? " + list.get(0).getTitle() );
		
		// -----------------------------------------
		ArrayList<Integer> Iarr = new ArrayList<>(3);
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		
		// contains(E e ) : boolean => 매개변수로 전달받은 데이터를 배열이 포함하고 있다면 true . false
		System.out.println("9를 포함하고 있는가 ? " + Iarr.contains(9));
		
		// 8. IndexOF(E e) : int => 매개변수의 요소가 몇번쨰 인덱스에 있는지 반환. 없다면 -1
		System.out.println(Iarr.indexOf(9));
		System.out.println(Iarr.indexOf(900));
		
		// ---------------------------------------------------------------------
		// 반복문 활용 
		// 0번 인덱스부터 마지막 인덱스까지의 데이터를 출력하시오.
		// for문(basic loop)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // list[i]; (x)
			
		}
		
		// 향상된 반복문(for each)
		for( Music m   :  list    ) {
			System.out.println(m);
		}
		
		// 3. Iterator : 내부데이터를 Iterator안에 담아서 관리
		Iterator<Music> iter =  list.iterator();
		while(iter.hasNext()) {
			Music m = iter.next();
			System.out.println(m); //System.err.println(m); 에러로 출력하는 방법
		}
		
		System.out.println("========================================");
		
		/*
		 *  7. subList(int index1, int index2)
		 *     리스트의 index1 <= 에서부터 index2 < 까지의 데이터값들을 추출해서 새로운
		 *     List로 반환시켜주는 메소드
		 * */
		List<Music> subList = list.subList(1, 2);
		System.out.println(subList);
		
		// 8. addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 데이터들을 통으로 추가하는 메소드
		list.addAll(subList);

		System.out.println(list);

		// 9. isEmpty() : 해당리스트가 비어있는지 묻는 메소드(비어있다면 true/ false)
		System.out.println("리스트가 비어있습니까? " + list.isEmpty());

		// 10. clear() : 해당 리스트를 싹 비워주는 메소드
		// list.clear();
		System.out.println("리스트가 비어있습니까? " + list.isEmpty());
		System.out.println(list);
		
		// 11. Collections.sort(List list) : 기본정렬기준 -> 사전등록순서상 오름차순 정렬.
		/*
		 * 내가 정의한 객체를 정렬하기 위해서는 정렬기준을 새롭게 만들어 줘야함.
		 * 객체 정렬방법은 크게 2가지 있음.
		 * 1. Comparable인터페이스 구현
		 *    - 정렬기준이 한가지일때 사용
		 *    - 객체의 기본 정렬기준을 구현할때 사용.
		 *    - CompareTO메소드 오버라이딩 하는 방식.
		 *    => 매개변수로 전달받은 값과 자기자신(this)를 통해 비교하는 방식.
		 *    
		 * 2. Comparable인터페이스 구현하는 방법
		 *  - 정렬기준이 여러개일때 사용
		 *  - 기본정렬외에 추가적으로 정렬기준을 제시해야할때 사용.
		 *  - 별도의 Comparator구현클래스를 작성.
		 *  - compare메소드를 오버라이딩함.
		 *  => 매개변수로 2개의 값을 전달받고 둘중 뭐가 큰지 비교하는 방식.
		 * */
		System.out.println("==============정렬후================");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("=========== Comparator를 활용한 정렬 ===========");
		Collections.sort(list, new MusicComparator());
		System.out.println(list);
		System.out.println("=========== 익명클래스를 활용한 정렬 ===========");
		Collections.sort(list, new Comparator<Music>(){
		                         public int compare(Music o1, Music o2) {
		                        	 return o2.getArtist().compareTo(o1.getArtist());
		                         }
	});
		
		List<String> sList = new ArrayList<>();
		sList.add("나경민");
		sList.add("라경민");
		sList.add("가경민");
		sList.add("다경민");

		System.out.println("정렬전");
		System.out.println(sList);

		Collections.sort(sList);
		System.out.println("정렬후");
		System.out.println(sList);

		// 12. Collections.shuffle(list) : 리스트 내부의 값을 섞는 메서드
		Collections.shuffle(sList);
		System.out.println("섞은후");
		System.out.println(sList);
		
		
		
		
		
		
		
		
		
		
	}

}
