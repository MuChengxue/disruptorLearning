package com.hustmcx.learning.chain;

import com.lmax.disruptor.EventTranslator;
import com.lmax.disruptor.dsl.Disruptor;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class TradePushlisher implements Runnable {

	private Disruptor<Order> disruptor;
	private CountDownLatch latch;
	
	private static int PUBLISH_COUNT = 1;
	
	public TradePushlisher(CountDownLatch latch, Disruptor<Order> disruptor) {
		this.disruptor = disruptor;
		this.latch = latch;
	}

	public void run() {
		
		TradeEventTranslator eventTranslator = new TradeEventTranslator();
		for(int i =0; i < PUBLISH_COUNT; i ++){
			//新的提交任务的方式
			disruptor.publishEvent(eventTranslator);			
		}
		latch.countDown();
	}
}


class TradeEventTranslator implements EventTranslator<Order> {

	private Random random = new Random();

	@Override
	public void translateTo(Order event, long sequence) {
		this.generateTrade(event);
	}

	private void generateTrade(Order event) {
		event.setPrice(random.nextDouble() * 9999);
	}
	
}











