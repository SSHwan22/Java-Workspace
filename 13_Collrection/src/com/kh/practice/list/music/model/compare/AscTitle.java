package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator{
	public int compare(Object o1, Object o2) {
		Music m1 = (Music) o1;
		Music m2 = (Music) o2; 
		
		return m2.getSinger().compareTo(m1.getSinger());
	}
}
