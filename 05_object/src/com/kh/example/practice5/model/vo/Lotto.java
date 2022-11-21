package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	private int[] lotto = new int[6];
	
	//초기화 블럭
	{
		for(int i=0;i<lotto.length;i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {//i배열보다 작은 j의 배열로 비교해서 중복이 있으면 i--로 앞에서 부터 다시
						i--;
						break;
					}
				}
				}
			}
	
	public Lotto() {
			super();
	}

	
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public int[] getLotto() {
		return lotto;
	}
	
	
	public void information() {
//		for(int i=0;i<lotto.length;i++) {
//			System.out.print(lotto[i]+" ");
//		}
//	}
	System.out.println(Arrays.toString(lotto));
}
	}

