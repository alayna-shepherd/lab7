package co.grandcircus;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scName = new Scanner(System.in);
		Scanner scEmail = new Scanner(System.in);
		Scanner scPhone = new Scanner(System.in);
		Scanner scDate = new Scanner(System.in);

	}
	//email
	
	
	public static String testName(Scanner scName) {
		System.out.print("please enter a valid email");
		String s = scName.next(); // read user entry
		scName.nextLine(); // discard any other data entered on the line
		Pattern p = Pattern.compile("\\b[A-Z]{1}");
		Matcher m = p.matcher(s);
		boolean test = m.matches();
		scName.close();
		if (test == false) {
			return "Sorry, name is not valid!";
		} else

			return "name is valid!";
	}
	
	public static String testEmail(Scanner scEmail) {
		System.out.print("please enter a valid email");
		String s = scEmail.next(); // read user entry
		scEmail.nextLine(); // discard any other data entered on the line
		Pattern p = Pattern.compile("\\b[\\w.!#$%&’*+\\/=?^`{|}~-]+@[\\w-]+(?:\\.[\\w-]+)*\\b");
		Matcher m = p.matcher(s);
		boolean test = m.matches();
		scEmail.close();
		if (test == false) {
			return "Sorry, email is not valid!";
		} else

			return "email is valid!";
	}
	
	
	
	
	
	public static String testNumber(Scanner scPhone) {
		System.out.print("please enter a valid phone number");
		String s = scPhone.next(); // read user entry
		scPhone.nextLine(); // discard any other data entered on the line
		Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher m = p.matcher(s);
		boolean test = m.matches();
		scPhone.close();
		if (test == false) {
			return "Sorry, phone is not valid!";
		} else

			return "Phone is valid!";
	}
	//date
	public static String testDate(Scanner scDate) {
		System.out.print("please enter a valid date (mm/dd/yy) ");
		String s = scDate.next(); // read user entry
		scDate.nextLine(); // discard any other data entered on the line
		Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
		Matcher m = p.matcher(s);
		boolean test = m.matches();
		scDate.close();
		if (test == false) {
			return "Sorry, date is not valid!";
		} else

			return "date is valid!";
	}
	
	
	
	
//		Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
//		Matcher m = p.matcher("248-403-6522");
//		boolean test =m.matches();
//		System.out.println(test);

}
