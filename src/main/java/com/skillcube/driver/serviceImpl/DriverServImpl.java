package com.skillcube.driver.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillcube.driver.entity.Driver;
import com.skillcube.driver.exception.DuplicateDriverIdException;
import com.skillcube.driver.repo.DriverRepository;
import com.skillcube.driver.service.DriverService;

@Service
public class DriverServImpl implements DriverService {

	@Autowired
	DriverRepository driverRepository;

	@Override
	public void saveDriverDetails(Driver d) throws DuplicateDriverIdException {

		driverRepository.saveDriverDetails(d);

	}

	@Override
	public List<Driver> getAllDrivers() {
		return driverRepository.getAllDriver();

	}

	@Override
	public void deleteDriverById(int driverId) {
		this.driverRepository.deleteDriverById(driverId);

	}

}
