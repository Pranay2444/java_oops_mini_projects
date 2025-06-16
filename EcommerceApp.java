package DemoProjectEcommerce;

public class EcommerceApp {

	public static void main(String[] args) {
		 
		Cart cart = new Cart();

		cart.addProduct(111);
		cart.addProduct(112, 7);
		cart.addCart("MacBook", 112330.00);
		
		Product p1 = new Product(201, "Laptop", 55000);
		
		Order order = new Order(201, p1,10);
		order.displayOrderDetails();
		
		//choosing payment method
		Payment payment;
		
		payment = new CreditCardPayment();
		payment.processPayment(order.calculateTotal());
		
		payment = new UpiPayment();
		payment.processPayment(order.calculateTotal());
	}
	

}
