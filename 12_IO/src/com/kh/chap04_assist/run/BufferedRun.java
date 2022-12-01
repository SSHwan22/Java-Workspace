package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		BufferedDao bfd = new BufferedDao();
//		bfd.fileSave();
		bfd.fileRead();
	}

}
