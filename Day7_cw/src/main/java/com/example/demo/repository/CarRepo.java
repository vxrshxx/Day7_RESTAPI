package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;



public interface CarRepo extends JpaRepository<Car, Integer> {
	
	@Query(value="select * from car_table where owners=:s",nativeQuery=true)
	public List<Car> getcarInfo(@Param("s") int owners);
	
	@Query(value="select * from car_table where address=:address",nativeQuery=true)
	public List<Car> getcarInfoaddress(@Param("address") String address);
	
	@Query(value="select * from car_table where carname=:carname",nativeQuery=true)
	public List<Car> getcarInfoname(@Param("carname") String carname);

	@Query(value="select * from car_table where owners=:owners and cartype=:cartype",nativeQuery=true)
	public List<Car> getcarInfobytypes(@Param("owners") int owners,@Param("cartype") String cartype);
	
}
