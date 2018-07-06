package ex01;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public int getHour() { return this.hour; }
	public int getMinute() { return this.minute; }
	public int getSecond() { return this.second; }
	
	public void setHour(int h) {
		this.hour = h % 24;
	}
	public void setMinute(int m) {
		this.minute = m % 60;
		this.hour += m / 60;
	}
	public void setSecond(int s) {
		this.second = s % 60;
		this.minute += s / 60;
	}
	
	public String toString() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}
}
