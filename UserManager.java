package OOP_Train_YM;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
	
	private Set<String> user_name = new HashSet<String>();
	private Set <UserInfo> user_data = new HashSet<UserInfo>();
	public static Set<Event> event_data = new HashSet<Event>();
	
	public static void pre_login() {
		System.out.println("****PRE LOG-IN****");
		System.out.print("Type 1 for Register new account (username must be unique) ");
		System.out.println("| Type 2 for Log in:");
	}
	
	public static void set_event(String name, String date, String location,
			int price, int id) {
		Event e = new Event(name, date, location, price, id);
		event_data.add(e);
	}
	
	public static void view_event() {
		for(Event e: event_data) {
			System.out.println(e.get_event());
		}
	}
	
	public void register_user(String id, String pw) {
		UserInfo u = new UserInfo(id,pw);
		user_data.add(u);
		user_name.add(id);
	}
	
	public boolean check_user_id(String s) {
		if(user_name.contains(s)) {
			return true;
		}
		return false;
	}
	
	public boolean login_user(String id, String pw) {
		for(UserInfo u: user_data) {
			if(u.get_user_id().equals(id)) {
				return u.checkPw(id, pw);
			}
		}
		return false;
	}
	
	public void set_user_event(UserInfo u, int event_id) {
		for(Event e: event_data) {
			if(e.get_id() == event_id) {
				u.set_user_event(e); 
				/*inject the dependency of the user to this event object,
				  the injection is done by an entity outside of user class*/
			}
		}
	}
	
	public void check_user_event(UserInfo u) {
		if(u.get_user_event_id() == 0) {
			System.out.println("You do not have any booked events");
		}
		else {
			System.out.println(u.get_user_event());
		}
	}
	
}
	
