package OOP_Train_YM;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserManager boss = new UserManager();
		boss.set_event("BTS Concert", "May 2, 2025", "New York", 200, 145);
		boss.set_event("Elsa Movie", "Sep 26, 2025", "Florida", 10, 146);
		boss.set_event("Astro Game", "July 7, 2025", "Texas", 80, 147);
		boss.register_user("mincy", "269");
		boss.register_user("duyphuc", "888");
		UserChoice.set_manager(boss);
		boss.pre_login();
		int user_choice = sc.nextInt();
		sc.nextLine(); //reads the leftover newline
		UserChoice.process_pre_login(user_choice);
	}

}
