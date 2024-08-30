package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	private Lottery[] arr = new Lottery[29];

	public boolean insertObject(Lottery l) {
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		// 전달 받은 l을 lottery에서 삭제
		// 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
		// 삭제 결과인 boolean 값과 win객체가 비어있지 않을 때에만
		// win에도 해당 추첨 대상자 삭제
		boolean result = lottery.remove(l);

		if (win.isEmpty() && result) {
			win.remove(l);
		}
		return result;
	}

	public HashSet winObject() {
		// 추첨 대상자(lottery) 중에서 랜덤으로 뽑아 당첨 목록(win)에 넣는 메소드
		ArrayList<Lottery> list = new ArrayList(lottery);

		if (list.size() < 4) {
			return null; // 추첨자수가 4명보다 작은경우. 추첨불가.
		}

		// 1) shuffle함수 이용 , 2) Math.ramdom()
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함

		// 1) shuffle
//		Collections.shuffle(list);
//		for(int i = 0; i<4; i++) {
//			win.add(list.get(i));
//		if(win.size() >= 4) {
//			break;
//		}
//		}

		// 2) Math.ramdom
		for (int i = 0; i < 4; i++) {
			int ramdomIndex = (int) (Math.random() * list.size());
			Lottery l = list.get(ramdomIndex);

			if (win.size() >= 4) {
				break;
			}
			boolean result = win.add(l);
			if (result == false) { // 값이 중복인경우
				i--;
			}
		}
		// -------------------------------------------------------------
		// 만일 당첨자 목록(win)에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		return win;

	}

	public TreeSet sortedWinObject() {
		winObject();

		TreeSet<Lottery> ts = new TreeSet<>(new Comparator<Lottery>() {

			@Override
			public int compare(Lottery o1, Lottery o2) {
				int result = o1.getName().compareTo(o2.getName());
				if (result == 0) {
					result = o1.getPhone().compareTo(o2.getPhone());
				}
				return result;
			}
		});
		ts.addAll(win);
		return ts;
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환

		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함
	}

	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		return win.contains(l);
	}

}
