package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String productName;
	private int price;
	public Product(String productName, int price) {
		//super();
		this.productName = productName;
		this.price = price;
	}
	protected Product(String productName2, Integer price2) {
		// TODO Auto-generated constructor stub
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
			List<String> productList = new ArrayList<>();
			productList.add("Apple MacBook Pro");
			productList.add("Apple MacBook Air");
			productList.add("Apple iPhone 12");
			return productList;
	}
}
