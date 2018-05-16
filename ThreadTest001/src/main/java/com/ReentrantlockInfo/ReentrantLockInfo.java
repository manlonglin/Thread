package com.ReentrantlockInfo;

import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ReentrantLockInfo {
	
	public static  int ticket=100;
	ReentrantReadWriteLock  lock = new ReentrantReadWriteLock (true);
	public void personMethod(){
		while(true) {
            //如果票数大于0，继续售票
			//同步
			synchronized(ReentrantLockInfo.class){
				 if(ticket>0) {
		                //为了让线程安全问题效果明显些，加入线程定时休眠Thread.sleep()
		                try {
		                    Thread.sleep(100);
		                } catch (InterruptedException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		                }
		                //Thread.currentThread()是线程获取当前线程对象的方法    getName()获取调用者的线程名
		                System.out.println(Thread.currentThread().getName()+"正在售票:"+ticket--);
		            }
			}
           
        }
	}



}
