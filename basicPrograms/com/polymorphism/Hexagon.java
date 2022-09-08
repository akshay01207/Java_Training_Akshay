package com.polymorphism;

public class Hexagon extends Shape{
	public Hexagon(String shapeName) {
		super(shapeName);
		// TODO Auto-generated constructor stub
	}
		int side;
		public Hexagon(int side) {
			super("Hexagon");
			this.side=side;
			
		}
		public int getSide() {
			return side;
		}
		public void setSide(int side) {
			this.side=side;
		}

}
