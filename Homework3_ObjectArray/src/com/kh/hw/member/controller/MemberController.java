package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	int index;
	{
		m[0] = new Member("aaaaa", "민경민", "aa", "aaa@aaa.aaa", 'M', 33);
		m[1] = new Member("bbbbb", "강고결", "bb", "bbb@bbb.bbb", 'M', 34);
		m[2] = new Member("ccccc", "남고결", "cc", "ccc@ccc.ccc", 'M', 28);
		m[3] = new Member("ddddd", "도대담", "dd", "ddd@ddd.ddd", 'M', 35);
		m[4] = new Member("eeeee", "류라라", "ee", "eee@eee.eee", 'F', 17);
		m[5] = new Member("fffff", "문미미", "ff", "fff@fff.fff", 'F', 20);
		m[6] = new Member("ggggg", "박보배", "gg", "ggg@ggg.ggg", 'M', 26);
		m[7] = new Member("hhhhh", "송성실", "hh", "hhh@hhh.hhh", 'M', 41);
		m[8] = new Member("iiiii", "윤예의", "ii", "iii@iii.iii", 'F', 28);
		m[9] = new Member("jjjjj", "정재주", "jj", "jjj@jjj.jjj", 'M', 23);
	}
	public int exsitMemberNum() {
		return index;
	}

	public boolean checkId(String inputId) {
		boolean check = true;
		for (int i = 0; i < index+1; i++) {
			for(int j=0; j<i; j++) {
				if (m[j].getId().equals(inputId)) {
					check = false;
					break;
				}else {
					check = true;
				}
		}
		}
		return check;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[index++] = new Member(id, name, password, email, gender, age);
		System.out.println(index);
	}

	
	public String searchId(String id) {
		String result = "";
		for(int i=0;i<SIZE;i++) {
			if(m[i].getId().equals(id)) {
				result = m[i].inform();
				break;
			}else {
				result = null;
			}
		}
		return result;
	}
	
	public Member[] searchName(String  name) {
		return m;
	}
	
	
	public Member[] searchEmail(String email) {
		return m;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean check = false;
		for(int i=0;i<SIZE;i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				check = true;
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	public boolean updateName(String id, String name) {
		boolean check = false;
		for(int i=0;i<SIZE;i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				check = true;
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean check = false;
		for(int i=0;i<SIZE;i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				check = true;
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	public boolean delete(String id) {
		boolean check = false;
		for(int i=0;i<SIZE;i++) {
			if(m[i].getId().equals(id)) {
				check = true;
				m[i] = null;
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	public void delete() {//전체
		for(int i=0;i<SIZE;i++) {
		m[i]=null;
		index--;
		}
	}
	
	public Member[] printAll() {
		index = 0;
		return m;
	}
}
