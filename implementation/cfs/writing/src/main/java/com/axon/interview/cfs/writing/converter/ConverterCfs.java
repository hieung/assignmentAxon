package com.axon.interview.cfs.writing.converter;

import com.axon.interview.cfs.writing.dto.CfsDTO;
import com.axon.interview.cfs.writing.entity.CfsWrite;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
public class ConverterCfs {

    public CfsWrite getCfsFromDTO(CfsDTO cfsDTO) {
        CfsWrite cfsWrite =  new CfsWrite();
        cfsWrite.setAgencyId(cfsDTO.getAgencyId());
        cfsWrite.setUserId(cfsDTO.getUserId());
        cfsWrite.setEventNumber(cfsDTO.getEventNumber());
        cfsWrite.setEventTypeCode(cfsDTO.getEventTypeCode());
        cfsWrite.setEventTime(Timestamp.valueOf(cfsDTO.getEventTime()));
        cfsWrite.setDispatchTime(Timestamp.valueOf(cfsDTO.getDispatchTime()));
        cfsWrite.setResponder(cfsDTO.getResponder());
        return cfsWrite;
    }
}
