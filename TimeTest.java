import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TimeTest {
	public static void main(String[] args) {
		String dateOfBirthString = "01/05/2017";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, dateTimeFormatter);
		
		System.out.println(dateOfBirth.toString());
		
		String out = dateOfBirth.format(dateTimeFormatter);
		System.out.println(out);
		
		String startDate="09/04/1989";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
		java.util.Date date = null;
		try {
			date = sdf1.parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		
		System.out.println(sqlStartDate.toString());
	}
}