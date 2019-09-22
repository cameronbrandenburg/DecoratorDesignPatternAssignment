package csce247.assignments.decorator;

/**
 * @author Cameron Brandenburg
 * A new type of ice cream (Strawberry) that inherits from IceCream
 */
public class StrawberryIceCream extends IceCream{
	/**
	 * Private instance variable to store the cost
	 * Used for the getCost method to avoid using magic numbers
	 */
	private double cost = 0.9;
	
	/**
	 * Constructor for StrawberryIceCream
	 * Sets the description of the superclass 
	 */
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	
	/**
	 * Returns the cost of the Strawberry Ice Cream
	 */
	public double getCost() {
		return cost;
		
	}
}
