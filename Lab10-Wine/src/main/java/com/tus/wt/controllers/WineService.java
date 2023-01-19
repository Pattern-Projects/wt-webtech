package com.tus.wt.controllers;

import com.tus.wt.dto.Wine;
import com.tus.wt.exceptions.WineNotFoundException;
import com.tus.wt.repositories.WineRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WineService {
	 @Autowired
	 private WineRepository wineRepository;
	
	@GetMapping("/")
	public String index() {
		return "<button>Import</button>";
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
	
	@RequestMapping("/wines/name/{name}")
	public ResponseEntity<List<Wine>> getWineByName(@PathVariable("name") String name) {
		List<Wine> winesByName = new ArrayList<>();
		winesByName = wineRepository.findByNameContaining(name);
		if (winesByName.size()>0) {
			return new ResponseEntity(winesByName, HttpStatus.OK);
		} else {
			return new ResponseEntity(winesByName, HttpStatus.NO_CONTENT);			
		}
	}
	
	 @PostMapping("/wines")
	 public Wine createWine(@RequestBody Wine wine) {
		return wineRepository.save(wine);
	 }
	 
	 @PutMapping("/wines/{id}")
	 public ResponseEntity<Wine> updateWine(@PathVariable(value = "id") Long wineId, @RequestBody Wine wine) throws WineNotFoundException {
			Optional<Wine> savedWine = wineRepository.findById(wineId);
			if (savedWine.isPresent()) {
				wine.setId(wineId);
				wineRepository.save(wine);
				return ResponseEntity.ok().body(savedWine.get());
			} else {
				throw new WineNotFoundException("Wine not found: " + wineId);
			}
	 }
	 
	 @DeleteMapping("/wines/{id}")
	 public void deleteWine(@PathVariable(value="id") Long wineId) {
		 wineRepository.deleteById(wineId);
	 }
	 
}
