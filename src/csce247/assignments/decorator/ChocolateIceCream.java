package csce247.assignments.decorator;

/**
 * @author Cameron Brandenburg
 * A new type of ice cream (Chocolate) that inherits from IceCream
 */
public class ChocolateIceCream extends IceCream{
	/**
	 * Private instance variable to store the cost
	 * Used for the getCost method to avoid using magic numbers
	 */
	private double cost = 0.9;
	
	/**
	 * Constructor for ChocolateIceCream
	 * Sets the description of the superclass 
	 */
	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}
	
	/**
	 * Returns the cost of the Chocolate Ice Cream
	 */
	public double getCost() {
		return cost;
		
	}
}
