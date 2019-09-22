package csce247.assignments.decorator;

/**
 * @author Cameron Brandenburg
 * A new type of ice cream (Vanilla) that inherits from IceCream
 */
public class VanillaIceCream extends IceCream{
	/**
	 * Private instance variable to store the cost
	 * Used for the getCost method to avoid using magic numbers
	 */
	private double cost = 0.75;
	
	/**
	 * Constructor for VanillaIceCream
	 * Sets the description of the superclass 
	 */
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}
	
	/**
	 * Returns the cost of the Vanilla Ice Cream
	 */
	public double getCost() {
		return cost;
		
	}
}
