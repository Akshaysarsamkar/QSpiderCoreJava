package opps.inheritance;

public class EarPhone {

	String earphoneBrand;
	String earphoneColor;
	float earphonePrice;

	public EarPhone(String earphoneBrand, String earphoneColor, float earphonePrice) {
		this.earphoneBrand = earphoneBrand;
		this.earphoneColor = earphoneColor;
		this.earphonePrice = earphonePrice;
	}

	public void earPhoneDetails() {
		System.out.println("Earphone Brand is: " + earphoneBrand);
		System.out.println("EarPhone Color is : " + earphoneColor);
		System.out.println("Earphone Price is: " + earphonePrice);
		
		
		
	}

}
