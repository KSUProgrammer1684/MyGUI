package start;
/**This class provides functionality for the employee access page.
 * 
 * @author Brian Baker
 *
 */
public class EmployeeAccess extends BillingInfo {
    /**This is the constructor for the employee access class. 
     * 
     * @param email
     * @param password
     * @param address
     * @param phoneNumber
     * @param paymentMethod
     * @param deliveryInstructions
     * @precondition: none
     * @postcondition: none
     */
	public EmployeeAccess(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions) {
		super(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
		
	}
	/**This method finds order number and displays their information.
	 * 
	 * @param orderNumber
	 * @return orderNumber
	 * 
	 */
	public String orderNumber(String orderNumber){
		try{
		if(orderNumber == this.getOrderNumber()){
			return orderNumber;
		}
		} catch(NullPointerException e){
		return "Invalid Number";
		}
		return "Invalid Number";
	}
	/**This method displays all the current orderInformation.
	 * 
	 * @return orderInformation
	 * @preconditions: none
	 * @postcondition: none
	 */
	public String orderInformation(){
		return this.getOrderInformation();
	}
	/**This method determines if the pizza has been payed. 
	 * 
	 * @param pay
	 * @return true or false if the pizza has been payed
	 * @precondition: none
	 * @postcondition: is the purchase completed? True or False?  
	 */
	public boolean pay(boolean pay){
		if(pay == true){
			return true; 
		}else{
			return false;
		}
	}
}
