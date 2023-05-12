package dto;

//DTO class / JavaBean 
public class ProductDTO {
	private int productId;
	private String productName;
	private Double productPrice;
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
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
	public String toString() {
		return productId+"\t"+productName+"\t"+productPrice;
	}
	
}
