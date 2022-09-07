package com.sonata.dayfour.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductList {
	List<Product> products = new ArrayList<>();
	public List<Product> getProducts() {
		products.add(new Product(01, "RayBan Sunglasses", 3499));
		products.add(new Product(02, "John Jacobs Sunglasses", 4999));
		products.add(new Product(03, "Casio Digital Watch", 6999));
		products.add(new Product(04, "Titan Analog Watch", 2999));
		products.forEach(
				(Product p1)-> {
					if(p1.getProPrice() < 0) 
						throw new RuntimeException("Price cannot be negative");
				}
		);
		return products;
	}
	public List<Product>getProductsSort() {
		List<Product> products = new ProductList().getProducts();
		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return Double.compare(o1.getProPrice(), o2.getProPrice());
			}
		});
		return products;
	}
	int prodSize() {
		return products.size();
	}
	public static void main(String args[]) {	
		System.out.println("\t\t - Before Sorting -\n" + new ProductList().getProducts() + "\n");
		System.out.println("\t\t - After Sorting -\n" + new ProductList().getProductsSort());
	}
}