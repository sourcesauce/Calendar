package so.calendar;

import java.util.Scanner;

public class Calendar {

	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("-----------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복 횟수를 입력하세요.");
		int repeat = scanner.nextInt();

		for (int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();

			System.out.println(month + "월 은 " + cal.getMaxDaysOfMonth(month) + "일 까지 있습니다.");
		}
		System.out.println("BYE");
		scanner.close();
		// cal.printSampleCalendar();
	}

}
