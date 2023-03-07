package com.skillcube.driver.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.skillcube.driver.entity.Driver;
import com.skillcube.driver.exception.DriverNotFoundException;
import com.skillcube.driver.exception.DuplicateDriverIdException;
import com.skillcube.driver.util.AppConstant;
import com.skillcube.driver.util.DBConnection;

@Repository
public class DriverRepository {
	List<Driver> list;

	public DriverRepository() {
		super();
		list = new ArrayList<>();

	}

	public List<Driver> getAllDriver() {

		list = new ArrayList<>();
		try {
			Connection con = DBConnection.getConnection();
			String sql = AppConstant.sqlAllDrivers;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			/*
			 * int driverid = rs.getInt(1); String firstname = rs.getString(2); int
			 * telephone = rs.getInt(3); String address = rs.getString(4); String city =
			 * rs.getString(5); String enginesize = rs.getString(6); String quoteamount =
			 * rs.getString(7);
			 */
			while (rs.next()) {
				Driver d = new Driver(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
				list.add(d);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	public void saveDriverDetails(Driver i) throws DuplicateDriverIdException {
		Connection con = null;
		int id = 0;
		try {
			con = DBConnection.getConnection();
			String sql = AppConstant.sqlSaveDriver;

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, i.getDriverId());
			ps.setString(2, i.getFirstname());
			ps.setInt(3, i.getTelephonenumber());
			ps.setString(4, i.getAddress());
			ps.setString(5, i.getCity());
			ps.setString(6, i.getEnginesize());
			ps.setString(7, i.getQuoteamount());

			id = ps.executeUpdate();
			if (id == 0) {
				throw new DuplicateDriverIdException("driver is already exist...");
			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {

			System.out.println("Number of drivers created=" + id);
		}
	}

	public void deleteDriverById(int driverId) {
		Connection con = null;
		int id = 0;
		try {
			con = DBConnection.getConnection();
			String sql = AppConstant.sqlDeleteDriverById;
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, driverId);
			id = ps.executeUpdate();
			if (id == 0) {
				throw new DriverNotFoundException("Driver", "driverId", driverId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
