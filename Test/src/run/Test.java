package run;

public class Test {

	public static void main(String[] args) {
		
		int[] origin = {10, 20, 30, 40};
		int[] copy = origin;
		System.out.println("origin 배열 : "+origin[0] +" "+ origin[1] +" "+ origin[2] +" "+ origin[3]);
		System.out.println("copy 배열   : "+copy[0] +" "+ copy[1] +" "+ copy[2] +" "+ copy[3]);
		
		System.out.println("origin의 주소값        : "+origin);
		System.out.println("origin의 주소값(10진수) : "+origin.hashCode());
		
		System.out.println("copy의 주소값          : "+copy);
		System.out.println("copy의 주소값(10진수)   : "+copy.hashCode());
		
		copy[2] = 99;
		System.out.println("origin 배열 : "+origin[0] +" "+ origin[1] +" "+ origin[2] +" "+ origin[3]);
		System.out.println("copy 배열   : "+copy[0] +" "+ copy[1] +" "+ copy[2] +" "+ copy[3]);
	}
}
