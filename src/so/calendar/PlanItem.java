package so.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
	public Date planDate;
	public String detail;
	public String peoples = null;

	public static Date getDateFromString(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-mm-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public PlanItem(String date, String detail) {
		this.planDate = getDateFromString(date);
		this.detail = detail;
	}

	public void addPeople(String name) {
		peoples += name + ",";
	}

	public Date getDate() {
		return planDate;
	}
}