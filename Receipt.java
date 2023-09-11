package start;

//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import java.activation.*; 
/**
 * This class provides functionality for the receipt page
 * 
 * @author Brian Baker
 *
 */
public class Receipt extends BillingInfo {
	/**
	 * This is a constructor for receipt.
	 * 
	 * @param email
	 * @param password
	 * @param address
	 * @param phoneNumber
	 * @param paymentMethod
	 * @param deliveryInstructions
	 * 
	 * @precondition: none
	 * @postcondition: none
	 */
	public Receipt(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions) {
		super(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
	}

	/**
	 * This method prints a receipt for the user.
	 * 
	 * @return receipt
	 * @precondition: all values have been collected from input UI.
	 * @postcondition: values are displayed in the UI.
	 */
	public String printReceipt() {
		String price = "$10.00";
		return "Receipt:" + "\n" + this.getAddress() + "\n" + "Beverages: " + this.getBeverages() + "\n" + "Deserts: "
				+ this.getDesserts() + "\n" + "Pizza Size: " + this.getPizzaSize() + "\n" + "Pizza Style: "
				+ this.getStyle() + "\n" + "Sides: " + this.getSides() + "\n" + "Toppings: " + this.getToppings() + "\n"
				+ "Price: " + price;
	}

	/**
	 * This method emails the user a reciept of the buying a pizza.
	 * 
	 * @precondition: all input values have been received.
	 * @postcondition: email all values and a price for the pizza.
	 */
	public void emailReciept() {
		// TODO make emailed receipt
		// Recipient's email ID needs to be mentioned.
		// String to = "abcd@gmail.com";

		// Sender's email ID needs to be mentioned
		// String from = "web@gmail.com";

		// Assuming you are sending email from localhost
		// String host = "localhost";

		// Get system properties
		// Properties properties = System.getProperties();

		// Setup mail server
		// properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		// Session session = session.getDefaultInstance(properties);

		// try {
		// Create a default MimeMessage object.
		// MimeMessage message = new MimeMessage(session);

		// Set From: header field of the header.
		// message.setFrom(new InternetAddress(from));

		// Set To: header field of the header.
		// message.addRecipient(message.RecipientType.TO, new
		// InternetAddress(to));

		// Set Subject: header field
		// message.setSubject("This is the Subject Line!");

		// Now set the actual message
		// message.setText("This is actual message");

		// Send message
		// Transport.send(message);
		// } catch (MediaException mex) {
		// mex.printStackTrace();
		// }
	}
}	

