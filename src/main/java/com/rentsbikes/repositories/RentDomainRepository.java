package com.rentsbikes.repositories;

import com.rentsbikes.domain.RentDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentDomainRepository  extends JpaRepository<RentDomain, Long> {
}
