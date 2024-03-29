package com.tus.wt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tus.wt.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findByBrandContaining(String brand);

	List<Product> findByTypeContaining(String type);

}
