package day8_5;

class Time {
	private int hour, minute, second;
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if (hour <0 || hour >23) return;
		this.hour= hour;						//get set
	}
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if (minute < 0 || minute >59) return;
		this.minute = minute;
	}
	public int getsecond() {return second;}
	public void setSecond(int second) {
		if (second < 0 || second >59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	//자동생성 방법 - 소스 -> generate geter seter
	
}
