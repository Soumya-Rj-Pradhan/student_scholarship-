package com.ict.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ict.entity.StdDtlBO;
import com.ict.services.std_service;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class main_controller {

	@Autowired
	private std_service service;
	
	@GetMapping("/scholarship")
	public List<StdDtlBO> getAllUser(){
		return service.getAllUser();
	}
	
	@PostMapping("/scholarship")
	public StdDtlBO registerUSer(@RequestBody StdDtlBO bo) {
		return service.registerUSer(bo);
	}
	
	@GetMapping("/scholarship/{id}")
	public ResponseEntity<StdDtlBO> getUserId(@PathVariable Integer id) {
		return service.getUserId(id);
	}
	
	@PutMapping("/scholarship/{id}")
	public ResponseEntity<StdDtlBO> updateUSer(@PathVariable Integer id, @RequestBody StdDtlBO bo) {
		return service.updateUser(id, bo);
	}
	
	@DeleteMapping("/scholarship/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Integer id) {
		return service.deleteUser(id);
	}
	
	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello SOUMYAAAAAAAA";  
	}  
}