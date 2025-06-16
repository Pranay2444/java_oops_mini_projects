package DemoProjectEcommerce;

public class UpiPayment extends Payment{

	@Override
	public void processPayment(double amount) {
		System.out.println("processing UPI payment of"+amount);
		
	}
	

}
