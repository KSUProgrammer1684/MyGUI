package start;

import java.util.ArrayList;
/**This class provides implementation for the billing info page.
 * 
 * @author Brian Baker
 *
 */
public class BillingInfo extends Payment {
	private ArrayList<String> address;
	private ArrayList<String> zipCode;
	private ArrayList<String> state;
	private ArrayList<String> county;
	private ArrayList<String> creditCardNumber;
	private ArrayList<String> orderNumber;
	private ArrayList<String> orderInformation;
    /**This is a constructor for BillingInfo
     *  
     * @param email
     * @param password
     * @param address
     * @param phoneNumber
     * @param paymentMethod
     * @param deliveryInstructions
     * 
     * @precondition: none;
     * @postcondition: all instance variables are initialized
     */
	public BillingInfo(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions) {
		super(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
		this.address = new ArrayList<String>();
		this.zipCode = new ArrayList<String>();
		this.state = new ArrayList<String>();
		this.county = new ArrayList<String>();
		this.creditCardNumber = new ArrayList<String>();
		this.orderNumber = new ArrayList<String>();
		this.orderInformation = new ArrayList<String>();
	}
    /**This is a getter for address.
     * @return address
     * @precondition: none
     * @postcondition: none
     */
	public String getAddress() {
		for(String a : this.address){
			return a + " ";
		}
		return "";
	}
	/**This is a setter for address.
     * @precondition: none
     * @postcondition: address is added.
     */
	public void setAddress(String address) {
		this.address.add(address); 
	}
	/**This is a getter for zip code.
     * @return zipCode
     * @precondition: none
     * @postcondition: none
     */
	public String getZipCode() {
		for(String z : this.zipCode){
			return z + " ";
		}
		return ""; 
	}
	/**This is a setter for zip code.
     * @precondition: none
     * @postcondition: zip code is added
     */
	public void setZipCode(String zipCode) {
		this.zipCode.add(zipCode);
	}
	/**This is a getter for state.
     * @return state
     * @precondition: none
     * @postcondition: none
     */
	public String getState() {
		for(String s: this.state){
			return s + " ";
		}
		return ""; 
	}
	/**This is a setter for state.
     * @precondition: none
     * @postcondition: state is added
     */
	public void setState(String state) {
		this.state.add(state);
	}
	/**This is a getter for county.
     * @return county
     * @precondition: none
     * @postcondition: none
     */
	public String getCounty() {
		for(String c : this.county){
			return c + " ";
		}
		return ""; 
	}
	/**This is a setter for county.
     * @precondition: none
     * @postcondition: county is added
     */
	public void setCounty(String county) {
		this.county.add(county);
	}
	/**This is a getter for credit card number.
     * @return creditCardNumber
     * @precondition: none
     * @postcondition: none
     */
	public String getCreditCardNumber() {
		for(String ccn : this.creditCardNumber ){
			return ccn + " ";
		}
		return ""; 
	}
	/**This is a setter for credit card number.
     * @precondition: none
     * @postcondition: credit card number is added
     */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber.add(creditCardNumber);
	}
	/**This is a getter for order number.
     * @return orderNumber
     * @precondition: none
     * @postcondition: none
     */
	public String getOrderNumber() {
		for(String on : this.orderNumber){
			return on + " ";
		}
		return "";
	}
	/**This is a setter for order number.
     * @precondition: none
     * @postcondition: orderNumber is added
     */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber.add(orderNumber);
	}
	/**This is a getter for order information.
     * @return orderInformation
     * @precondition: none
     * @postcondition: none
     */
	public String getOrderInformation() {
		for(String oi : this.orderInformation){
			return oi + " ";
		}
		return ""; 
	}
	/**This is a setter for order information.
     * @precondition: none
     * @postcondition: orderInformation is added
     */
	public void setOrderInformation(String orderInformation) {
		this.orderInformation.add(orderInformation);
	}
}
