package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	public boolean isHoliday;
	
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}



	public static void main(String[] args) {
		Date christmas = new Date(12,25,2022,true);
		Date cBday = new Date(11,17,2003,false);
		Date iBday = new Date(11,30,2003,false);
		Date bestDayEver = new Date(12,8,2022,false);
		Date halloween = new Date(10,31,2022,true);
		Date kindaChristmas= new Date(12,25,2022,false);
		System.out.println(christmas.equals(kindaChristmas));
		
		
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(christmas);
		list.add(cBday);
		list.add(iBday);
		list.add(bestDayEver);
		list.add(halloween);
		list.add(kindaChristmas);
		list.add(kindaChristmas);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(christmas);
		set.add(cBday);
		set.add(iBday);
		set.add(bestDayEver);
		set.add(halloween);
		set.add(kindaChristmas);
		set.add(kindaChristmas);
		System.out.println(set);
		
		
		
    }

}
