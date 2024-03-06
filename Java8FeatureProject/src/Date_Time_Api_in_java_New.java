import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time_Api_in_java_New {
	
	static void localDateTimeApi() {
		LocalDate date=LocalDate.now();
		
		System.out.println("Today's date is "+date);
		
		LocalTime time=LocalTime.now();
		System.out.println("Today's time is "+time);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Corrent date and time is "+dt);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		
		String formatedDateTime=current.format(format);
		
		System.out.println("Current formated date and time is "+formatedDateTime);
		
	}
	
	public static void main(String[] args) {
		localDateTimeApi();
	}

}
