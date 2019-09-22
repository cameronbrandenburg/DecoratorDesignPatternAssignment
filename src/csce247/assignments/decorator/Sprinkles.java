package csce247.assignments.decorator;

/**
 * @author Cameron Brandenburg
 * A new type of topping (Sprinkles) that inherits from ToppingsDecorator
 */
public class Sprinkles extends ToppingsDecorator{
	/**
	 * Private instance variable to use an instance of IceCream
	 */
	private IceCream iceCream;
	
	/**
	 * Constructor for Sprinkles
	 * @param iceCream The instance of IceCream that is used to add toppings to
	 */
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	/**
	 * Concatenates the topping to the IceCream's toString method
	 */
	public String toString() {
		return iceCream.toString() + " + sprinkles";
	}
	
	/**
	 * Adds to the cost of the IceCream
	 * @return the cost of the ice cream including the new topping
	 */
	public double getCost() {
		return (iceCream.getCost() + 0.2);
	}
}
