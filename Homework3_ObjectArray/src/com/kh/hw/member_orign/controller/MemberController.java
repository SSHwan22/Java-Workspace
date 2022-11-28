package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
<<<<<<< HEAD
	int index = 10;
=======
>>>>>>> 15151840caa9c832a719aac71ab573482bc4b1a9
	{
		m[0] = new Member("aaaaa", "민경민", "aa", "aaa@aaa.aaa", 'M', 33);
		m[0] = new Member("aaaaa", "박신우", "aa", "aaa@aaa.aaa", 'M', 33);
//		m[1] = new Member("bbbbb", "강고결", "bb", "bbb@bbb.bbb", 'M', 34);
		m[1] = new Member("bbbbb", "박신우", "bb", "bbb@bbb.bbb", 'M', 34);
		m[2] = new Member("ccccc", "남고결", "cc", "ccc@ccc.ccc", 'M', 28);
		m[3] = new Member("ddddd", "도대담", "dd", "ddd@ddd.ddd", 'M', 35);
		m[4] = new Member("eeeee", "류라라", "ee", "eee@eee.eee", 'F', 17);
//		m[5] = new Member("fffff", "문미미", "ff", "fff@fff.fff", 'F', 20);
		m[5] = new Member("fffff", "문미미", "ff", "aaa@aaa.aaa", 'F', 20);
//		m[6] = new Member("ggggg", "박보배", "gg", "ggg@ggg.ggg", 'M', 26);
		m[6] = new Member("ggggg", "박보배", "ㅎㅎ", "ggg@ggg.ggg", 'M', 26);
		m[7] = new Member("hhhhh", "송성실", "hh", "hhh@hhh.hhh", 'M', 41);
		m[8] = new Member("iiiii", "윤예의", "ii", "iii@iii.iii", 'F', 28);
//		m[9] = new Member("jjjjj", "정재주", "jj", "jjj@jjj.jjj", 'M', 23);
		m[9] = new Member("jjjjj", "박신우", "jj", "jjj@jjj.jjj", 'M', 23);
	}

	public int exsitMemberNum() {
		int count = 0;
		for (Member member : m) {
			if (member != null) {
				count++;
			}
		}

		return count;
	}

	public boolean checkId(String inputId) {
		for (Member member : m) {
			if (member != null && member.getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
					break;
				}
			}
//		for (Member member : m) {
//			if (member != null) {
//				member = new Member(id, name, password, email, gender, age);
//				break;
//			}
//
//		}
	}

	public String searchId(String id) {
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.inform();
				break;
			}
		}
		return "";
	}

	public Member[] searchName(String name) {
		Member[] members = new Member[SIZE];

		int index = 0;
		for (Member member : m) {
			if (members != null && member.getName().equals(name)) {
				members[index++] = member;
			}
		}
		return members;
	}

	public Member[] searchEmail(String email) {
		Member[] members = new Member[SIZE];

		int index = 0;
		for (Member member : m) {
			if (members != null && member.getName().equals(email)) {
				members[index++] = member;
			}
		}
		return members;
	}

	public boolean updatePassword(String id, String password) {
		boolean check = false;
		// for(int i=0;i<SIZE;i++) {
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setPassword(password);
				check = true;
				break;
			}
		}
		return check;
	}

	public boolean updateName(String id, String name) {
		boolean check = false;
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setName(name);
				check = true;
				break;
			}
		}
		return check;
	}

	public boolean updateEmail(String id, String email) {
		boolean check = false;
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setEmail(email);
				check = true;
				break;
			}
		}
		return check;
	}
<<<<<<< HEAD
	
	
	public boolean delete(String id) {
		boolean check = false;
		for(int i=0;i<SIZE;i++) {
			if(m[i].getId().equals(id)) {
				//m[i] = null; //이거하면 i에 해당한 숫자부터 배열 최대 인덱스 까지 다 날라간다.
				//m[i] = new Member();
=======

	public boolean delete(String id) {
		boolean check = false;
		for (int i=0; i< SIZE; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
>>>>>>> 15151840caa9c832a719aac71ab573482bc4b1a9
				check = true;
				break;
			}
		}
		index--;
		return check;
	}
<<<<<<< HEAD
	
	public void delete() {//전체
		for(int i=0;i<SIZE;i++) {
			m[i] = null;
			index = 0;
		}
=======

	public void delete() {// 전체
		m = new Member[SIZE];// m배열에 새로운 Member로 덮어씌우기
>>>>>>> 15151840caa9c832a719aac71ab573482bc4b1a9
	}

	public Member[] printAll() {
		return m;
	}
	
}
