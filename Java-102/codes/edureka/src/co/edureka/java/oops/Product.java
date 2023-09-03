package co.edureka.java.oops;

public class Product {
	private int productId;
	private String productName;
	private float productPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [Product ID= " + productId + " | Product Name= " + productName + " | Product Price= " + productPrice
				+ "]";
	}
	
	
}
