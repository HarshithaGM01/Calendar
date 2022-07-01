package admin;
import java.util.*;

public class New {

	public static void main(String[] args) {
	   int date, year, sum, step1, monthcode, yearcode,lvalue;
	   String month,weekcode;
	   
	   Scanner sc = new Scanner (System.in);
	   Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter date in dd format :");
		date = sc.nextInt();
		System.out.println("Please enter month in mmm format:");
		month = input1.nextLine();
		System.out.println("Please enter year in yyyy format :");
		year = sc.nextInt();
		sc.close();
	input1.close();
			int div=year;
			int quo=div/10;
			int value1=div%10;
			int value2=(quo%10)*10 + value1;		
		step1=value2/4;
		//System.out.println("Value2 is:"+value2);
	monthcode=tocallmcode(month);
	//System.out.println("Monthcode: " +monthcode);
	yearcode=tocallycode(year);
		//System.out.println("Yearcode:"+yearcode);
			
		 sum = date+value2+monthcode+yearcode+step1;
			lvalue=sum%7;
	weekcode=tocallwcode(lvalue);
	System.out.println("Day: "+weekcode);
}

	private static String tocallwcode(int lvalue) {
		String weekcode=null;
		switch (lvalue) {
		case (0):
			weekcode="Sunday";
		break;
		case(1):
			weekcode="Monday";
		break;
		case(2):
			weekcode="Tuesday";
		break;
		case(3):
			weekcode="Wednesday";
		break;
		case(4):
			weekcode="Thursday";
		break;
		case(5):
			weekcode = "Friday";
		break;
		case(6):
			weekcode="Saturday";
		break;
		}
		return weekcode;
	}

	private static int tocallycode(int year) {
		int yearcode = 0;
		if(year>=1800&&year<=1899)
		{
			yearcode = 2; 
		}
		else if(year>=1900&&year<=1999)
		{
		yearcode = 0; 
		
		}
		else if(year>=2000&&year<=2999)
		{
			yearcode=6;
		}
		else {
			yearcode=0;
		}
		return yearcode;
	}

	private static int tocallmcode(String month) {
		int monthcode=0;
		switch (month) {
		case ("Jan"):
		case("Oct"):
			monthcode=0;
		     break;
		case ("Feb"):
		case("Mar"):
		case ("Nov"):
			monthcode=3;
		     break;
		case("Apr"):
		case("Jul"):
			monthcode=6;
		    break;
		case("Jun"):
			monthcode=4;
		     break;
		case("Aug"):
			monthcode=2;
				break;
			case("Sep"):
			case("Dec"):
			monthcode=5;
		break;
			case("May"):
				monthcode=1;
			break;
		 }
		return monthcode;
	}
}