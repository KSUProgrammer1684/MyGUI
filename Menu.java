package start;

import java.util.ArrayList;

/**
 * This class provides functionality for buttons in the account page.
 * 
 * @author Brian Baker
 *
 */
public class Menu extends Account {

	private ArrayList<String> pizzaSize;
	private ArrayList<String> sides;
	private ArrayList<String> beverages;
	private ArrayList<String> desserts;
	private ArrayList<String> style;
	private ArrayList<String> toppings;
    /**This is a constructor for the menu class
     * 
     * @param email
     * @param password
     * @param address
     * @param phoneNumber
     * @param paymentMethod
     * @param deliveryInstructions
     * 
     * @precondition: none
     * @postcondition: all variables are initialized.
     */
	public Menu(String email, String password, String address, String phoneNumber, String paymentMethod,
			String deliveryInstructions){
		super(email, password, address, phoneNumber, paymentMethod, deliveryInstructions);
		this.pizzaSize = new ArrayList<String>();
		this.sides = new ArrayList<String>();
		this.beverages = new ArrayList<String>();
		this.desserts = new ArrayList<String>();
		this.style = new ArrayList<String>();
		this.toppings = new ArrayList<String>();
	}

	/**
	 * This is a getter for pizzaSize.
	 * 
	 * @return pizzaSize
	 * @precondition none
	 * @postcondition none
	 */
	public String getPizzaSize() {
		for (String p : this.pizzaSize) {
			return p + " ";
		}
		return "";
	}

	/**
	 * This is a getter for Sides.
	 * 
	 * @return sides
	 * @precondition none
	 * @postcondition none
	 */
	public String getSides() {
		for (String s : this.sides) {
			return s + " ";
		}
		return "";
	}

	/**
	 * This is a getter for beverages.
	 * 
	 * @return beverages
	 * @precondition none
	 * @postcondition none
	 */
	public String getBeverages() {
		for (String b : this.beverages) {
			return b + " ";
		}
		return "";
	}

	/**
	 * This is a getter for desserts.
	 * 
	 * @return desserts
	 * @precondition none
	 * @postcondition none
	 */
	public String getDesserts() {
		for (String d : this.desserts) {
			return d + " ";
		}
		return "";
	}

	/**
	 * This is a getter for Style.
	 * 
	 * @return style
	 * @precondition none
	 * @postcondition none
	 */
	public String getStyle() {
		for (String gs : this.style) {
			return gs + " ";
		}
		return "";
	}

	/**
	 * This is a getter for toppings.
	 * 
	 * @return toppings
	 * @precondition none
	 * @postcondition none
	 */
	public String getToppings() {
		for (String t : this.toppings) {
			return t + " ";
		}
		return "";
	}
	/**This is a setter method for pizzaSize.
	 * 
	 * @param pizzaSize
	 * @precondition: none 
	 * @postcondition: pizzaSize is added
	 */
	public void setPizzaSize(String pizzaSize){
		this.pizzaSize.add(pizzaSize);
	}
	/**This is a setter method for sides.
	 * 
	 * @param sides
	 * @precondition: none
	 * @postcondition: sides are added
	 */
	public void setSides(String sides){
		this.sides.add(sides);
	}
	/**This is a setter for beverages.
	 * 
	 * @param beverages
	 * @precondition: none
	 * @postcondition: beverages are added
	 */
	public void setBeverages(String beverages){
		this.beverages.add(beverages);
	}
	/**This is a setter method for desserts.
	 * 
	 * @param desserts
	 * @precondition: none
	 * @postcondition: desserts are added
	 */
	public void setDesserts(String desserts){
		this.desserts.add(desserts);
	}
	/**This is a setter method for style.
	 * 
	 * @param style
	 * @precondition: none
	 * @postcondition: styles are added.
	 */
	public void setStyle(String style){
		this.style.add(style);
	}
	/**This is a setter method for toppings
	 * 
	 * @param toppings
	 * @precondition: none
	 * @postcondition: toppings are added. 
	 */
	public void setToppings(String toppings){
		this.toppings.add(toppings);
	}
}
