package studio8;

import java.util.LinkedList;

public class Calendar {

	private LinkedList<Appointment> calendar = new LinkedList<Appointment>();
	
	public Calendar() {
		
	}
	
	public void addAppointment(Appointment appt) {
		calendar.add(appt);
	}
	
	public void removeAppointment(Appointment appt) {
		calendar.remove(appt);
	}
	
	
	
	public static void main(String[] args) {
		Date cBday = new Date(11,17,2003,false);
		Time tBday = new Time(9, 45, false);
		Appointment bDay = new Appointment(cBday, tBday);
		Calendar bday = new Calendar();
		bday.addAppointment(bDay);
		System.out.println(bday);

	}

}
