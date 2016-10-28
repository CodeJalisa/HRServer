package com.jalisanarmard.repository;

import com.jalisanarmard.domain.TimeCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TimeCardRepository extends JpaRepository<TimeCard, Long> {

}
