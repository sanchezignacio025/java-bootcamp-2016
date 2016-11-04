package topic3;

public class CardShop {
	
	    private int id;
	    private float price; 
	    private String description;
	 	private int stock;
	 		
	 	public CardShop(int id, float price, String description, int stock ){
	 		
	 		this.setId(id);
	 		this.setPrice(price);
	 		this.setDescription(description);
	 		this.setStock(stock);
	 		
	 			
	 	}
	 	
		public int getId() {
	 		return id;
	 	}
	 	public void setId(int id) {
	 		this.id = id;
	 	}
	 	
	    public float getPrice() {
	 		return price;
	 	}
	 	public void setPrice(float price) {
	 		this.price = price;
	 	}
	 	public String getDescription() {
	 		return description;
	 	}
	 	public void setDescription(String description) {
	 		this.description = description;
	 	}
	 	public int getStock() {
	 		return stock;
	 	}
	 	public void setStock(int stock) {
	 		this.stock = stock;
	 	}
	 
	 	
	 
	 }