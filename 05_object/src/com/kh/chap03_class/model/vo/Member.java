package com.kh.chap03_class.model.vo;

public class Member {
	private String memberId;// - memberId : String
	private String memberPwd;
	private String memberName="왕우완";
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// + changeName(name:String):void
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}
}

