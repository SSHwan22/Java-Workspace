package com.kh.chap03_sync.sync;

public class Producer extends Thread{

	private Buffer buffer;
	
	public Producer() {
		
	}
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				buffer.setData(i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
