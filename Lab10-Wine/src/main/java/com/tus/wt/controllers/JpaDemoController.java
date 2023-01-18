package com.tus.wt.controllers;

import com.tus.wt.dto.Wine;
import com.tus.wt.exceptions.WineNotFoundException;
import com.tus.wt.repositories.WineRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaDemoController {
	 @Autowired
	 private WineRepository wineRepository;
	
	@GetMapping("/")
	public String index() {
		return "hi there";
	}
	
	@GetMapping("/wines")
	List<Wine> getWines() {
		return wineRepository.findAll();
	}
	
	@GetMapping("/wines/{id}")
	public ResponseEntity<Wine> getWineById(@PathVariable(value = "id") Long wineId) throws WineNotFoundException {
		Optional<Wine> wine = wineRepository.findById(wineId);
		if (wine.isPresent()) {
			return ResponseEntity.ok().body(wine.get());
		} else {
			throw new WineNotFoundException("Wine not found: " + wineId);
		}
	}
	
	 @PostMapping("/wines")
	 public Wine createWine(@RequestBody Wine wine) {
		return wineRepository.save(wine);
	 }
	 
	 @DeleteMapping("/wines/{id}")
	 public void deleteWine(@PathVariable(value="id") Long wineId) {
		 wineRepository.deleteById(wineId);
	 }
	 
}
