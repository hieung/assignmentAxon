package com.axon.interview.cfs.reading.repository;

import com.axon.interview.cfs.reading.entity.CfsRead;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Repository
public interface CfsRepository extends JpaRepository<CfsRead, String> {

    // Use for @query
//    @Query("SELECT e FROM CfsRead e WHERE e.responder = ?1 AND e.agencyId = ?2")
//    List<CfsRead> findByResponder(String responder, UUID agencyId);
    List<CfsRead> findByResponderAndAgencyId(String responder, UUID agencyId);

      // Use for @query
//    @Query("SELECT e FROM CfsRead e WHERE e.eventTime  < ?1 AND e.eventTime > ?2 AND agencyId = ?3")
//    Page<CfsRead> searchCfsTimeRange(Timestamp from, Timestamp to, UUID agencyId, Pageable pageable);

    Page<CfsRead> findByEventTimeBetweenAndAgencyId(Timestamp from, Timestamp to, UUID agencyId, Pageable pageable);
}
