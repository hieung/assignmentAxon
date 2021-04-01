package com.axon.interview.cfs.writing.service;

import com.axon.interview.cfs.writing.entity.CfsWrite;
import com.axon.interview.cfs.writing.event.RabbitMQSender;
import com.axon.interview.cfs.writing.exception.WritingException;
import com.axon.interview.cfs.writing.repository.CfsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WritingService {

    @Autowired
    CfsRepository cfsRepository;

    @Autowired
    RabbitMQSender rabbitMQSender;

    public void createCfs(CfsWrite cfsWrite) throws Exception{
        CfsWrite cfsWriteRecord = cfsRepository.save(cfsWrite);
        rabbitMQSender.send(cfsWrite);
    }
}
