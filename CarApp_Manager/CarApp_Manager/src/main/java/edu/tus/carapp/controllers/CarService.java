package edu.tus.carapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.tus.carapp.dto.Car;
import edu.tus.carapp.exceptions.CarNotFoundException;

import edu.tus.carapp.dao.CarRepository;

@RestController
public class CarService {
	@Autowired
	private CarRepository carRepo;
	
	@GetMapping("/cars")
	public Iterable<Car> getAllCars(){
		return carRepo.findAll();
}
	@RequestMapping("/cars/{id}")
	public Optional<Car> getCarById(@PathVariable("id")Long id){
		Optional<Car> car = carRepo.findById(id);
		if(car.isPresent()) {		
		return car;
	}else {
			throw new CarNotFoundException("No car with id:"+id);		
			}
	}
	@RequestMapping("/cars/car/{make}")
	public ResponseEntity<List<Car>> getCarByMake(@PathVariable("make")String make){
		List<Car> carsByMake = new ArrayList<>();
		//carsByMake=carRepo.findByMake(make); this is exact match
		carsByMake=carRepo.findByMakeContaining(make);
		if(carsByMake.size()>0){
		return new ResponseEntity(carsByMake, HttpStatus.OK);
	}else {
			return new ResponseEntity(carsByMake,HttpStatus.NO_CONTENT);		
			}
	}
	
	@RequestMapping("/cars/search/year/{start}/{end}")
	public ResponseEntity<List<Car>> getCarByYearBetween(@PathVariable("start")int start, @PathVariable("end")int end){
		List<Car> carsBetweenYears = new ArrayList<>();
		carsBetweenYears=carRepo.findByYearBetween(start, end);
		if(carsBetweenYears.size()>0){
		return new ResponseEntity<List<Car>>(carsBetweenYears, HttpStatus.OK);
	}else {
			return new ResponseEntity(carsBetweenYears,HttpStatus.NO_CONTENT);		
			}
	}
	@RequestMapping("/cars/price/{start}/{end}")
	public ResponseEntity<List<Car>> getCarByPriceBetween(@PathVariable("start")int start, @PathVariable("end")int end){
		List<Car> carsBetweenPrices = new ArrayList<>();
		carsBetweenPrices=carRepo.findByPriceBetween(start, end);
		if(carsBetweenPrices.size()>0){
		return new ResponseEntity<List<Car>>(carsBetweenPrices, HttpStatus.OK);
	}else {
			return new ResponseEntity(carsBetweenPrices,HttpStatus.NO_CONTENT);		
			}
	}
	}
