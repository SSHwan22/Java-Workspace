package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public HashMap mapTest() {
		return map;
		
	}
	
	public boolean joinMembership(String id, Member m) {
		if(map.get(id) == null) {
			map.put(id, m);
			return true;
		}
			return false;
		
//		boolean bool = false;
//		if(!(map.containsKey(id))) {
//			map.put(id, m);
//			bool = true;
//		}else {
//			bool = false;
//		}
//		return bool;
	}
	
	public String login(String id, String password) {
		String str = null;
		
		if(map.get(id) != null && map.get(id).getPassword().equals(password)) {
			str = map.get(id).getName();
		}
		
//		if(map.containsKey(id)) {
//			if(map.get(id).getPassword().equals(password)) {
//				str = map.get(id).getName();
//			} else {
//				str = null;
//			}
//		}
		return str;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
		
//		boolean bool = false;
//		if(map.containsKey(id)) {
//			if(map.get(id).getPassword().equals(oldPw)) {
//				map.get(id).setPassword(newPw);
//				bool = true;
//			}
//		}
//		return bool;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
		
//		if(map.containsKey(id)) {
//			map.get(id).setName(newName);
//		}
	}
	
	public TreeMap sameName(String name) {
		Set<String> set = map.keySet();
		TreeMap<String, String> tree = new TreeMap();
		
		for(String key : set) {
			if(map.get(key).getName().equals(name)) {
				tree.put(key, name);
			}
		}
		
//		Iterator<String> SetIt = set.iterator();
//		while(SetIt.hasNext()) {
//			String key = SetIt.next();
//			if(map.get(key).getName().equals(name)) {
//				tree.put(key, name);
//			}
//		}
		
		return tree;
	}
}
