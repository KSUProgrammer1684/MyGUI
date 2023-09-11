package start;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author Brian Baker SWE 3313 group 8
 *
 */
public class RunUI extends Application implements EventHandler<ActionEvent> {
	Label l1;
	Label l2;
	Label l3;
	Label l4;
	Label l5;
	Label l6;
	Label l7;
	Label l8;
	Label l9;
	Label l10;
	Label Ll;
	Button b1;
	Button b2;
	TextField a1;
	TextField a2;
	TextField a3;
	TextField a4;
	TextField a5;
	Button b3;
	TextArea a11;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b10;
	Button b11;
	Button b12;
	Button b13;
	Button b14;
	Button b15;
	Button b16;
	Button b17;
	Button b18;
	Button b19;
	Button b20;
	Button b21;
	Button b22;
	Button b23;
	Button b24;
	Button b25;
	Button b26;
	Button b27;
	Button b28;
	Button b29;
	Button b30;
	Button b31;
	Button b32;
	Button b33;
	Button b34;
	Button b35;
	Button b36;
	Button b37;
	Button b38;
	Button b39;
	Button b40;
	Button b41;
	Button b42;
	Button b43;
	Button b44;
	Button b45;
	Button b46;
	Button b47;
	Button b48;
	Button b49;
	Button b50;
	Button b51;
	Button b52;
	TextField a6;
	TextField a7;
	TextField a8;
	TextField a9;
	TextField a10;
	TextField a12;
	TextField a13;
	TextField a14;
	TextField a15;
	TextField a16;
	TextField a17;
	TextField a18;
	TextField a19;
	TextField a20;
	TextField aa;
	TextArea aaa;
	Account a;
	Menu m;
	Payment p;
	Receipt r;
	Login l;
	EmployeeAccess ea;
	BillingInfo bi;
	String email;
	String password;
	String address;
	String phoneNumber;
	String paymentMethod;
	String deliveryInstructions;
	String orderNumber = "";
	String creditCardNumber;
	String orderInformation;
	String securityCode;
	String expirationDate;
	TextField a43;
	TextField a44;
	TextField a45;
	TextArea ta01;

