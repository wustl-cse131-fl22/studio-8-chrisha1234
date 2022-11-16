package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is12;
	
	public Time(int hour, int minute, boolean is12) {
		this.hour = hour;
		this.minute = minute;
		this.is12 = is12;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}


	public static void main(String[] args) {
		Time tbday = new Time(9, 45, false);
    	
    }

}