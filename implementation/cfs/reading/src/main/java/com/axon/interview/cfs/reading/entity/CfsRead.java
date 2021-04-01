package com.axon.interview.cfs.reading.entity;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "cfs_read", uniqueConstraints = @UniqueConstraint(columnNames = {"event_number", "event_type_code", "event_time"}))
@FieldNameConstants
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CfsRead implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "event_id")
    private UUID event_id;

    @Column(name = "agency_id")
    private UUID agencyId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "event_number")
    private String eventNumber;

    @Column(name = "event_type_code")
    private String eventTypeCode;

    @Column(name = "event_time")
    private Timestamp eventTime;

    @Column(name = "dispatch_time")
    private Timestamp dispatchTime;

    @Column(name = "responder")
    private String responder;

}
