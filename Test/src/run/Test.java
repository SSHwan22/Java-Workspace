package run;

public class Test {

	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i < 9; i++) {
				if (dan % 2 == 1) {
					break;
				}
				System.out.println(dan + " X " + i + " = " + dan * i);
			}
			System.out.println();
		}

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) { // 짝수일 경우
				continue; // 뒷쪽의 내용의 코드는 무시하고 다음 증감식으로 넘어감.
			}
			System.out.print(i + " ");
		}

	}
}
