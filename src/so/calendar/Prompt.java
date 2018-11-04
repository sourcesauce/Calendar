/* 작성자:소상훈
 * 완성일:2018-11-05
 * 목적:JAVA기초 공부
 * 설명:프롬프트를 이용한 간단한 일정 저장 프로그램
 * MAIN클래스
 * 
*/package so.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {

//	@param week 요일명
//	@return 0~6(0=Sunday,6=Saturday)
	public int parseDay(String week) {
		switch (week) {
		case "su":
			return 0;
		case "mo":
			return 1;
		case "tu":
			return 2;
		case "we":
			return 3;
		case "th":
			return 4;
		case "fr":
			return 5;
		case "sa":
			return 6;
		default:
			return 0;
		}
	}

	/*
	 * 종류:프롬프트를 실행하는 메서드 내용:메뉴를 프롬프트에 띄우고 명령을 입력받는다
	 */ public void runPrompt() throws ParseException {
		printMenu();
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		boolean isLoop = true;

		while (isLoop) {
			System.out.println("명령( 1, 2, 3, h, q)");
			String cmd = scanner.next();

			switch (cmd) {
			case "1":
				cmdRegister(scanner, cal);
				break;
			case "2":
				cmdSerch(scanner, cal);
				break;
			case "3":
				cmdCal(scanner, cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				isLoop = false;
				break;
			}
		}

	}

	/*
	 * 종류:메뉴표시 내용:메뉴표시
	 */
	private void printMenu() {
		System.out.println("+---------------------------------+");
		System.out.println("|1. 일정 등록");
		System.out.println("|2. 일정 검색");
		System.out.println("|3. 달력 보기");
		System.out.println("|h. 도움말 q. 종료");
		System.out.println("+---------------------------------+");
	}

	/*
	 * 종류:연도,월 입력받는 메서드 내용:연도,월을 키보드로 입력받아 Calendar.printCalendar를 호출
	 */ private void cmdCal(Scanner s, Calendar c) {
		int month, year = 0;

		System.out.println("연도를 입력하세요.");
		System.out.print("YEAR> ");
		year = s.nextInt();

		System.out.println("달을 입력하세요.");
		System.out.print("MONTH> ");
		month = s.nextInt();

		if (month > 12 || month < 1) {
			System.err.println("잘못된 입력입니다.");
			return;
		}

		c.printCalendar(year, month);
	}

	/*
	 * 종류:일정 등록 내용:날짜를 입력받고 그 날짜에 일정을 입력하여 ;이 나올때까지의 내용을 보내어 Calendar.registerPlan호출
	 */
	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("[새 일정 등록]");

		System.out.println("날짜를 입력해 주세요 (yyyy-mm-dd)");
		String date = s.next();
		String text = "";
		System.out.println("일정을 입력해 주세요.(문장 끝에; 입력해 주세요)");
		while (true) {
			String word = s.next();
			text += word + " ";
			if (word.endsWith(";")) {
				break;
			}
		}
		c.registerPlan(date, text);
	}

	/*
	 * 종류:일정검색 내용:날짜를 입력받아 Calendar.serchPlan을 호출
	 */
	private void cmdSerch(Scanner s, Calendar c) {
		System.out.println("[일정 검색]");

		System.out.println("날짜를 입력해 주세요 (yyyy-mm-dd)");
		String date = s.next();
		PlanItem plan;
		plan = c.serchPlan(date);
		if (plan != null) {
			System.out.println(plan.detail);
		} else {
			System.out.println("일정이 없습니다");
		}
	}

	public static void main(String[] args) throws ParseException {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		System.out.println("Thank you. BYE");
	}
}
