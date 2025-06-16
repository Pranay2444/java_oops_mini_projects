package DemoProjectEcommerce;

public class Order {
	int orderId;
	Product product;
	int quantity;
	
	Order(int orderId, Product product, int quantity){
		this.orderId=orderId;
		this.product=product;
		this.quantity=quantity;
	}
	public double calculateTotal() {
		return product.price * quantity;	
	}
	
	public void displayOrderDetails() {
		
		System.out.println("Order details");
		System.out.println("OrderId:- "+orderId);
		System.out.println("Product:- "+product.productName);
		System.out.println("Quantity:- "+quantity);
		System.out.println("Total price= "+calculateTotal());
	}

}
