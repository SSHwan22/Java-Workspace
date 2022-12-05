package com.kh.chap03_Map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import com.kh.chap03_Map.part01_hashMap.model.vo.Snack;


public class Run {

	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<>();
		
		/*
		 * 계층구조를 보면 List나 Set 계열은 Collection을 구현한 클래스 => 데이터를 추출할 때 add메서드
		 * 단, Map은 아니다 => 데이터를 추가할 때 put메서드 사용(key+value 세트로 추가)
		 * 
		 */
		
		// 1. put(K key, V value) => map 공간에 key + value세트로 추가해주는 메서드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 900));
		hm.put("포카칩", new Snack("짠맛", 1000));
		hm.put("포테이토칩", new Snack("짠맛", 1000));
		
		System.out.println(hm);
		// 1. 저장순서 유지 X
		// 2. value값이 동일하다고해도, key값이 중복되지 않기때문에 잘 저장됨.
		
		hm.put("포카칩", new Snack("매운맛", 1200));
		// 중복된 key값이 value값으로 덮어씌우기됨.
		System.out.println(hm);
		
		// 2. get(Object key) : V = 컬렉션에서 해당 키값의 value값을 돌려주는 메서드
		System.out.println(hm.get("다이제"));
		
		Snack s = hm.get("칸초"); //제네릭설정을 해놨기 때문에 Snack타입 객체로 강제형변환 하는 과정이 생략되었다.
		System.out.println(s);
		
		// 3. size() => 컬렉션에 담겨있는 갯수
		System.out.println(hm.size());
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 key값을 찾아내서 새로 전달된 value로 변경해주는 메서드
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1500));
		System.out.println(hm);
		
		// 5. remove(Object key) => 컬렉션에 해당 key값을 찾아서 key+ value값 동시에 지워주는 메서드.
		hm.remove("포테이토칩");
		System.out.println(hm);
		System.out.println("======================================================================================");
		
		// 순차적으로 HashMap 안에 담겨있는 값에 접근하고자 할 때?
		// for문 사용 불가(향상된 for문도 사용불가)
		// List와 Map은 다른 계열이기 때문에 ArrayList에 담은 후 출력 불가.
		// ArrayList list = new ArrayList(hm); <- 사용불가
		
		// iterator()는 List와 Set계열에서만 쓰는 메서드이기때문에 바로 사용 불가.
		// Iterator it = hm.Iterator(); <- 사용 불가
		
		// Map을 Set로 변경해주는 메서드가 있음.
		// HashMap => Set계열로 바꿔서 => Iterator호출
		
		// 1. keySet() 이용하는 방법
		// 1) hm에 있는 key값들만 set에 담기.
		
		Set<String> keySet = hm.keySet();
		System.out.println(keySet);
		
		// 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 3) 반복자에 담긴 값들을 순차적으로 뽑기
		while (itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			System.out.println("key : "+ key);
			System.out.println("value : "+ value);
		}
		
		System.out.println("======================================================================================");
		
		// 2. entrySet()이용하는 방법.
		
		// 1) hm에 있는 key+ value값 모두 (Entry) set에 담기 (Entry : 집합형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet에 있는 것들을 Iterator에 담기.
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복자를 이용해서 순차적으로 값을 뽑기.
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
	}
}
