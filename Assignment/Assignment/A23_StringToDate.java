package Assignment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class A23_StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
	String str="12-04-1999";
	System.out.println(date.parse(str));;

	}

}
