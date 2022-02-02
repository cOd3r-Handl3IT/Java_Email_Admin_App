package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		
		// em1.changePassword(password); // change em1's record for password
		// em1.setMailboxCapacity(capacity); // change em1's record for mailbox capacity
		// em1.setAlernateEmail(altEmail); // change em1's alternate email
		
		System.out.println(em1.showInfo());
		
	}

}
