package com.bhavna.exception;

import java.util.*;

public class Item {
	static Scanner sc = new Scanner(System.in);
	private int itemId;
	private String name;
	private double price;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item(int itemId, String name, double price) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public static void addItems() {
		try {
			ArrayList<Item> itemList = new ArrayList<Item>();

			Item item1 = new Item(101, "fruit", 200);
			Item item2 = new Item(102, "Drink", 100);
			Item item3 = new Item(103, "Dairy", 400);
			Item item4 = new Item(104, "Clothes", 2000);

			itemList.add(item1);
			itemList.add(item2);
			itemList.add(item3);
			itemList.add(item4);
			if (itemList.isEmpty()) {

				throw new CartEmptyException();
			} else {
				for (Item var : itemList) {
					System.out.println(var.itemId + " " + var.name + " " + var.price);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
