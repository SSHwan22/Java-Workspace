package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
	
	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop() {
		super();
	}
	
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public static String getCpu() {
		return CPU;
	}

	public String getGraphic() {
		return graphic;
	}

	
	@Override
	public String toString() {
		return "Desktop [graphic=" + graphic + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
