package com.hustmcx.learning.netty_disruptor;

import com.hustmcx.learning.netty_disruptor.com.disruptor.MessageConsumer;
import com.hustmcx.learning.netty_disruptor.com.disruptor.RingBufferWorkerPoolFactory;
import com.hustmcx.learning.netty_disruptor.server.MessageConsumerImpl4Server;
import com.hustmcx.learning.netty_disruptor.server.NettyServer;
import com.lmax.disruptor.YieldingWaitStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.dsl.ProducerType;

@SpringBootApplication
public class NettyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NettyServerApplication.class, args);
		
		MessageConsumer[] conusmers = new MessageConsumer[4];
		for(int i =0; i < conusmers.length; i++) {
			MessageConsumer messageConsumer = new MessageConsumerImpl4Server("code:serverConsumerId:" + i);
			conusmers[i] = messageConsumer;
		}
		RingBufferWorkerPoolFactory.getInstance().initAndStart(ProducerType.MULTI,
				1024*1024,
//				new YieldingWaitStrategy(),
				new BlockingWaitStrategy(),
				conusmers);
		
//		new NettyServer().start();
		NettyServer.getInstance().start();
	}
}