	/**
	 * Initial window for pizza application throws exception.
	 * 
	 * @param primaryStage
	 * @precondition none
	 * @postcondition none
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		root.setMinHeight(280);
		root.setMinWidth(360);
		Scene rootScene = new Scene(root);
		primaryStage.setScene(rootScene);
		l4 = new Label("The Pizza Shop!");
		b2 = new Button("Returning Customer?");
		b1 = new Button("Never tried us? Start here!");
		root.add(l4, 0, 0);
		root.add(b2, 0, 15);
		root.add(b1, 0, 20);
		b1.setOnAction(this);
		b2.setOnAction(this);
		primaryStage.show();
	}

	/**
	 * Shows the rest of the pages in pizza application. Plus makes the buttons
	 * work.
	 *
	 * @param event
	 * @preconditions none
	 * @postcondition none
	 */
	@Override
	public void handle(ActionEvent event) {
		// go to login page to create account
		if (b1 == event.getSource()) {
			Stage second = new Stage();
			GridPane root2 = new GridPane();
			root2.setMinHeight(280);
			root2.setMinWidth(360);
			Scene rootScene = new Scene(root2);
			second.setScene(rootScene);
			l2 = new Label("Create your Profile");
			b3 = new Button("Create account");
			a1 = new TextField("Email:");
			a2 = new TextField("Password:");
			a3 = new TextField("Address:");
			a4 = new TextField("Phone number:");
			a5 = new TextField("Payment Method:");
			b3.setOnAction(this);
			root2.add(l2, 0, 0);
			root2.add(a1, 0, 15);
			root2.add(a2, 0, 30);
			root2.add(a3, 0, 45);
			root2.add(a4, 0, 60);
			root2.add(a5, 0, 75);
			root2.add(b3, 0, 90); // sends you to login page
			second.show();
			// ------------------------------------------------------Enter
			// information below into array account class
			email = a1.getAccessibleText();
			password = a2.getAccessibleText();
			address = a3.getAccessibleText();
			phoneNumber = a4.getAccessibleText();
			paymentMethod = a5.getAccessibleText();
			try {
				a = new Account(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
			} catch (NullPointerException e) {

			}
		}
		// login to personalize profile.
		if (b2 == event.getSource()) {
			Stage third = new Stage();
			GridPane root3 = new GridPane();
			root3.setMinHeight(280);
			root3.setMinWidth(360);
			Scene rootScene2 = new Scene(root3);
			third.setScene(rootScene2);
			l3 = new Label("Personalize your Profile");
			b4 = new Button("Save changes"); // takes you to login page
			b5 = new Button("Back");
			a6 = new TextField("Email:");
			a7 = new TextField("Password:");
			a8 = new TextField("Address:");
			a9 = new TextField("Phone number:");
			a10 = new TextField("Payment Method:");
			a11 = new TextArea("Special delivery instructions:");
			b4.setOnAction(this);
			root3.add(l3, 0, 0);
			root3.add(a6, 0, 15);
			root3.add(a7, 0, 30);
			root3.add(a8, 0, 45);
			root3.add(a9, 0, 60);
			root3.add(a10, 0, 75);
			root3.add(a11, 0, 90);
			root3.add(b4, 0, 100);
			root3.add(b5, 50, 0);
			third.show();
			// ----------------------------------------------enter information
			// below into account class
			email = a6.getAccessibleText();
			password = a7.getAccessibleText();
			address = a8.getAccessibleText();
			phoneNumber = a9.getAccessibleText();
			paymentMethod = a10.getAccessibleText();
			deliveryInstructions = a11.getAccessibleText();
			try {
				a = new Account(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
			} catch (NullPointerException e) {

			}
		}
		if (b3 == event.getSource()) { // Go to login
			Stage fourth = new Stage();
			GridPane root4 = new GridPane();
			root4.setMinHeight(280);
			root4.setMinWidth(360);
			Scene rootScene3 = new Scene(root4);
			fourth.setScene(rootScene3);
			l5 = new Label("Login");
			b6 = new Button("Submit");
			a12 = new TextField("Email:");
			a13 = new TextField("Password:");
			b6.setOnAction(this);
			root4.add(l5, 0, 0);
			root4.add(a12, 0, 15);
			root4.add(a13, 0, 30);
			root4.add(b6, 0, 45);
			fourth.show();
			// -----------------------------store information in Login class

		}
		if (b6 == event.getSource()) { // login
			// EmployeeAccess
			// page
			Stage s = new Stage();
			GridPane r = new GridPane();
			r.setMinHeight(280);
			r.setMinWidth(360);
			Scene rS = new Scene(r);
			s.setScene(rS);
			Ll = new Label("EmployeeAccess");
			aa = new TextField("Order Number:");
			aaa = new TextArea("Order Information:");
			r.add(Ll, 0, 0);
			r.add(aa, 0, 15);
			r.add(aaa, 0, 30);
			s.show();
			try {
				String sa = aa.getAccessibleText(); // use this to enter if
				// purchase is made with
				// cash pay method.
				ea.orderNumber(sa);
				String OrderInformation = ea.getOrderInformation(); // use
				aaa.setText(OrderInformation);
			} catch (NullPointerException e) {
				aaa.setText("There are no orders at this time.");
			}
		}

		if (b4 == event.getSource()) {
			Stage five = new Stage();
			GridPane root5 = new GridPane();
			root5.setMinHeight(280);
			root5.setMinWidth(360);
			Scene rootScene4 = new Scene(root5);
			five.setScene(rootScene4);
			l5 = new Label("Login");
			b6 = new Button("Submit");
			a12 = new TextField("Email:");
			a13 = new TextField("Password:");
			b6.setOnAction(this);
			root5.add(l5, 0, 0);
			root5.add(a12, 0, 15);
			root5.add(a13, 0, 30);
			root5.add(b6, 0, 45);
			five.show();
			// -----------------------------store information in Login class
			String email = a12.getAccessibleText();
			String password = a13.getAccessibleText();
			if (email == a.getPassword() && password == a.getPassword()) {
				l = new Login(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
			}
		}
		if (b5 == event.getSource()) {
			// back to first page
			Stage primaryStage2 = new Stage();
			GridPane root6 = new GridPane();
			root6.setMinHeight(280);
			root6.setMinWidth(360);
			Scene rootScene5 = new Scene(root6);
			primaryStage2.setScene(rootScene5);
			l4 = new Label("The Pizza Shop!");
			b1 = new Button("Returning Customer?");
			b2 = new Button("Never tried us? Start here!");
			root6.add(l4, 0, 0);
			root6.add(b1, 0, 15);
			root6.add(b2, 0, 20);
			b1.setOnAction(this);
			b2.setOnAction(this);
			primaryStage2.show();
		}
		if (b6 == event.getSource()) {
			// Order creation page
			Stage primaryStage3 = new Stage();
			GridPane root7 = new GridPane();
			root7.setMinHeight(280);
			root7.setMinWidth(360);
			Scene rootScene6 = new Scene(root7);
			primaryStage3.setScene(rootScene6);
			l6 = new Label("Order Creation");
			b7 = new Button("Create New Order?");
			b8 = new Button("Lookup Perivous orders!");
			b9 = new Button("Sign out"); // takes you back to login page
			root7.add(l4, 0, 0);
			root7.add(b7, 0, 15);
			root7.add(b8, 0, 20);
			root7.add(b9, 0, 30);
			b7.setOnAction(this);
			b8.setOnAction(this);
			b9.setOnAction(this);
			primaryStage3.show();
		}
		if (b7 == event.getSource()) {
			Stage primaryStage4 = new Stage();
			GridPane root8 = new GridPane();
			root8.setMinHeight(280);
			root8.setMinWidth(360);
			Scene rootScene7 = new Scene(root8);
			primaryStage4.setScene(rootScene7);
			l7 = new Label("Menu");
			b10 = new Button("Small");
			b11 = new Button("Medium");
			b12 = new Button("Large");
			b13 = new Button("Garlic knots");
			b14 = new Button("Breadsticks");
			b15 = new Button("Iceberg Salad");
			b16 = new Button("Coke");
			b17 = new Button("Sprite");
			b18 = new Button("Orange Fanta");
			b19 = new Button("Chocolate Cookies");
			b20 = new Button("Brownies");
			b21 = new Button("Cinnamon twists");
			b22 = new Button("Back"); // goes back to order creation page
			b23 = new Button("Cart number of items: "); // enter number of items
														// // here
			root8.add(l7, 0, 0);
			// add functionality to these buttons below with team------------
			root8.add(b10, 0, 15);
			root8.add(b11, 0, 20);
			root8.add(b12, 0, 30);
			root8.add(b13, 25, 15);
			root8.add(b14, 25, 20);
			root8.add(b15, 25, 30);
			root8.add(b16, 50, 15);
			root8.add(b17, 50, 20);
			root8.add(b18, 50, 30);
			root8.add(b19, 75, 15);
			root8.add(b20, 75, 20);
			root8.add(b21, 75, 30);
			// ----------------------------------------------------------------
			root8.add(b22, 100, 0);
			root8.add(b23, 100, 50);
			b10.setOnAction(this);
			b11.setOnAction(this);
			b12.setOnAction(this);
			b13.setOnAction(this);
			b14.setOnAction(this);
			b15.setOnAction(this);
			b16.setOnAction(this);
			b17.setOnAction(this);
			b18.setOnAction(this);
			b19.setOnAction(this);
			b20.setOnAction(this);
			b21.setOnAction(this);
			b22.setOnAction(this);
			b23.setOnAction(this);
			primaryStage4.show();
		}
		if (b8 == event.getSource()) {
			// add function to look up previous orders here.
		}
		if (b9 == event.getSource()) { // back to login page button
			Stage six = new Stage();
			GridPane root9 = new GridPane();
			root9.setMinHeight(280);
			root9.setMinWidth(360);
			Scene rootScene8 = new Scene(root9);
			six.setScene(rootScene8);
			l5 = new Label("Login");
			b6 = new Button("Submit");
			a12 = new TextField("Email:");
			a13 = new TextField("Password:");
			b6.setOnAction(this);
			root9.add(l5, 0, 0);
			root9.add(a12, 0, 15);
			root9.add(a13, 0, 30);
			root9.add(b6, 0, 45);
			six.show();
		}

		if (b22 == event.getSource()) { // back to previous page
			// Order creation page
			Stage primaryStage31 = new Stage();
			GridPane root71 = new GridPane();
			root71.setMinHeight(280);
			root71.setMinWidth(360);
			Scene rootScene61 = new Scene(root71);
			primaryStage31.setScene(rootScene61);
			l6 = new Label("Order Creation");
			b7 = new Button("Create New Order?");
			b8 = new Button("Lookup Perivous orders!");
			b9 = new Button("Sign out"); // takes you back to login page
			root71.add(l4, 0, 0);
			root71.add(b7, 0, 15);
			root71.add(b8, 0, 20);
			root71.add(b9, 0, 30);
			b7.setOnAction(this);
			b8.setOnAction(this);
			b9.setOnAction(this);
			primaryStage31.show();
			Random r = new Random();
			int rnumber = 0;
			for (int counter = 1; counter <= 10; counter++) {
				rnumber = r.nextInt();
			}
			orderNumber = "" + rnumber;
			bi.setOrderNumber(orderNumber);
		}
		if (b23 == event.getSource()) { // go to next page
			Stage primaryStage41 = new Stage();
			GridPane root81 = new GridPane();
			root81.setMinHeight(280);
			root81.setMinWidth(360);
			Scene rootScene71 = new Scene(root81);
			primaryStage41.setScene(rootScene71);
			b24 = new Button("Small");
			b25 = new Button("Medium");
			b26 = new Button("Large");
			b27 = new Button("Chicago Style");
			b28 = new Button("Stuffed Crust");
			b29 = new Button("New York Style");
			b30 = new Button("Pepperoni");
			b31 = new Button("Sausage");
			b32 = new Button("Peppers");
			b33 = new Button("Onions");
			b34 = new Button("Pinapple");
			b35 = new Button("Anchovies");
			b36 = new Button("Ham");
			b37 = new Button("Mushrooms");
			b38 = new Button("Bacon");
			b39 = new Button("Chicken");
			b40 = new Button("Back");
			b41 = new Button("Submit");
			b42 = new Button("Cart number: "); // put number here
			// add functionality to these buttons below with team------------
			root81.add(b24, 0, 15);
			root81.add(b25, 0, 20);
			root81.add(b26, 0, 30);
			root81.add(b27, 25, 15);
			root81.add(b28, 25, 20);
			root81.add(b29, 25, 30);
			root81.add(b30, 50, 15);
			root81.add(b31, 50, 20);
			root81.add(b32, 50, 30);
			root81.add(b33, 75, 15);
			root81.add(b34, 75, 20);
			root81.add(b35, 75, 30);
			root81.add(b36, 100, 15);
			root81.add(b37, 100, 20);
			root81.add(b38, 100, 30);
			root81.add(b39, 250, 15);
			root81.add(b40, 250, 20);
			// ----------------------------------------------------------------
			root81.add(b41, 250, 30); // enters information
			root81.add(b42, 500, 500); // goes to next page
			b24.setOnAction(this);
			b25.setOnAction(this);
			b26.setOnAction(this);
			b27.setOnAction(this);
			b28.setOnAction(this);
			b29.setOnAction(this);
			b30.setOnAction(this);
			b31.setOnAction(this);
			b32.setOnAction(this);
			b33.setOnAction(this);
			b34.setOnAction(this);
			b35.setOnAction(this);
			b36.setOnAction(this);
			b37.setOnAction(this);
			b38.setOnAction(this);
			b39.setOnAction(this);
			b40.setOnAction(this);
			b41.setOnAction(this);
			b42.setOnAction(this);
			primaryStage41.show();
		}

		if (b40 == event.getSource()) {
			// back to other page
			Stage primaryStage31 = new Stage();
			GridPane root71 = new GridPane();
			root71.setMinHeight(280);
			root71.setMinWidth(360);
			Scene rootScene61 = new Scene(root71);
			primaryStage31.setScene(rootScene61);
			l6 = new Label("Order Creation");
			b7 = new Button("Create New Order?");
			b8 = new Button("Lookup Perivous orders!");
			b9 = new Button("Sign out"); // takes you back to login page
			root71.add(l4, 0, 0);
			root71.add(b7, 0, 15);
			root71.add(b8, 0, 20);
			root71.add(b9, 0, 30);
			b7.setOnAction(this);
			b8.setOnAction(this);
			b9.setOnAction(this);
			primaryStage31.show();
		}
		if (b41 == event.getSource()) {
			// Submit
			if (b24 == event.getSource()) {
				// small pizza
				m.setPizzaSize("Small");
			}
			if (b25 == event.getSource()) {
				// medium pizza
				m.setPizzaSize("Medium");
			}
			if (b26 == event.getSource()) {
				// large pizza
				m.setPizzaSize("Large");
			}
			if (b27 == event.getSource()) {
				// chicago style
				m.setStyle("Chicago");
			}
			if (b28 == event.getSource()) {
				// stuffed crust
				m.setStyle("Stuffed Crust");
			}
			if (b29 == event.getSource()) {
				// new york style
				m.setStyle("New York");
			}
			if (b30 == event.getSource()) {
				// pepperoni
				m.setToppings("Pepperoni");
			}
			if (b31 == event.getSource()) {
				// sausage
				m.setToppings("sausage");
			}
			if (b32 == event.getSource()) {
				// peppers
				m.setToppings("Peppers");
			}
			if (b33 == event.getSource()) {
				// onions
				m.setToppings("Onions");
			}
			if (b34 == event.getSource()) {
				// pinapple
				m.setToppings("Pinapple");
			}
			if (b35 == event.getSource()) {
				// anchovies
				m.setToppings("anchovies");
			}
			if (b36 == event.getSource()) {
				// ham
				m.setToppings("Ham");
			}
			if (b37 == event.getSource()) {
				// mushroom
				m.setToppings("Mushroom");
			}
			if (b38 == event.getSource()) {
				// bacon
				m.setToppings("Bacon");
			}
			if (b39 == event.getSource()) {
				// chicken
				m.setToppings("Chicken");
			}
			if (b10 == event.getSource()) {
				// small pizza size button functionality goes here.
				m.setPizzaSize("Small");
			}
			if (b11 == event.getSource()) {
				// medium pizza size button functionality goes here.
				m.setPizzaSize("Medium");
			}
			if (b12 == event.getSource()) {
				// large pizza size button functionality goes here.
				m.setPizzaSize("Large");
			}
			if (b13 == event.getSource()) {
				// garlic knots
				m.setSides("Garlic Knots");
			}
			if (b14 == event.getSource()) {
				// breadsticks
				m.setSides("Bread Sticks");
			}
			if (b15 == event.getSource()) {
				// iceberg salad
				m.setSides("Iceberg Sald");
			}
			if (b16 == event.getSource()) {
				// coke
				m.setBeverages("Coke");
			}
			if (b17 == event.getSource()) {
				// sprite
				m.setBeverages("Sprite");
			}
			if (b18 == event.getSource()) {
				// orange fanta
				m.setBeverages("Orange Fanta");
			}
			if (b19 == event.getSource()) {
				// chocolate cookies
				m.setDesserts("Chocolate Cookies");
			}
			if (b20 == event.getSource()) {
				// brownies
				m.setDesserts("Brownies");
			}
			if (b21 == event.getSource()) {
				// cinnamon twist
				m.setDesserts("Cinnamon Twists");
			}
		}
		if (b42 == event.getSource()) {
			// click cart to go to next page Payment page shown below.
			Stage primaryStage311 = new Stage();
			GridPane root711 = new GridPane();
			root711.setMinHeight(280);
			root711.setMinWidth(360);
			Scene rootScene611 = new Scene(root711);
			primaryStage311.setScene(rootScene611);
			l8 = new Label("Payment");
			a43 = new TextField("Credit Card Number");
			a44 = new TextField("Expiration Date");
			a45 = new TextField("Security Code");
			b46 = new Button("Quick Pay");
			b47 = new Button("Back"); // takes you to payment page
			b48 = new Button("Order"); // takes you to next page
			root711.add(l8, 0, 0);
			root711.add(a43, 0, 15);
			root711.add(a44, 0, 20);
			root711.add(a45, 0, 30);
			root711.add(b46, 20, 0);
			root711.add(b47, 20, 15);
			root711.add(b48, 20, 20);
			a43.setOnAction(this);
			a44.setOnAction(this);
			a45.setOnAction(this);
			b46.setOnAction(this);
			b47.setOnAction(this);
			b48.setOnAction(this);
			primaryStage311.show();
			creditCardNumber = a43.getAccessibleText();
			expirationDate = a44.getAccessibleText();
			securityCode = a45.getAccessibleText();
		}
		if (b43 == event.getSource()) {
			bi.setCreditCardNumber(creditCardNumber);
		}
		if (b44 == event.getSource()) {
			// Expiration Date goes in payment class
			bi.setExpirationDate(expirationDate);
		}
		if (b45 == event.getSource()) {
			// Security Code goes in payment class
			bi.setSecurityCode(securityCode);
		}
		if (b46 == event.getSource()) {
			// Quick pay takes you to receipt page
			Stage primaryStage31111 = new Stage();
			GridPane root71111 = new GridPane();
			root71111.setMinHeight(280);
			root71111.setMinWidth(360);
			Scene rootScene61111 = new Scene(root71111);
			primaryStage31111.setScene(rootScene61111);
			l10 = new Label("Receipt");
			b51 = new Button("Print Receipt");
			b52 = new Button("Email Receipt");
			root71111.add(l10, 50, 0);
			root71111.add(b51, 50, 15);
			root71111.add(b52, 50, 20);
			b51.setOnAction(this);
			b52.setOnAction(this);
			primaryStage31111.show();
			// ---------------------------------
			// Use Receipt class here
		}
		if (b47 == event.getSource()) { // back button
			Stage primaryStage311 = new Stage();
			GridPane root711 = new GridPane();
			root711.setMinHeight(280);
			root711.setMinWidth(360);
			Scene rootScene611 = new Scene(root711);
			primaryStage311.setScene(rootScene611);
			l8 = new Label("Payment");
			b43 = new Button("Credit Card Number");
			b44 = new Button("Expiration Date");
			b45 = new Button("Security Code");
			b46 = new Button("Quick Pay");
			b47 = new Button("Back");
			b48 = new Button("Order");
			root711.add(l8, 0, 0);
			root711.add(b43, 0, 15);
			root711.add(b44, 0, 20);
			root711.add(b45, 0, 30);
			root711.add(b46, 20, 0);
			root711.add(b47, 20, 15);
			root711.add(b48, 20, 20);
			b43.setOnAction(this);
			b44.setOnAction(this);
			b45.setOnAction(this);
			b46.setOnAction(this);
			b47.setOnAction(this);
			b48.setOnAction(this);
			primaryStage311.show();
		}
		if (b48 == event.getSource()) {
			Stage primaryStage3111 = new Stage();
			GridPane root7111 = new GridPane();
			root7111.setMinHeight(280);
			root7111.setMinWidth(360);
			Scene rootScene6111 = new Scene(root7111);
			primaryStage3111.setScene(rootScene6111);
			l9 = new Label("Billing Info");
			a14 = new TextField("Address");
			a15 = new TextField("Zip Code");
			a16 = new TextField("State");
			a17 = new TextField("County");
			a18 = new TextField("Credit Card Number");
			a19 = new TextField("Order Number");
			a20 = new TextField("Order Information");
			b49 = new Button("Back"); // takes you to payment page
			b50 = new Button("Process Order"); // takes you to receipt page
			root7111.add(l9, 0, 0);
			root7111.add(a14, 0, 15);
			root7111.add(a15, 0, 20);
			root7111.add(a16, 0, 30);
			root7111.add(a17, 0, 40);
			root7111.add(a19, 20, 20);
			root7111.add(a20, 20, 30);
			root7111.add(b49, 0, 150);
			root7111.add(b50, 30, 50);
			b49.setOnAction(this);
			b50.setOnAction(this);
			primaryStage3111.show();
			// --------------------------------------- Enter text into the
			// Billing Info here
			String address = a14.getAccessibleText();
			String zipCode = a15.getAccessibleText();
			String State = a16.getAccessibleText();
			String County = a17.getAccessibleText();
			String CreditCardNumber = a18.getAccessibleText();
			String OrderNumber = a19.getAccessibleText();
			String OrderInformation = a20.getAccessibleText();
			try {
				bi.setAddress(address);
				bi.setZipCode(zipCode);
				bi.setState(State);
				bi.setCounty(County);
				bi.setCreditCardNumber(CreditCardNumber);
				bi.setOrderNumber(OrderNumber);
				bi.setOrderInformation(OrderInformation);
			} catch (NullPointerException b) {

			}
		}
		if (b49 == event.getSource()) { // back button
			Stage primaryStage311 = new Stage();
			GridPane root711 = new GridPane();
			root711.setMinHeight(280);
			root711.setMinWidth(360);
			Scene rootScene611 = new Scene(root711);
			primaryStage311.setScene(rootScene611);
			l8 = new Label("Payment");
			b43 = new Button("Credit Card Number");
			b44 = new Button("Expiration Date");
			b45 = new Button("Security Code");
			b46 = new Button("Quick Pay");
			b47 = new Button("Back");
			b48 = new Button("Order");
			root711.add(l8, 0, 0);
			root711.add(b43, 0, 15);
			root711.add(b44, 0, 20);
			root711.add(b45, 0, 30);
			root711.add(b46, 20, 0);
			root711.add(b47, 20, 15);
			root711.add(b48, 20, 20);
			b43.setOnAction(this);
			b44.setOnAction(this);
			b45.setOnAction(this);
			b46.setOnAction(this);
			b47.setOnAction(this);
			b48.setOnAction(this);
			primaryStage311.show();
		}
		if (b50 == event.getSource()) {
			Stage primaryStage31111 = new Stage();
			GridPane root71111 = new GridPane();
			root71111.setMinHeight(280);
			root71111.setMinWidth(360);
			Scene rootScene61111 = new Scene(root71111);
			primaryStage31111.setScene(rootScene61111);
			l10 = new Label("Receipt");
			b51 = new Button("Print Receipt");
			b52 = new Button("Email Receipt");
			root71111.add(l10, 50, 0);
			root71111.add(b51, 50, 15);
			root71111.add(b52, 50, 20);
			b51.setOnAction(this);
			b52.setOnAction(this);
			primaryStage31111.show();
		}
		if (b51 == event.getSource()) {
			// print receipt goes in Receipt class
			try {
				Stage primaryStage4 = new Stage();
				GridPane root10 = new GridPane();
				root10.setMinHeight(280);
				root10.setMinWidth(360);
				Scene rootScene8 = new Scene(root10);
				primaryStage4.setScene(rootScene8);
				l10 = new Label("Receipt");
				ta01 = new TextArea(r.printReceipt());
				root10.add(l10, 50, 0);
				root10.add(ta01, 50, 15);
				primaryStage4.show();
			} catch (NullPointerException g) {

			}
		}
		if (b52 == event.getSource()) {
			// email receipt goes in Receipt class
			try {
				r.emailReciept();
			} catch (NullPointerException b) {

			}

		}
	}

	/**
	 * Initializes and launches the program.
	 * 
	 * @param args
	 * @preconditions none
	 * @postconditions none
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
