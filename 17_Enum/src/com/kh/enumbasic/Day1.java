package com.kh.enumbasic;

// 1) 기본 사용법
public enum Day1 {
	MONDAY, // static, final키워드를 붙이지 않았는데 자동으로 추가해줌.
	TUESEDAY,
	WENDSEDAY,
	THURSDAY,
	FRIDAY,
	SATURSDAY,
	SUNDAY
}

// 2) enum안에 각 상수요소마다 값을 더 추가시키고 싶은 경우
//	  비슷한 상수필드끼리 매칭시킬 때 사용함.
enum Day2{
	// 1) 각 요소마다 우측에 매칭 시킬 값을 추가함.
	MONDAY("MON"),
	TUESEDAY("TUE"),
	WENDSEDAY("WEN"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURSDAY("SAT"),
	SUNDAY("SUN");

	// 2) 매칭시킬 값의 자료형으로 필드 값 추가
	private final String shortName;

	// 3) 생성자 추가
	Day2(String shortName) {
		this.shortName = shortName;
	}
	
	// 4) geter메서드 작성
	public String shortName() {
		return shortName;
	}
}

// 매핑 시킬 값이 여러개인 경우
enum Day3{
	// 1) 각 요소마다 우측에 매칭 시킬 값을 추가함.
	MONDAY("MON",1),
	TUESEDAY("TUE",2),
	WENDSEDAY("WEN",3),
	THURSDAY("THU",4),
	FRIDAY("FRI",5),
	SATURSDAY("SAT",6),
	SUNDAY("SUN",7);

	// 2) 매칭시킬 값의 자료형으로 필드 값 추가
	private final String shortName;
	private final int day;
	
	// 3) 생성자 추가
	Day3(String shortName, int day) {
		this.shortName = shortName;
		this.day = day;
	}
	

	// 4) geter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	
	public static Day3 valueOfShortName(String shortName) {
		Day3 days[] = Day3.values();
		for(int i=0; i<days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
			}
		}
		return null;
	}
	
	public static Day3 valueOfDay(int day) {
		Day3 days[] = Day3.values();
		for(Day3 d : days) {
			if(d.day == day) {
				return d;
			}
		}
		return null;
	}
}

// 함수 추가.
enum Day4{
	// 1) 각 요소마다 우측에 매칭 시킬 값을 추가함.
	MONDAY("MON",1){
		// 함수추가 2단계) 추상메서드를 상수필드에서 오버라이딩
		@Override
		public void printDay() { System.out.println("월요일입니다.");}
	},
	TUESEDAY("TUE",2){
		@Override
		public void printDay() { System.out.println("화요일입니다.");}
	},
	WENDSEDAY("WEN",3){
		@Override
		public void printDay() { System.out.println("수요일입니다.");}
	},
	THURSDAY("THU",4){
		@Override
		public void printDay() { System.out.println("목요일입니다.");}
	},
	FRIDAY("FRI",5){
		@Override
		public void printDay() { System.out.println("금요일입니다.");}
	},
	SATURSDAY("SAT",6){
		@Override
		public void printDay() { System.out.println("토요일입니다.");}
	},
	SUNDAY("SUN",7){
		@Override
		public void printDay() { System.out.println("일요일입니다.");}
	};

	// 2) 매칭시킬 값의 자료형으로 필드 값 추가
	private final String shortName;
	private final int day;
	
	// 3) 생성자 추가
	Day4(String shortName, int day) {
		this.shortName = shortName;
		this.day = day;
	}
	

	// 4) geter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	
	public static Day4 valueOfShortName(String shortName) {
		Day4 days[] = Day4.values();
		for(int i=0; i<days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
			}
		}
		return null;
	}
	
	public static Day4 valueOfDay(int day) {
		Day4 days[] = Day4.values();
		for(Day4 d : days) {
			if(d.day == day) {
				return d;
			}
		}
		return null;
	}
	
	public abstract void printDay(); //권장
	
	public void printDay1() {
		switch (this) {
		
		case MONDAY: System.out.println("월요일입니다."); break;
		case TUESEDAY: System.out.println("화요일입니다."); break;
		case WENDSEDAY: System.out.println("수요일입니다."); break;
		case THURSDAY: System.out.println("목요일입니다."); break;
		case FRIDAY: System.out.println("금요일입니다."); break;
		case SATURSDAY: System.out.println("토요일입니다."); break;
		case SUNDAY: System.out.println("일요일입니다."); break;

		}
	}
	
}