package cn.pyc.ch21.exercise;

public class MoreBasicThreads {

	public static void main(String[] args) {		
		for(int i = 0 ;i < 5;i++) {
			new Thread(new LiftOff()).start();		//初始化并启动多个线程			
		}
		
		System.out.println("Waiting for LiftOff");
	}

}
