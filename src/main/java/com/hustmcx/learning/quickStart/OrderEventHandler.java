package com.hustmcx.learning.quickStart;

import com.lmax.disruptor.EventHandler;

public class OrderEventHandler implements EventHandler<OrderEvent>{

	public void onEvent(OrderEvent event, long sequence, boolean endOfBatch) throws Exception {
//		Thread.sleep(Integer.MAX_VALUE);//这里是为了方便debugringbuffer.next()
		System.err.println("消费者: " + event.getValue());
	}

}
