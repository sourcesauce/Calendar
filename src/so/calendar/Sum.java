/* 작성자:소상훈
 * 완성일:2018-11-05
 * 목적:SUM테스트를 위한 클래스
 * MAIN과 연관 없음
 * 
*/
package so.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a, b;
		String s1, s2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하시오 : ");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + ", " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		System.out.println("두 수의 합은? " + (a + b) + "입니다");
		scanner.close();
	}

}
