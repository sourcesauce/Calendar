package so.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month,year = 0;
		while (true) {
			
			System.out.println("연도를 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			
			System.out.println("달을 입력하세요.(-1입력시 종료)");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year,month);
		}
		System.out.println("BYE");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}
}
