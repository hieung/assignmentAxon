package com.axon.interview.cfs.writing.event;

import com.axon.interview.cfs.writing.entity.CfsWrite;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${cfs.rabbitmq.queue}")
    String queueName;

    @Value("${cfs.rabbitmq.exchange}")
    String exchange;

    @Value("${cfs.rabbitmq.routingkey}")
    String routingkey;

    public void send(CfsWrite recordCFSWrite) {
        System.out.println("Send message to Query Database " + recordCFSWrite.toString());
        rabbitTemplate.convertAndSend(exchange, routingkey, recordCFSWrite);
    }
}
