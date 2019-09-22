package csce247.assignments.decorator;
/**
 * @author CameronBrandenburg
 * Abstract base class for ice cream
 */
public abstract class IceCream {
	/**
	 * Protected instance variable for the description
	 */
	protected String description;
	
	/**
	 * Returns the description of the IceCream
	 */
	public String toString() {
		return description;
	}
	
	/**
	 * Returns the cost of the IceCream
	 * @return the cost of the IceCream
	 */
	public abstract double getCost();
}
