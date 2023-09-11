package start;
/**This class provides functionality to the login page. 
 * 
 * @author Brian Baker
 *
 */
public class Login extends Account {
	/**This is the constructor for the login class
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
	public Login(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions) {
		super(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
	}

}
