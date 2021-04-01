package com.axon.interview.cfs.writing.repository;

import com.axon.interview.cfs.writing.entity.CfsWrite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CfsRepository extends JpaRepository<CfsWrite, String> {

}
