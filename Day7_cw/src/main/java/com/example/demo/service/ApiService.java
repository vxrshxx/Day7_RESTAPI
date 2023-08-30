package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;



@Service
public class ApiService {
	
	@Autowired
	CarRepo acr;
	public Car saveinfo(Car cc)
	{
		return acr.save(cc);
	}
	
	public List<Car> savedetails(List<Car> cc){
		
		return (List<Car>)acr.saveAll(cc);
	}
	public List<Car> showinfo()
	{
	      return acr.findAll();
	}
	public List<Car> getcar(int s)
	{
		return acr.getcarInfo(s);
	}
	
	public List<Car> getcaradd(String address)
	{
		return acr.getcarInfoaddress(address);
	}
	
	public List<Car> getcarname(String carname)
	{
		return acr.getcarInfoname(carname);
	}
	public List<Car> getcartypes(int i,String s)
	{
		return acr.getcarInfobytypes(i, s);
	}

}
