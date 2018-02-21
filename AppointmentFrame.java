import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.awt.BorderLayout;

public class AppointmentFrame 
{
	private Calendar calendar;
	private SimpleDateFormat time = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public AppointmentFrame(Calendar calendar, SimpleDateFormat time, Appointment appointments)
	{
		this.calendar = calendar;
		this.time = time;
		this.appointments.add(appointments);
		
		JFrame frame = new JFrame();
		
		JPanel panelOne = new JPanel();
		// JPanel panelTwo = new JPanel();
		// JPanel panelThree = new JPanel();
		
		JTextArea textOne = new JTextArea("TEXT");
		
		JScrollPane scroll = new JScrollPane (textOne, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JLabel label = new JLabel(time.format(calendar.getTime()));
		
		panelOne.setLayout(new BorderLayout());
		// panelTwo.setLayout(new BorderLayout());
		// panelThree.setLayout(new BorderLayout());

		
		
		panelOne.add(label, BorderLayout.NORTH);
		panelOne.add(textOne, BorderLayout.CENTER);
		panelOne.add(scroll);
		
		frame.add(panelOne);
		
		frame.setSize(800,800);
		frame.setTitle("Appointments");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
