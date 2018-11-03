package so.calendar;

import java.util.Scanner;

public class Prompt {

	/*
	 * @param week 요일명
	 * 
	 * @return 0~6(0=Sunday,6=Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su"))
			return 0;
		else if (week.equals("mo"))
			return 1;
		else if (week.equals("tu"))
			return 2;
		else if (week.equals("we"))
			return 3;
		else if (week.equals("th"))
			return 4;
		else if (week.equals("fr"))
			return 5;
		else if (week.equals("sa"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month, year, weekday = 0;

		while (true) {

			System.out.println("연도를 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year==-1) {
				break;
			}
			
			System.out.println("달을 입력하세요.(-1입력시 종료)");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month > 12 || month<1) {
				System.err.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.println("첫째날의 요일을 입력하세요(su,mo,tu,we,th,fr,sa)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);

			
			
			cal.printCalendar(year, month, weekday);
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
