package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.ApiService;



@RestController
public class ApiController {
	
	@Autowired
	ApiService asr;
	
	@PostMapping("addcar")
	public Car add(@RequestBody Car cc) {		
		return asr.saveinfo(cc);
	}
	
	@PostMapping("addncar")
	public List<Car> addndetails(@RequestBody List<Car> cc)
	{
		return asr.savedetails(cc);
	}
	@GetMapping("showdetails")
	public List<Car> show()
	{
		return asr.showinfo();
	}
	
	@GetMapping("showquery/{owners}")
	public 	List<Car> showstudetails(@PathVariable int owners)
	{
		return asr.getcar(owners);
	}
	
	@GetMapping("showquerybyaddress/{address}")
	public 	List<Car> showstudetailsbyaddress(@PathVariable String address)
	{
		return asr.getcaradd(address);
	}
	
	@GetMapping("showquerybyname/{carname}")
	public 	List<Car> showstudetailsbyname(@PathVariable String carname)
	{
		return asr.getcarname(carname);
	}
	
	@GetMapping("owners/{owners}/cartype/{cartype}")
	public 	List<Car> showstudetails(@PathVariable int owners,@PathVariable String cartype)
	{
		return asr.getcartypes(owners, cartype);
	}
}
