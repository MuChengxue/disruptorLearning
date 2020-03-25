package com.hustmcx.learning.chain;

import com.lmax.disruptor.EventHandler;

import java.util.UUID;

public class Handler2 implements EventHandler<Order> {

	public void onEvent(Order event, long sequence, boolean endOfBatch) throws Exception {
		System.err.println("handler 2 SET ID ...");
		Thread.sleep(2000);
		event.setId(UUID.randomUUID().toString());
		System.err.println("handler 2 SET ID "+event.getId());

	}

}
