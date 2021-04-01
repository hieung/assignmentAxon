package com.axon.interview.cfs.subcribing.repository;

import com.axon.interview.cfs.subcribing.entity.CfsRead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CfsRepository extends JpaRepository<CfsRead, String> {

}
