package com.hustmcx.learning.chain;

import com.lmax.disruptor.EventHandler;

public class Handler4 implements EventHandler<Order> {

	public void onEvent(Order event, long sequence, boolean endOfBatch) throws Exception {
		System.err.println("handler 4 SET PRICE ...");
		Thread.sleep(1000);
		event.setPrice(17.0);
		System.err.println("handler 4 SET PRICE "+event.getPrice());

	}

}
