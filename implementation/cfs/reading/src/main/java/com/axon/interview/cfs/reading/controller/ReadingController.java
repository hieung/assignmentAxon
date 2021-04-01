package com.axon.interview.cfs.reading.controller;

import com.axon.interview.cfs.reading.entity.CfsRead;
import com.axon.interview.cfs.reading.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ReadingController {

    @Autowired
    ReadingService readingService;

    @GetMapping("/searchCfsByResponder")
    public ResponseEntity<?> searchCfsByResponder(@RequestParam("responder") String responder,
                                                  @RequestParam("agencyId") UUID agencyId) {
        if(responder.isEmpty() || agencyId.toString().isEmpty()){
            return ResponseEntity.badRequest().body("Param could not be empty.");
        }
        return ResponseEntity.ok().body(readingService.searchCfsByResponder(responder, agencyId));
    }

    @GetMapping("/searchCfsForTimeRange")
    public ResponseEntity<?> searchCfsTimeRange(@RequestParam("from") String from,
                                            @RequestParam("to") String to,
                                            @RequestParam("agencyId") UUID agencyId, Pageable pageable) {
        if(from.isEmpty() || to.isEmpty() || agencyId.toString().isEmpty()){
            return ResponseEntity.badRequest().body("Param could not be empty.");
        }
        return ResponseEntity.ok().body(readingService.searchCfsTimeRange(from, to, agencyId, pageable));
    }

}
