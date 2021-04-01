package com.axon.interview.cfs.reading.service;

import com.axon.interview.cfs.reading.entity.CfsRead;
import com.axon.interview.cfs.reading.repository.CfsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;


@Service
public class ReadingService {

    @Autowired
    CfsRepository cfsRepository;

    public List<CfsRead> searchCfsByResponder(String responder, UUID agencyId) {
        return cfsRepository.findByResponderAndAgencyId(responder, agencyId);
    }

    public Page<CfsRead> searchCfsTimeRange(String from, String to, UUID agencyId, Pageable pageable) {
        return cfsRepository.findByEventTimeBetweenAndAgencyId(Timestamp.valueOf(from), Timestamp.valueOf(to) , agencyId, pageable);
    }
}
