package corejavafinalmock;

class User {
	String username;
	String contactDetails;
	Ticket ticket; // Aggregation (User "has" a Ticket)

	public User(String username, String contactDetails, Ticket ticket) {
		this.username = username;
		this.contactDetails = contactDetails;
		this.ticket = ticket;
	}

	public String getUsername() {
		return username;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public Ticket getTicket() {
		return ticket;
	}
}