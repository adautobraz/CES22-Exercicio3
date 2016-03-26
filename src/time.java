
public class time {
	private int hour;
	private int minute;
	
	time(){};
	
	public void setTime(int aHour, int aMinute){
		this.hour = aHour;
		this.minute = aMinute;
	}
	
	public String getTime(){
		return hour+":"+minute;
	}
	
	public static void main(String arg[]){
		time t = new time();
		t.setTime(3, 25);
		System.out.println("The time now is" + t.getTime());		
	}
}
