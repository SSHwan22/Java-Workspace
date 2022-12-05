package com.kh.chap02_set.part01_hashSet.model.vo;


public class Student {
	private String name; //이름
	private int age;	 //나이
	private int score;	 //점수
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		// Student객체.equals(비교할 Student)
//		// 	  this				other
//		// this => 현재 객체
//		Student other = (Student) obj;
//		if(this.age == other.age && this.score == other.score && this.name.equals(other.name)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	// hashCode 메서드 재정의 : 필드값을 가지고 해시코드를 만들어서 반환하도록 재정의
//	@Override
//	public int hashCode() {
//		String hash = name+age+score;
//		return hash.hashCode();
//		
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
}
