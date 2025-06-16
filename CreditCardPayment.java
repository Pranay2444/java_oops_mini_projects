package DemoProjectEcommerce;

public class CreditCardPayment extends Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("processsing credit card payment of "+amount);
	}
	

}
