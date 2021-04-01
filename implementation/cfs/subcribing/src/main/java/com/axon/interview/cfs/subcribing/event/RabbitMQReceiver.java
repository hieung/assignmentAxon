package com.axon.interview.cfs.subcribing.event;

import com.axon.interview.cfs.subcribing.service.IngestingService;
import com.axon.interview.cfs.writing.entity.CfsWrite;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQReceiver {

    @Autowired
    IngestingService ingestingService;

    @RabbitListener(queues = "cfs.queue")
    public void listen(CfsWrite cfsWrite) {
        System.out.println("Receive message from cfsRead.queue " + cfsWrite.toString());
        ingestingService.ingestCfs(cfsWrite);
    }
}
