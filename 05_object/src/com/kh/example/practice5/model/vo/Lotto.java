package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto = new int[6];
	
	//초기화 블럭
	{
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
	}
	
	public Lotto() {}
	
	public void information() {
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
