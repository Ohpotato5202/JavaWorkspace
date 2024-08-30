package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	// [null, null, null, null ... null]
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	public MemberController() {
		m[0] = new Member("aaaa", "박신우", "aa", "cccc@aaaa", 'F', 33);
		m[1] = new Member("bbbb", "강고결", "bb", "cccc@aaaa", 'M', 24);
		m[2] = new Member("cccc", "남나눔", "cc", "cccc@aaaa", 'M', 28);
	}

	public int existMemberNum() {
		int memberNum = 0;
		for (Member mem : m) {
			if (mem != null)
				memberNum++;
		}
		return memberNum;

	}

	public boolean checkId(String inputId) {
		boolean result = true;

		for (Member mem : m) {
			// 중복값이 존재하므로 사용불가.
			// [null, null , null,null]
			// null.?
			// mem = null일시 A && B에서 A조건을 통과 못하고 종료.
			if (mem != null && mem.getId().equals(inputId)) {
				result = !result;
				break;

			}

		}

		return result;

	}

	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		Member member = new Member(id, name, password, email, gender.charAt(0), age);

		// 객체배열 내부에 member 저장
		m[existMemberNum()] = member;

		// for(int i =0; i<SIZE; i++) {
		// if(m[i] == null) {
		// m[i] = member;
		// break;
		// }
		// }
	}

	public String searchId(String id) {

		String result = null;
		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				result = mem.toString();
				break;
			}
		}

		return result;

	}

	public Member[] searchName(String name) {

		Member[] temp = new Member[10];

		int index = 0;

		for (Member mem : m) {
			if (mem != null && mem.getName().equals(name)) {
				temp[index++] = mem; // 주소값 복사

			}
		}
		// 배열복사를 통해 초기화된 데이터만 전달.
		return Arrays.copyOf(temp, index);

	}

	// searchEmail생략

	public boolean updatePassword(String id, String password) {
		boolean result = false;

		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				result = true;
				mem.setPassword(password);
			}
		}

		return result;
	}
	// updateName,updateEmail 생략

	public boolean delete(String id) {
		boolean result = false;

		int memberNum = existMemberNum(); // 현재 회원가입한 회원 수

		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				// 저장되어있던 주소값의 연결을 해제
				// 회원가입기능에 문재발생.
				// m[i] = null;
				// i 뒤쪽에 존재하는 데이터를 한칸씩 앞으로 땡겨오기

				for (int j = i; j < memberNum; j++) {
//					if (j == memberNum - 1) { // 마지막 반복이라면 null로 초기화
//						m[j] = null;
//					} else { // 마지막 반복이 아니라면 다음 인덱스의 값을 현재위치로 한칸 땡겨옴
//						Member temp = m[j + 1];
//						m[j] = temp;
//					}
					m[j] = (j == memberNum - 1) ? null : m[j + 1];
				}
				result = true;
				break;
			}
		}
		return result;
	}

	public void delete() {
		// 1) 새로운 빈배열 객체 생성
		m = new Member[SIZE];
		// 2) 반복문으로 모든 인덱스의 값 null로 초기화
		for (int i = 0; i < SIZE; i++) {
			m[i] = null;
		}
	}

	public Member[] printAll() {

		return m;
	}

}
