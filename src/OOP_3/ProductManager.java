package OOP_3;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	List<Product> products;

	public ProductManager() {
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void updateProduct(Long idToUpdate, String newName, Double newPrice, Integer newQuantity,
			Category newCategory) {
		for (Product product : products) {
			if (product.id.equals(idToUpdate)) {
				product.nameP = newName;
				product.price = newPrice;
				product.quantity = newQuantity;
				product.category = newCategory;
				return;
			}
		}
		System.out.println("Không tìm thấy sản phẩm !!");
	}

	public void deleteProduct(Long id) {
		products.removeIf(product -> product.id.equals(id));
	}

	public Product getProductById(Long id) {
		for (Product product : products) {
			if (product.id.equals(id)) {
				return product;
			}
		}
		return null;
	}

	public void displayAllProducts() {
		for (Product product : products) {
			System.out.println(product.id + " / " + product.nameP + " / " + product.price + " / " + product.quantity
					+ " / " + product.category.nameC);
		}
	}

	public void displayProductsByCategory(String category) {
		for (Product product : products) {
			if (product.category.nameC.equals(category)) {
				System.out.println(product.id + " / " + product.nameP + " / " + product.price + " / " + product.quantity
						+ " / " + product.category.nameC);
			}
		}
	}

	public void showByPrice(Double price) {
		for (Product product : products) {
			if (product.price > price) {
				System.out.println(product.id + " / " + product.nameP + " / " + product.price + " / " + product.quantity
						+ " / " + product.category.nameC);
			}else {
				System.out.println("Không có sản phẩm phù hợp");
			}
		}
	}

	public void showByPriceAndCategory(Double price, String categoryName) {
		for (Product product : products) {
			if (product.price > price && product.category.nameC.equals(categoryName)) {
				System.out.println(product.id + " / " + product.nameP + " / " + product.price + " / " + product.quantity
						+ " / " + product.category.nameC);
			}else {
				System.out.println("Không có sản phẩm phù hợp");
			}
		}
	}
}
