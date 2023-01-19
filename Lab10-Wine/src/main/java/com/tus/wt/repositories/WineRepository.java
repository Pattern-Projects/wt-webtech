package com.tus.wt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tus.wt.dto.Wine;

@Repository
public interface WineRepository extends JpaRepository<Wine, Long>{
	List<Wine> findByName(String name);
	List<Wine> findByNameContaining(String name);
	
}
