package com.axon.interview.cfs.subcribing.service;

import com.axon.interview.cfs.subcribing.entity.CfsRead;
import com.axon.interview.cfs.writing.entity.CfsWrite;
import com.axon.interview.cfs.subcribing.repository.CfsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngestingService {

    @Autowired
    CfsRepository cfsRepository;

    public void ingestCfs(CfsWrite cfsWrite) {
        CfsRead cfsRead = convertCfsWriteToCfsRead(cfsWrite);
        cfsRepository.save(cfsRead);
        System.out.println("Ingest to READ: "+cfsRead.toString());
    }

    private CfsRead convertCfsWriteToCfsRead(CfsWrite cfsWrite) {
        CfsRead cfsRead = new CfsRead();
        cfsRead.setEvent_id(cfsWrite.getEvent_id());
        cfsRead.setAgencyId(cfsWrite.getAgencyId());
        cfsRead.setEventNumber(cfsWrite.getEventNumber());
        cfsRead.setEventTypeCode(cfsWrite.getEventTypeCode());
        cfsRead.setEventTime(cfsWrite.getEventTime());
        cfsRead.setDispatchTime(cfsWrite.getDispatchTime());
        cfsRead.setResponder(cfsWrite.getResponder());
        cfsRead.setUserId(cfsWrite.getUserId());
        return cfsRead;
    }
}
