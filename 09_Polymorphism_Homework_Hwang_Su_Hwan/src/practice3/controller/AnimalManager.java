package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] a = new Animal[5];
			a[0] = new Dog("시바견", "시바견", 60);
			a[1] = new Dog("멍멍이", "말티즈", 60);
			a[2] = new Dog("주인님", "사향", 60);
			a[3] = new Dog("네발", "스핑크스", 60);
			a[4] = new Dog("찹쌀", "말라뮤트", 60);
		
		
		for(int i=0; i<a.length; i++) {
			a[i].speak();
		}
	}

}
