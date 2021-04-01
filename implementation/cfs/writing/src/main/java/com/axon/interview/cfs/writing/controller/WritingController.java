package com.axon.interview.cfs.writing.controller;

import com.axon.interview.cfs.writing.converter.ConverterCfs;
import com.axon.interview.cfs.writing.dto.CfsDTO;
import com.axon.interview.cfs.writing.entity.CfsWrite;
import com.axon.interview.cfs.writing.exception.WritingException;
import com.axon.interview.cfs.writing.service.WritingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WritingController {

    @Autowired
    WritingService writingService;

    @PostMapping("/cfs")
    public ResponseEntity<?> createCfs(@RequestBody CfsDTO cfsDTO) {
        try {
            CfsWrite cfsWrite = new ConverterCfs().getCfsFromDTO(cfsDTO);
            writingService.createCfs(cfsWrite);
            return ResponseEntity.ok("New CFS is created.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("CFS could not created. Unique Key: (eventNumber, eventTypeCode, eventTime)");
        }
    }

}
