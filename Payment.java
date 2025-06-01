package OOP_Train_YM;

public class Payment {
	private String type;
	private String card_holder;
	private String card_number;
	private int cvv;
	private String linked_account;
	public Payment(String type, String name, String number, int cvv) {
		this.type = type + "card";
		card_holder = name;
		card_number = number;
		this.cvv = cvv;
	}
	public Payment(String type, String account) {
		this.type = type;
		linked_account = account;
	}
	public String get_payment() {
		return "Payment Method: " + this.type;
	}
}

