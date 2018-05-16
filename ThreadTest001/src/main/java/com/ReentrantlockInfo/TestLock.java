package com.ReentrantlockInfo;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class TestLock {

	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	Lock lock = new ReentrantLock();    //注意这个地方,锁应该是全局锁
	public static void main(String[] args)  {
    final TestLock test = new TestLock();
    final TestLock test2 = new TestLock();
     
    new Thread(){
        public void run() {
        	//同一个对象
            test.insert(Thread.currentThread());
        };
    }.start();
     
    new Thread(){
        public void run() {
        	//同一个对象
            //test.insert(Thread.currentThread());
            //不同的对象
            test2.insert(Thread.currentThread());
        };
    }.start();
}  
 
public void insert(Thread thread) {
	
    lock.lock();
    try {
        System.out.println(thread.getName()+"得到了锁");
        for(int i=0;i<100;i++) {
        	System.out.println(thread.getName()+"再循环锁");
        }
    } catch (Exception e) {
        // TODO: handle exception
    }finally {
        System.out.println(thread.getName()+"释放了锁");
        lock.unlock();
    }
}



}
