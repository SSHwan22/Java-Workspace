package com.kh.chap01_frame.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame3 extends JFrame{

	public MainFrame3() {
		this.setBounds(200, 200, 500, 500);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setBounds(0, 0, 250, 500);
		panel2.setBounds(250, 0, 250, 500);
		
		// 패널의 배경색 설정 -> setBoundground를 통해 패널의 색상 지정.
		// 기본색은 투명색.
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.CYAN);
		
		// JPanel객체 생성 후 설정까지 한 후에 반드시 프레임에 직접 추가를 해줘야 함.(자동부착 X)
		this.add(panel1);
		this.add(panel2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
