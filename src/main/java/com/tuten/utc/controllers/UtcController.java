package com.tuten.utc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tuten.utc.models.Utc;

@RestController
@RequestMapping("/")
public class UtcController {
	
	@CrossOrigin(origins = "*")
	@PostMapping("/calculate")
	public ResponseEntity<Utc> calculateTime(@RequestBody Utc time) {
		return new ResponseEntity<>(time, HttpStatus.OK);
	}

}
