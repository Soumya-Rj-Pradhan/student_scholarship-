package com.ict.std;

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

@RestController
@CrossOrigin("*")
public class HelloWorldController {
	@Autowired
	private std_service service;

	@RequestMapping("/test")
	public String hello() {
		return "Hello soumyaaaaaaaaa";
	}

	@GetMapping("/getAllUser")
	public List<StdDtlBO> getAllUser() {
		return service.getAllUser();
	}

	@PostMapping("/save")
	public void registerUSer(@RequestBody StdDtlBO bo) {
		service.registerUSer(bo);
		System.out.println("sucess");
	}

	@GetMapping("/getUserId/{id}")
	public ResponseEntity<StdDtlBO> getUserId(@PathVariable Integer id) {
		return service.getUserId(id);
	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<StdDtlBO> updateUSer(@PathVariable Integer id, @RequestBody StdDtlBO bo) {
		return service.updateUser(id, bo);
	}

	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Integer id) {
		return service.deleteUser(id);
	}

}