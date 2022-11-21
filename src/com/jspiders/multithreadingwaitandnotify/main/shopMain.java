package com.jspiders.multithreadingwaitandnotify.main;

import com.jspiders.multithreadingwaitandnotify.threads.*;
import com.jspiders.multithreadingwaitandnotify.threads.resources.shop;

public class shopMain {
	public static void main(String[] args) {
		shop shop = new shop(100);
		Customer customer = new Customer(shop, 50);
		Customer customer2 = new Customer(shop, 50);
		supplier suppliers = new supplier(shop, 100);

		customer.start();
		customer2.start();
		suppliers.start();
	}
}
