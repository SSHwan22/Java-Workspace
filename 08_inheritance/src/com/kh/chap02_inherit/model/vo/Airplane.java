package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	
	private int tire;
	private int wing;
	
	public Airplane() {
	}
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	@Override //<- 메타데이터
	public String information() {
		return super.information()+", tire : "+tire+", wing : "+wing;
	}
	
	@Override 
	public void howToMove() {
		System.out.println("바퀴를 떼굴떼굴 굴리면서 달리다가 날개를 피면서 움직인다.");
	}
	
	
}
