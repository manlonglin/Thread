package com.ReentrantlockInfo;

import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Test {

	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	
	public static void main(String[] args)  {
        final Test test = new Test();
         //同一个对象进行同步操作
        new Thread(){
            public void run() {
                test.get(Thread.currentThread());
            };
        }.start();
         
        new Thread(){
            public void run() {
                test.get(Thread.currentThread());
            };
        }.start();
         
    }  
	
	public synchronized void get(Thread thread) {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start <= 1) {
            System.out.println(thread.getName()+"正在进行读操作");
        }
        System.out.println(thread.getName()+"读操作完毕");
    }



}
