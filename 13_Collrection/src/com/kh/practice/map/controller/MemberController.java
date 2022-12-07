package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		boolean bool = false;
		if(!(map.containsKey(id))) {
			map.put(id, m);
			bool = true;
		}else {
			bool = false;
		}
		return bool;
	}
	
	public String login(String id, String password) {
		String str = null;
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				str = map.get(id).getName();
			} else {
				str = null;
			}
		}
		return str;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		boolean bool = false;
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				bool = true;
			}
		}
		return bool;
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	}
	public TreeMap sameName(String name) {
		TreeMap<String, String> tree = new TreeMap<String, String>();
		Set<String> set = map.keySet();
		Iterator<String> setIt = set.iterator();
		
		while(setIt.hasNext()) {
			if(map.containsValue(name)) {
				String key = setIt.next();
				tree.put(key, name);
			}
		}
		return tree;
	}
}
