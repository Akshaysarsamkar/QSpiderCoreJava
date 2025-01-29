package opps.inheritance;

public class Mobile {

	String mobilebrand;
	String mobileColor;
	int mobilePrice;

	// aggregation has-a relationship
	EarPhone earPhone;

	public Mobile(String mobilebrand, String mobileColor, int mobilePrice) {
		this.mobilebrand = mobilebrand;
		this.mobileColor = mobileColor;
		this.mobilePrice = mobilePrice;
	}

	public void insertEarPhone(EarPhone earPhone) {
		if (this.earPhone == null) {
			this.earPhone = earPhone;
			System.out.println("Earphone is inserted into the mobile ");
		} else {
			System.out.println("Earphone Already Exits........");
		}
	}

	public void removeEarphone() {
		if (this.earPhone == null) {
			System.out.println("Earphone is not present in the mobile.......");
		} else {
			this.earPhone = null;
			System.out.println("EarPhone Remove sucessfully........");
		}
	}

	public void earPhoneAndMobileDetails() {
		earPhone.earPhoneDetails();
		System.out.println("Mobile Brand" + mobilebrand);
		System.out.println("Mobile color " + mobileColor);
		System.out.println("Mobile price " + mobilePrice);
	}
}
