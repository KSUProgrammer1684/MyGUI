package start;

import java.util.ArrayList;
/**This class provides functionality to the account page buttons. 
 * 
 * @author Brian Baker
 *
 */
public class Account {

	private ArrayList<String> email;
	private ArrayList<String> password;
	private ArrayList<String> address;
	private ArrayList<String> phoneNumber;
	private ArrayList<String> paymentMethod;
	private ArrayList<String> deliveryInstructions;
    /**This is a constructor for account.
     * 
     * @param email
     * @param password
     * @param address
     * @param phoneNumber
     * @param paymentMethod
     * @param deliveryInstructions
     * 
     * @precondition: none
     * @postcondition: all variables are initialized and are not null.
     */
	public Account(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions) {
		this.email = new ArrayList<String>();
		this.password = new ArrayList<String>();
		this.address = new ArrayList<String>();
		this.phoneNumber = new ArrayList<String>();
		this.paymentMethod = new ArrayList<String>();
		this.deliveryInstructions = new ArrayList<String>();
		try{
		this.email.add(email);
		this.password.add(password);
		this.address.add(address);
		this.phoneNumber.add(phoneNumber);
		this.paymentMethod.add(paymentMethod);
		this.deliveryInstructions.add(deliveryInstructions);
		}catch(NullPointerException e){
			
		}
	}

	/**
	 * This is a getter for email.
	 * 
	 * @return email
	 * @precondition: none
	 * @postcondition: none
	 */
	public String getEmail() {
		for (String e : this.email) {
			return e + " ";
		}
		return "";
	}

	/**
	 * This is a getter for password.
	 * 
	 * @return password
	 * @precondition: none
	 * @postcondition: none
	 */
	public String getPassword() {
		for (String p : this.password) {
			return p + " ";
		}
		return "";
	}

	/**
	 * This is a getter for address.
	 * 
	 * @return email
	 * @precondition: none
	 * @postcondition: none
	 */
	public String getAddress() {
		for (String a : this.address) {
			return a + " ";
		}
		return "";
	}

	/**
	 * This is a getter for payment method.
	 * 
	 * @return paymentMethod
	 * @precondition: none
	 * @postcondition: none
	 */
	public String getPaymentMethod() {
		for (String pm : this.paymentMethod) {
			return pm + " ";
		}
		return "";
	}

	/**
	 * This is a getter for delivery instructions.
	 * 
	 * @return deliveryInstructions
	 * @precondition: none
	 * @postcondition: none
	 */
	public String getDeliveryInstructions() {
		for (String di : this.deliveryInstructions) {
			return di + " ";
		}
		return "";
	}

	/**
	 * This is a getter for phone number.
	 * 
	 * @return phoneNumber
	 * @precondition: none
	 * @postcondition: none
	 */
	public String getPhoneNumber() {
		for (String pn : this.phoneNumber) {
			return pn + " ";
		}
		return "";
	}
}
