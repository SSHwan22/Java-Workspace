package com.kh.practice.score.model.vo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt", true))) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			dos.flush();
			dos.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public DataInputStream readScore() throws FileNotFoundException{
		DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"));
		return dis;
	}
}
