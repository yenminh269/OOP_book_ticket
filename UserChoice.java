package OOP_Train_YM;

import java.util.Scanner;

public class UserChoice {
	static Scanner sc = new Scanner(System.in);
	static UserManager boss = new UserManager();
	static UserInfo mem = null;
	static int user_choice;
	static String user_name;
	static String user_pw;
	
	static void set_user(UserInfo u) {
		mem = u;
	}
	
	static void set_manager(UserManager b) {
		boss = b;
	}
	
	static void process_pre_login(int num) {
		switch(num) {
		case 1:
			do {
				System.out.print("Create a new username: ");
				user_name = sc.nextLine();
			}while(boss.check_user_id(user_name));
			System.out.print("Create a new password: ");
			user_pw = sc.nextLine();
			boss.register_user(user_name, user_pw);
			System.out.println("Your new account created sucessfully");
			break;
		case 2:
			System.out.print("Enter your username: ");
			user_name = sc.nextLine();
			System.out.print("Enter your password: ");
			user_pw = sc.nextLine();
			while(!boss.login_user(user_name, user_pw)) {
				System.out.println("---Please check again your username or password--- ");
				System.out.print("Retype your username: ");
				user_name = sc.nextLine();
				System.out.print("Retype your password: ");
				user_pw = sc.nextLine();
			};
			System.out.println("Logged in sucessfully");
			
		}
		set_user(new UserInfo(user_name,user_pw));
		show_mainpage();
	}
	
	static void show_mainpage() {
		System.out.println("--- Here are our home page ---");
		System.out.println("1.View all events | 2.Book a ticket | 3.View my ticket | 4.Log out");
		System.out.print("Type your option : ");
		user_choice = sc.nextInt();
		sc.nextLine();
		process_user_choice(user_choice);
	}
	
	static void auto_assist_user() {
		System.out.println("1. Go back to the home page | 2. Exit");
		System.out.print("Type your option : ");
		user_choice = sc.nextInt();
		sc.nextLine();
		switch(user_choice) {
		case 1: 
			show_mainpage();
			break;
		case 2:
			process_user_choice(4);
		}
	}
	
	static void process_user_choice(int num) {
		switch(num) {
		case 1:
			boss.view_event();
			auto_assist_user();
			break;
		case 2:
			System.out.print("Type your event ID: ");
			user_choice = sc.nextInt();
			sc.nextLine();
			boss.set_user_event(mem, user_choice);
			System.out.println("Select your payment method: 1.Credit/Debit Card| 2.PayPal ");
			Payment p = null;
			user_choice = sc.nextInt();
			sc.nextLine();
			String type;
			String cardName;
			String cardNumber;
			int cvv;
			switch(user_choice) {
			case 1:
				type = "Credit/Debit";
				System.out.print("Type your cardholder name: ");
				cardName = sc.nextLine();
				System.out.print("Type your card number: ");
				cardNumber = sc.nextLine();
				System.out.print("Type your cvv number: ");
				cvv = sc.nextInt();
				sc.nextLine();
				p = new Payment(type, cardName, cardNumber, cvv);
				mem.set_user_payment(p);
				break;
			case 2:
				type = "Paypal";
				System.out.print("Link your Paypal Account: ");
				cardName = sc.nextLine();
				p = new Payment(type, cardName);
				mem.set_user_payment(p);
			}
			System.out.println("Select your notification method: 1.SMS | 2.Email");
			user_choice = sc.nextInt();
			sc.nextLine();
			String method;
			switch(user_choice) {
			case 1:
				System.out.print("Type your phone number with dashes between: ");
				break;
			case 2:
				System.out.print("Type your email address: ");
			}
			method = sc.nextLine();
			mem.set_user_notif(method);
			System.out.println("***Your ticket has been booked sucessfully***");
			System.out.println("----Event Details----");
			System.out.println(mem.get_user_event());
			System.out.println("---Billing Information---");
			System.out.println("Customer name: " + mem.get_user_id());
			System.out.println("Payment method: "+ mem.get_user_payment());
			System.out.println("The notification sent via: " + mem.get_notif_method());
			auto_assist_user();
			break;
		case 3:
			boss.check_user_event(mem);
			auto_assist_user();
			break;
		case 4:
			System.out.println("You logged out");
		}
	}
}
