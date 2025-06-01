package OOP_Train_YM;

public class Event {
	private String name;
	private String date;
	private String location;
	private int price;
	private int id;
	
	public Event(String name, String date, String location,
					int price, int id) {
		this.name = name;
		this.date = date;
		this.location = location;
		this.price = price;
		this.id = id;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_event() {
		
		return "Event name: " + this.name + "| Date: " + this.date 
	        + "| Location: " + this.location + "| Price: " + this.price + "| ID: " + this.id;
	}

}
