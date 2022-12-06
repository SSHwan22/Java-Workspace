package run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date date = new Date(2021 - 1900, 2 - 1, 15, 11, 30, 50);
		System.out.println("매개변수 생성자 : "+date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String formatDate = sdf.format(date);
		System.out.println(formatDate);

	}
}
