package com.skillcube.driver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillcube.driver.entity.Driver;
import com.skillcube.driver.exception.DuplicateDriverIdException;

@Service
public interface DriverService {

	public void saveDriverDetails(Driver d) throws DuplicateDriverIdException;

	List<Driver> getAllDrivers();

	public void deleteDriverById(int driverId);

}
