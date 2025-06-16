package DemoProjectEcommerce;

public class Cart {
	public void addProduct(int productId) {
		System.out.println("added product "+"with productId" +productId);
	}
	public void addProduct(int productId, int quantity) {
		System.out.println(quantity +" units of product" +" worth " +productId+" added to the cart");
	}
	public void addCart(String productName, double price) {
		System.out.println("Product"+ productName+ " worth"+ price +" added to the cart" );
	}

}
