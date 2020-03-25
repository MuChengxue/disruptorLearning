package com.hustmcx.learning.chain;

import com.lmax.disruptor.EventHandler;

public class Handler3 implements EventHandler<Order> {

	public void onEvent(Order event, long sequence, boolean endOfBatch) throws Exception {
		System.err.println("handler 3 GETTING INFO : NAME: "
								+ event.getName() 
								+ ", ID: " 
								+ event.getId()
								+ ", PRICE: " 
								+ event.getPrice()
								+ " INSTANCE : " + event.toString());
	}

}
