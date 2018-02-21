import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.awt.BorderLayout;

public class FrameTest
{

	public static void main (String[] args)
	{
		
		JFrame frame = new JFrame();
		
		JPanel panelOne = new JPanel();
		// JPanel panelTwo = new JPanel();
		// JPanel panelThree = new JPanel();
		
		JButton textOne = new JButton("TEXT");
		JScrollPane scroll = new JScrollPane (textOne, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JLabel label = new JLabel("This label shows the date");
		
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
