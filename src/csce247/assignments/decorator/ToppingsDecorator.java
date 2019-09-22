package csce247.assignments.decorator;

/**
 * @author Cameron Brandenburg
 * Abstract interface that all toppings inherit from. Inherits from IceCream
 */
public abstract class ToppingsDecorator extends IceCream{
	/**
	 * Abstract method toString that overrides the default toString method
	 * @return A description of the topping
	 */
	public abstract String toString();
}
