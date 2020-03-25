package com.hustmcx.learning.chain;

import com.lmax.disruptor.EventHandler;

public class Handler5 implements EventHandler<Order> {

	public void onEvent(Order event, long sequence, boolean endOfBatch) throws Exception {
		System.err.println("handler 5 GET PRICE: " +  event.getPrice());
		Thread.sleep(1000);
		event.setPrice(event.getPrice() + 3.0);
		System.err.println("handler 5 GET PRICE: " +  event.getPrice());

	}

}
