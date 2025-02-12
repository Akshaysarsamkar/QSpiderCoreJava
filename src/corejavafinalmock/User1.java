package corejavafinalmock;

public class User1 {

	String username;
	String contactDetails;
	Ticket1 ticket;

	public User1(String username, String contactDetails, Ticket1 ticket) {
		super();
		this.username = username;
		this.contactDetails = contactDetails;
		this.ticket = ticket;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Ticket1 getTicket() {
		return ticket;
	}

	public void setTicket(Ticket1 ticket) {
		this.ticket = ticket;
	}

}
