/* 작성자:소상훈
 * 완성일:2018-11-05
 * 목적:파일을 저장하고 읽고 날짜나 일정을 처리하는 클래스
 * 
 * 
*/

package so.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {

	public Date planDate;
	public String detail;
	public String peoples = null;

	public PlanItem(String date, String detail) {
		this.planDate = getDateFromString(date);
		this.detail = detail;
	}

	public static Date getDateFromString(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public void addPeople(String name) {
		peoples += name + ",";
	}

	public Date getDate() {
		return planDate;
	}

	public String saveString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		String sdate = formatter.format(planDate);
		return sdate + "," + "\"" + detail + "\"" + "\n";
	}
}
