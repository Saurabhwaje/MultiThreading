package com.jspiders.multithreadingwaitandnotify.threads;

import com.jspiders.multithreadingwaitandnotify.threads.resources.shop;

public class supplier extends Thread {
	private shop shop;
	private int noOfProducts;

	public supplier(shop shop, int noOfProducts) {
		this.shop = shop;
		this.noOfProducts = noOfProducts;
	}

	@Override
	public void run() {
		shop.restockProducts(noOfProducts);
	}
}
