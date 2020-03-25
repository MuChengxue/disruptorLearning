package com.hustmcx.learning.chain;

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

public class Handler1 implements EventHandler<Order>, WorkHandler<Order>{

	//EventHandler
	public void onEvent(Order event, long sequence, boolean endOfBatch) throws Exception {
		this.onEvent(event);
	}

	//WorkHandler
	public void onEvent(Order event) throws Exception {
		System.err.println("handler 1 SET NAME ...");
		Thread.sleep(1000);
		event.setName("H1");
		System.err.println("handler 1 SET NAME  "+event.getName());

	}

}
