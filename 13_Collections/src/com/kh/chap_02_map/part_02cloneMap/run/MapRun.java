package com.kh.chap_02_map.part_02cloneMap.run;

import java.util.Arrays;

import com.kh.chap_02_map.part_01hashMap.model.vo.Snack;

public class MapRun<K , V> {

	class Entry<K,V> {
		K key;
		V value;
		Entry next;

		public Entry(K key, V value, Entry<K,V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	private Entry<K,V>[] table;
	private int capacity;
	private int size;

	public MapRun(int capacity) {
		this.capacity = capacity;
		table = new Entry[capacity];
	}

	public static void main(String[] args) {
		MapRun mr = new MapRun(10);
		mr.put("다이제", new Snack("초코맛", 1500));
		mr.put("다이제", new Snack("초코맛", 1500));
		mr.put("칸초", new Snack("단맛", 600));
		mr.put("새우깡", new Snack("짠맛", 500));
		mr.put("포테이토칩", new Snack("짠맛", 500));

		System.out.println(mr);
		System.out.println(mr.size());
		System.out.println(mr.get("다이제"));
		System.out.println(mr.get("칸초"));
		System.out.println(mr.containsKey("칸초"));
		System.out.println(mr.containsKey("칸초2"));
		
		mr.remove("포테이토칩");
		System.out.println(mr.containsKey("포테이토칩"));
		System.out.println(mr.size());

	}

	public int getIndex(K key) {
		// 매개변수로 전달받은 key값을 hashCode()로 변환시킨후
		// 객체의 총 저장공간 수(capacity)만큼 나눈 나머지 결과값을 반환하는 함수.
		return Math.abs(key.hashCode()) % capacity; // HashCode값을 양수로 반환

	}

	public void put(K key, V value) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		Entry e = table[index];

		Entry newEntry = new Entry(key, value, null);
		if (e == null) {
			// 접근시 내부의 값이 null이라면 Entry매개변수 있는 생성자를 이용하여
			table[index] = newEntry;
			// 객체생성후 비어있는 저장공간에 Entry객체 추가하기.
			// ex) 최초 Entry 객체 생성시 : new Entry(key, value , null)
		} else {
			if (e.key.equals(newEntry.key)) {
				e.value = newEntry.value;
				return; // size추가 안되게 종료.
			} else {

				while (true) {
					if (e.key.equals(newEntry.key)) {
						e.value = newEntry.value;
						return;
					}
					// next로 뽑은 entry값도 key값이 일치하는지 비교.
					if (e.next == null) {
						e.next = newEntry;
						break;
					}
					// 현재 entry에 next값을 저장.
					e = e.next;
				}
			}
		}
		size++;
	}

	public V get(K key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		
		Entry<K,V> e = table[index];
		
		// 접근시 내부의 값이 null이라면 null값 반환
		if (e == null)  {
			return null; // 데이터 없음.
		}
		
		do {
		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 객체에 저장된 value값 반환.
			if (e.key.equals(key)) {
				return e.value;  // key값과 동일하다면 value값 반환
			}
			// 동일하지 않다면 노드드의 next 값을 찾아 다시한번 검사 (next가 존재하지
			// 않을때까지 반복). 다음 노드들 중에서 key값이 일치하는 값이 존재한다면
			// 노드 내부의 value값 반환. 
			e = e.next;
		}while (e != null) ;
		// 일치하는 key값이 없었다면 null값 반환
		return null;
 
}

	public boolean containsKey(K key) {
		int index = getIndex(key);
		Entry e = table[index];
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		// 접근시 내부의 값이 null이라면 null값 반환

		if (e == null) {
			return false;
		}
		do {
			if (e.key.equals(key)) {
				return true;
			}
			e = e.next;
		} while (e != null);
		return false;
		
	}

	public void remove(K key) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		Entry e = table[index];
		
		// 접근시 내부의 값이 null이라면 메소드 종료;
		if (e == null) {
			return;
		}
		
		// 첫번쨰 entry라면 / 아니라면 조건필요
		if(e.key.equals(key)) { // 첫번째 entry
			table[index] = null;
		}
		
		do {
			if(e.key.equals(key)) {
				e = (e.next == null ? null : e.next.next);
				// 내가 찾고자하는 key값이라면 삭제.
				// 현재 entry에 next값이 존재한다면,
				while(e.next != null) {
					e = e.next;
				}
				
				size --;
				return;
				
			}
			e = e.next;
		}while(e != null);
		// 객체가 있다면 저장된 객체의 key값과 매개변수로 전달받은 key값 확인
		// 동일하다면 현재 Node삭제.
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(Entry e  : table) {
			if(e == null) continue;
			// {key : value}
			sb.append('{').append(e.key).append(e.value).append('}').append(",");
			
			Entry next = e.next;
			do {
				if(next != null) {
					sb.append('{').append(e.key).append(e.value).append('}').append(",");
				}
				next = next.next;
			}while(next != null); // 
		}
		sb.append(Arrays.toString(table));
		
		sb.append('}');
		return sb.toString();

	}

}
