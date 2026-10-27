/* Abstraction in Java: Abstraction hides implementation details and exposes only essential functionality.
- payment is an abstract class containing an abstract method pay() and a concrete method display().
- UPI and Card extend payment and provide their own implementations of pay().
- payment p1 = new UPI(); uses a parent-class reference to refer to a child-class object.
- This supports runtime polymorphism, allowing the same reference type to work with different payment methods
A concrete class must provide implementations for all inherited abstract methods; an abstract class can leave them for a subclass.*/


abstract class payment
{
    abstract void pay(double amount);
    
    void display()
    {
        System.out.println("Payment processing...");
    }
}
class UPI extends payment{
    @Override
    void pay(double amount)
    {
        System.out.println(amount+" "+"is processing from UPI");
    }
}

class Card extends payment
{
    @Override
    void pay(double amount)
    {
        System.out.println(amount+" "+"is processing from card");
    }
}
public class Main
{
	public static void main(String[] args) {
		payment p1 = new UPI();
        p1.display();
        p1.pay(500);

        payment p2 = new Card();
        p2.display();
        p2.pay(1000);
	}
}
