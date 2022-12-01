package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) {

		FileCharDao fc = new FileCharDao();
		//fc.fileSave();
		fc.fileRead();
	}

}
