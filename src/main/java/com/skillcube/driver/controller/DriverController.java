package com.skillcube.driver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillcube.driver.entity.Driver;
import com.skillcube.driver.exception.DuplicateDriverIdException;
import com.skillcube.driver.serviceImpl.DriverServImpl;

@RestController
@RequestMapping("/api")
public class DriverController {

	@Autowired
	DriverServImpl driverServImpl;

	@PostMapping("/driver")
	public ResponseEntity<Driver> saveDriverDetails(@RequestBody Driver d) {
		try {
			this.driverServImpl.saveDriverDetails(d);
		} catch (DuplicateDriverIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Driver>(HttpStatus.OK);

	}

	@GetMapping("/drivers")
	public List<Driver> getAllDrivers() {
		return this.driverServImpl.getAllDrivers();

	}

	@DeleteMapping("/driver/{driverId}")
	public void deleteDriverByDriverId(@PathVariable("driverId") int driverId) {
		this.driverServImpl.deleteDriverById(driverId);

	}

}
