package OOP_Train_YM;

public class UserInfo  {
	private String user_id;
	private String password;
	private String notification;
	private Payment p = null;
	private Event e = null; 
	/*separate the whole dependency out of a class, user class
	 does not know what event it's going to hold, if the get event changes,
	 user class do not have to modify the code, it just get the event.
	 The relationship between user and event is not owned by user class.*/
	private int user_event_id = 0;
	public UserInfo(String name, String pw) {
		user_id = name;
		password = pw;
	}
	
	public boolean checkPw(String name, String pw) {
		if(this.password.equals(pw) && this.user_id.equals(name)) {
			return true;
		}
		return false;
	}
	
	public String get_user_id() {
		return this.user_id;
	}
	
	public void set_user_event(Event e) { //inject the event object into user
		this.e = e;
		user_event_id = this.e.get_id();
	}
	
	public String get_user_event() {
		return this.e.get_event();
	}
	
	public void set_user_payment(Payment p) {
		this.p = p;
	}
	
	public String get_user_payment() {
		return this.p.get_payment();
	}
	
	public void set_user_notif(String method) {
		notification = method;
	}
	public String get_notif_method() {
		return notification;
	}
	
	public int get_user_event_id() {
		return this.user_event_id;
	}
	
	

}
