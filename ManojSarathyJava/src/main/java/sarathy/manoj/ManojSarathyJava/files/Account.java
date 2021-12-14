package sarathy.manoj.ManojSarathyJava.files;

public class Account 
{
	String holder;
	Long number;
	Double balance;
	@Override
	public String toString() {
		return "Account [holder=" + holder + ", number=" + number + ", balance=" + balance + "]";
	}
	public Account(String holder, Long number, Double balance) {
		super();
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
}
