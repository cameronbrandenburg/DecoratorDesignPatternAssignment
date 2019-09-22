package csce247.assignments.decorator;

/**
 * @author Cameron Brandenburg
 * A new type of topping (ChocolateChips) that inherits from ToppingsDecorator
 */
public class ChocolateChips extends ToppingsDecorator{
	/**
	 * Private instance variable to use an instance of IceCream
	 */
	private IceCream iceCream;
	
	/**
	 * Constructor for ChocolateChips
	 * @param iceCream The instance of IceCream that is used to add toppings to
	 */
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	/**
	 * Concatenates the topping to the IceCream's toString method
	 */
	public String toString() {
		return iceCream.toString() + " + chocolate chips";
	}
	
	/**
	 * Adds to the cost of the IceCream
	 * @return the cost of the ice cream including the new topping
	 */
	public double getCost() {
		return (iceCream.getCost() + 0.3);
	}
}
