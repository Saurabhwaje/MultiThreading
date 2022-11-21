package com.jspiders.multithreadingwaitandnotify.threads;
import com.jspiders.multithreadingwaitandnotify.threads.resources.shop;

public class Customer extends Thread {
	private shop shop;
	private int noOfProducts; // cust1=50

	public Customer(shop shop, int noOfProducts) { // cust1=50
		this.shop = shop;
		this.noOfProducts = noOfProducts;
	}

	public void run() {
		shop.purchaseProducts(noOfProducts);
	}
}
