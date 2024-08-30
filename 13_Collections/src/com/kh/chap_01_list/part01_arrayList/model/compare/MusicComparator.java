package com.kh.chap_01_list.part01_arrayList.model.compare;

import java.util.Comparator;

import com.kh.chap_01_list.part01_arrayList.model.vo.Music;

public class MusicComparator implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		// o1 vs o2 => 오름차순 정렬
		// o2 vs o1 => 내림차순 정렬
		return o1.getTitle().compareTo(o2.getTitle());
		
		
		
	
	}
	

}
