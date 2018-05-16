package com.ReentrantlockInfo;


public class ThreadDemo01 {

	public static void main(String[] args) {
        //创建Ticket的Runnable对象
        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        //创建线程3个对象模拟三个售票窗口，并把Runnable对象加入Thread和给Thread命名
        /*new Thread(ticket,"窗口1").start();
        new Thread(ticket2,"窗口2").start();
        new Thread(ticket3,"窗口3").start();*/
        new Thread(ticket,"窗口1").start();
        new Thread(ticket2,"窗口2").start();
        new Thread(ticket3,"窗口3").start();


    }



}
