package com.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class FilteringCollection {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "Coke", 12.00F));
		list.add(new Product(102, "Pepsi", 18.00F));
		list.add(new Product(103, "Fanta", 22.00F));
		list.add(new Product(104, "Coke", 35.00F));
		list.add(new Product(105, "Coke", 76.00F));
		List<Float> productPrice = list.stream()
				.filter(p -> p.price > 36)
				.map(p -> p.price)
				.collect(Collectors.toList());

		System.out.println(productPrice);
	}

}
