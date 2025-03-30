package com.spring.java.wikievent.repository;

import com.spring.java.wikievent.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {}
