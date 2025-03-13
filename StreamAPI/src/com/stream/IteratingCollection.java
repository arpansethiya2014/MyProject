package com.stream;

import java.util.ArrayList;
import java.util.List;

public class IteratingCollection {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "Coke", 12.00F));
		list.add(new Product(102, "Pepsi", 18.00F));
		list.add(new Product(103, "Fanta", 22.00F));
		list.add(new Product(104, "Coke", 35.00F));
		list.add(new Product(105, "Coke", 76.00F));
		list.stream()
		.filter(product->product.price >= 35 || product.price == 18)
		.forEach(product-> System.out.println(product));
	}
}
