package exam.ch05;

import java.util.Calendar;

public class EnumWeekEx {
	public static void main(String[] args) {
		Week today = null;
		Calendar myCal = Calendar.getInstance();
		int week = myCal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = today.Sunday;			
			break;
		case 2:
			today = today.Monday;			
			break;
		case 3:
			today = today.Tuesday;			
			break;
		case 4:
			today = today.Wednesday;			
			break;
		case 5:
			today = today.Thursday;			
			break;
		case 6:
			today = today.Friday;			
			break;
		case 7:
			today = today.Saturday;			
			break;
		

		default:
			break;
		}
		System.out.println("오늘은 "+today);
		
		if(today.equals(today.Sunday) || today.equals(today.Saturday)){
			System.out.println("주말이다!");
		}
		else
			System.out.println("출근이다!");
	}
}
