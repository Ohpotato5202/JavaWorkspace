package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List list = new ArrayList<>();
	// ArrayList 객체 생성
	
	public int addList(Music music) {
	// 마지막 리스트에 객체 저장, 1 리턴
		try {
		list.add(music);
		
		return 1;
		
		}catch(Exception e) {
			return 0;
		}
		
	}
	
	public int addAtZero(Music music) {
	// 첫 번째 리스트에 객체 저장, 1 리턴
		
		list.add(0, music);// 효율 안좋음
		
		return 1;
	}
	
	public List printAll() {
		// List 반환
		return list;
	}
	
	public Music searchMusic(String title) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		Music m = null;
		
		for(Object o : list) {
			Music m2 = (Music) o;
			if(m2.getTitle().equals(title)){
				m = m2;
				break;
			}
		}
		// 객체 검색, 찾으면 해당객체의 정보를 m에 대입
		return m;
	}
	
	public Music removeMusic(String title) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		Music m = null;
		for(int i =0; i< list.size(); i++) {
			Music m2 = (Music)list.get(i);
			if(m2.getTitle().equals(title)) {
				m = m2;
				//list.remove(m2);
				list.remove(i);
				break;
			}
		}
		return m;
	}
	
	public Music setMusic(String title, Music music) {
	// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		Music m = null;
		
		for(int i =0; i< list.size(); i++) {
			Music m2 =(Music)list.get(i);
			if(m2.getTitle().equals(title)) {
				m = m2;
				list.set(i, music);
				break;
			}
		}
		return m;
		
	}
	
	public int ascTitle() {
	// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		Collections.sort(list, new AscTitle());
		return 1;
	}
	
	public int descSinger() {
	// 리스트 가수 명 내림차순 정렬, 1 리턴
		Collections.sort(list);
		return 1;
	}
	}