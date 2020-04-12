/*
 * package com.Assignment.FincityAssignmentProject.Model;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException;
 * 
 * import org.springframework.jdbc.core.RowMapper;
 * 
 * public class CarRowMapper implements RowMapper<CarJdbc> {
 * 
 * @Override public CarJdbc mapRow(ResultSet rs, int rowNum) throws SQLException
 * {
 * 
 * CarJdbc car=new CarJdbc(); car.setColor(rs.getString("color"));
 * car.setId(rs.getInt("id"));
 * car.setManufactureName(rs.getString("manufactureName"));
 * car.setModel(rs.getString("model")); car.setName(rs.getString("name"));
 * return car; }
 * 
 * }
 */