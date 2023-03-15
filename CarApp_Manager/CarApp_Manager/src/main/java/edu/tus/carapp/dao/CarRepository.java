package edu.tus.carapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.tus.carapp.dto.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
//List<Car> findByMake(String name);
List<Car> findByMakeContaining(String make);

@Query("Select c FROM Car c WHERE year >=?1 and year<=?2")
List<Car> findByYearBetween(int start, int end);
@Query("Select c FROM Car c WHERE price >=?1 and price<=?2")
List<Car> findByPriceBetween(int start, int end);

}
