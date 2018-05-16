package com.Ticket;


public class Ticket implements Runnable {
	  //设置总票数为100，这里的ticket是成员变量，
    //由于在测试类中new了一次，所以值存在一个，被三个售票窗口共享
    public void run() {
        //模拟售票
    	//同步
    	NumberClass numberClass = new NumberClass();
    	numberClass.personMethod();
    	}
      

}
