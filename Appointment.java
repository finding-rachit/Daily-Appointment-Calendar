import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Appointment implements Comparable<Appointment>
{
	private Calendar date;
	private String description; 
	
	public Appointment(int year, int month, int day, int hour, int minute, String description, Calendar date)
	{
		this.date = new GregorianCalendar(year, month, day, hour, minute);
		this.description = description;
	}
	// Gets the description
	public String getDescription()
	{
		return this.description;
	}
	// Gets the date
	public Calendar getDate()
	{
		return this.date;
	}
	// Sets the description
	public void setDescription(String d)
	{
		this.description = d;
	}
	// Sets the date
	public void setDate(Calendar x)
	{
		this.date = x;
	}
	// Prints the appointment time
	public String print ()
	{
		int hour       = getDate().get(Calendar.HOUR); // Get hour
		int minute     = getDate().get(Calendar.MINUTE); // Get minute
		return ("Appointment time: " + hour + minute + getDescription());
	}
	// Checks if the date is correct or not
	public Boolean occursOn(int year, int month, int day, int hour, int minute)
	{
		Calendar newDate = new GregorianCalendar(year,month,day,hour,minute);
		
		if (newDate.compareTo(this.date) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public int compareTo(Appointment other) {
		if (other.getDate() == this.getDate())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
