package com.jspiders.multithreadingwaitandnotify.threads.resources;

public class shop {
	int noOfProducts; // 100

	public shop(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public synchronized void restockProducts(int restockProducts) {
		noOfProducts += restockProducts;
		System.out.println(restockProducts + " Successfully added.");
		System.out.println("Available products " + noOfProducts);
		this.notify();
	}

	public synchronized void purchaseProducts(int purchaseProducts) {
		if (noOfProducts < purchaseProducts) {
			System.out.println(purchaseProducts + " Available products");
		}
		try {
			this.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		noOfProducts -= purchaseProducts;
		System.out.println(purchaseProducts + " Successfully purchased.");
		System.out.println("Now available products " + noOfProducts);
	}
}
