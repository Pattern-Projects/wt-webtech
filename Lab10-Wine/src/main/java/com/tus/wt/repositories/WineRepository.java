package com.tus.wt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tus.wt.dto.Wine;

@Repository
public interface WineRepository extends JpaRepository<Wine, Long>{
	
}
