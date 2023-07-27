package com.ict.std;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class std_service {

	@Autowired
	private std_Repo repo;

	public List<StdDtlBO> getAllUser() {
		return repo.findAll();
	}

	public void registerUSer(@RequestBody StdDtlBO bo) {
		String dob = "2023-07-04T18:30:00.000Z";
		LocalDateTime dateTime = LocalDateTime.parse(dob, DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.of("UTC")));
        String formattedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        bo.setDob(formattedDate);
        
        bo.setLang(bo.getLanguage().toString());
		 repo.save(bo);
	}

	public ResponseEntity<StdDtlBO> getUserId(@PathVariable Integer id) {
		StdDtlBO bo = repo.findById(id).get();
		return ResponseEntity.ok(bo);
	}

	public ResponseEntity<StdDtlBO> updateUser(@PathVariable Integer id, @RequestBody StdDtlBO bo) {
		bo.setId(id);
		StdDtlBO updateData = repo.save(bo);
		return ResponseEntity.ok(updateData);
	}

	public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Integer id) {
		repo.deleteById(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
