package com.vibol.corepattern.iterator12;

public class Test {

	public static void main(String[] args) {
		ProductCollection products = new ProductCollection();
		products.addProduct(new Product("IPhone"));
		products.addProduct(new Product("Samsung"));
		products.addProduct(new Product("Mac Book"));
		products.addProduct(new Product("Nokia"));

		Iterator iterator = products.createIterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product.getName());
		}

	}

}
