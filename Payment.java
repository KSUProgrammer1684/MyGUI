package start;

import java.util.ArrayList;
/**This class provides functionality to the payment page in the UI.
 * 
 * @author Brian Baker
 *
 */
public class Payment extends Menu {
	private ArrayList<String> creditCardNumber; 
	private ArrayList<String> expirationDate; 
	private ArrayList<String> securityCode; 
    /**This is a constructor for Payment.
     * 
     * @param email
     * @param password
     * @param address
     * @param phoneNumber
     * @param paymentMethod
     * @param deliveryInstructions
     * 
     * @precondition: none
     * @postcondition: parameters are initialized
     */
	public Payment(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions) {
		super(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
		this.creditCardNumber = new ArrayList<String>();
		this.expirationDate = new ArrayList<String>();
		this.securityCode = new ArrayList<String>();
	}
    /**This is a getter for expiration date.
     * 
     * @return expirationDate
     * @precondition: none
     * @postcondition: none
     */
	public String getExpirationDate() {
		for(String e : this.expirationDate){
			return  e + " ";
		}
		return "";
	}
	 /**This is a setter for expiration date.
     * 
     * @precondition: none
     * @postcondition: expirationDate has been added
     */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate.add(expirationDate);
	}
	 /**This is a getter for credit card number.
     * 
     * @return creditCardNumber
     * @precondition: none
     * @postcondition: none
     */
	public String getCreditCardNumber() {
		for(String c: this.creditCardNumber){
			return c + " ";
		}
		return "";
	}
	 /**This is a setter for credit card number.
     * 
     * @precondition: none
     * @postcondition: credit card number is added
     */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber.add(creditCardNumber);
	}
	 /**This is a getter for security code.
     * 
     * @return securityCode
     * @precondition: none
     * @postcondition: none
     */
	public String getSecurityCode() {
		for(String s : this.securityCode){
			return s + " ";
		}
		return "";
	}
	 /**This is a setter for security code.
     * 
     * @precondition: none
     * @postcondition: security code is added
     */
	public void setSecurityCode(String securityCode) {
		this.securityCode.add(securityCode);
	}
}
