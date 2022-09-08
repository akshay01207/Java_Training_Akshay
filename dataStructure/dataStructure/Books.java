package com.dataStructure;

public class Books {

		private int bid;
		private String name;
		private double price;
		
//getter setter
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
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
		public void Books(int id, String name, double price) {
			this.bid=bid;
			this.name=name;
			this.price=price;

		}
		public Books(){
			public display() {
				System.out.println(bid + " " + name + " " + price);
			}
		
	}
		
}