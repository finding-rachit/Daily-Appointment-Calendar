# Daily-Appointment-Calendar
Outline of the program.

1.	Create a class Appointment. The class has instance variables date (of type Calendar) and description (of type String). Make an object of type GregorianCalendar in the constructor method and set date to point to it. Methods for class Appointment:
a.	A constructor method that takes a year, month, day, hour, minute and description parameters and sets the date and description instance variables. 
b.	Get and Set methods for the instance variables 
c.	A print method that returns a string containing the appointment time (hour and minute) and the appointment description.
d.	A method occursOn that takes a year, month, day, hour, minute as parameters and checks to determine if this appointment is on the same day and time. Returns true or false.
e.	Class Appointment should implement the Comparable interface. Should be able to compare two appointment object based on their calendar date.

2.	Create a custom JFrame for the program called AppointmentFrame. The frame should have 3 main panels (use border layout)
a.	Create a JLabel component and put it in the NORTH part of the frame.  This is where you will display the current date using the Calendar class and the SimpleDateFormat class. Create a calendar instance variable in class AppointmentFrame as well as a SimpleDateFormat instance variable. Create objects of Calendar and SimpleDateFormat in the constructor method of AppointmentFrame. See the CalendarTester example.  
b.	Create a reference instance variable called appointments that refers to an ArrayList of Appointment objects (see class Appointment below). Don’t forget to create the ArrayList object in the constructor method. This array list will hold all your appointment objects. 
c.	Create a JTextArea object and add it to the CENTER part of the frame. Make it scrollable. This is where the appointments for the current day will be displayed.
d.	Make a control panel (JPanel) object and add it to the SOUTH part of the frame. Details of the control panel are described below:
3.	Control Panel: the control panel should consist of 3 subpanels. See the figure above.
a.	The date subpanel has buttons “>” and “<”. When these buttons are pressed, the date should change to the next day or the previous day, respectively, and the appointments for that day printed. You’ll need to create JButton objects and create helper classes that implement the ActionListener interface, where the action perfomed methods update the current date and display it in the date JLabel. The date subpanel also contains 3 JTextFields, one for for entering the day, one for entering the month and one for year. The user types in the day, month, year and then presses the SHOW button to change (and display) the current date and appointments.
b.	An action subpanel contains JTextFields for entering the hour and minute of the appointment. If the user doesn’t enter a minute, assume 0 minutes. The hour is entered as a 24 hour clock (i.e. 0 to 23). Once the user has entered the hour and minute, they can press the CREATE button and a new appointment object is created (using the appointment description entered in the JTextArea of the description subpanel). Or they can press the CANCEL button to cancel an existing appointment for the current day at the time entered (if one exists). You will need to create helper classes that implement the ActionListener interface for the CREATE and CANCEL buttons.
c.	For some of your subpanels, you may want to use layouts like the Grid layout. Use nested panels to put your components into (buttons, labels etc) and add these panels to your subpanels. See the FontViewer program.

4.	Other suggested methods for class AppointmentFrame:
a.	printAppointments: uses the current day, month, year and goes through the arraylist of appointments. If one of the appointment objects occurs on the current day,month,year then print it in the main textArea
b.	findAppointment: is passed a year, month, day, hour and minute and goes through the list of appointments to find one that has the same date and time. If one is found, return it otherwise return null. Or return true/false instead.
c.	createAppointment: takes the current year, month, day, and the hour, minute entered by the user and checks to see if an appointment already exists at this time. If so, prints “CONFLICT!!” in the description textarea. If not, then creates a new appointment object, adds it to the appointments arraylist, sorts the arraylist and prints it.
d.	cancelAppointment: determines if an appointment exists for the current  day,month,year and entered hour, minute. If so, removes it from the appointments arraylist, sorts the arraylist and prints the arraylist.  
