package com.axon.interview.cfs.writing.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CfsDTO {

    private UUID agencyId;

    private String userId;

    private String eventNumber;

    private String eventTypeCode;

    private String eventTime;

    private String dispatchTime;

    private String responder;

}
