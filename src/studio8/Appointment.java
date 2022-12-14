package studio8;

import java.util.Objects;


public class Appointment {

	private Date date;
	private Time time;
	
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}


	public static void main(String[] args) {
		Date cBday = new Date(11,17,2003,false);
		Time tBday = new Time(9, 45, false);
		Appointment bDay = new Appointment(cBday, tBday);

	}

}
