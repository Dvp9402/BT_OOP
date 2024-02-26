package OOP_3;

public class Product extends Category {
	Long id;
	String nameP;
	Double price;
	Integer quantity;
	Category category;
	public Product(String nameC, Long id, String nameP, Double price, Integer quantity, Category category) {
		super(nameC);
		this.id = id;
		this.nameP = nameP;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	public Product(long id, String nameC, double price, int quantity, Category category) {
		super(nameC);
		this.id = id;
		this.nameP = nameC;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
		
}
