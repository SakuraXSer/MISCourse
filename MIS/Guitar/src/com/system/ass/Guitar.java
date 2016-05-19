package com.system.ass;

public class Guitar {
	private String serialNumber;
	private double price;
	private String builder;
	private String type;
	private String backWood;
	private String topWood;
	private String model;
	private int numStrings;
	
	
	public Guitar(String serialNumber, double price, String builder,  String model, String type, int numStrings, String backWood, String topWood){
		
		this.setSerialNumber(serialNumber);
		this.setPrice(price);
		this.setBuilder(builder);
		this.setType(type);
		this.setBackWood(backWood);
		this.setTopWood(topWood);
		this.setModel(model);
		this.setNumStrings(numStrings);
	}

	public Guitar() {
		// TODO Auto-generated constructor stub
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	
}
