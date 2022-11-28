package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];

	public int existMemberNum() {
		int count = 0;
		for(Member member : m) {
			if(member != null) {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {
		for(Member member : m ) {
			if(member != null && member.getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i =0; i<SIZE; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}

	public String searchId(String id) {
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				return member.toString();
			}
		}
		return "";
	}

	public Member[] searchName(String name) {
		Member[] members = new Member[SIZE];
		int index = 0;
		for(Member member : m) {
			if(member != null && member.getName().equals(name)) {
				members[index++] = member;
			}
		}
		return members;
	}

	public Member[] searchEmail(String email) {
		Member[] members = new Member[SIZE];
		int index = 0;
		for(Member member : m) {
			if(member != null && member.getEmail().equals(email)) {
				members[index++] = member;
			}
		}
		return members;
	}

	public boolean updatePassword(String id, String password) {
		boolean result = false;
		for (Member member  : m) {
			if(member != null && member.getId().equals(id)) {
				member.setPassword(password);
				result = true;
			}
		}
		return result;
	}

	public boolean updateName(String id, String name) {
		boolean result = false;
		for (Member member  : m) {
			if(member != null && member.getId().equals(id)) {
				member.setName(name);
				result = true;
			}
		}
		return result;
	}

	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for (Member member  : m) {
			if(member != null && member.getId().equals(id)) {
				member.setEmail(email);
				result = true;
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean result = false;
		for(int i =0; i< SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}
	
	public void delete() {
		m = new Member[SIZE];
	}

	public Member[] printAll() {
		return m;
	}

}
