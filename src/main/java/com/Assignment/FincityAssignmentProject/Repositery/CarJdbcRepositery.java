package com.Assignment.FincityAssignmentProject.Repositery;
/*
 * package com.Assignment.FincityAssignmentProject.Repositery;
 * 
 * import java.sql.PreparedStatement; import java.sql.SQLException; import
 * java.sql.Types; import java.util.List; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.dao.DataAccessException; import
 * org.springframework.dao.EmptyResultDataAccessException; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.core.PreparedStatementCallback; import
 * org.springframework.stereotype.Repository; import
 * com.Assignment.FincityAssignmentProject.Model.CarJdbc; import
 * com.Assignment.FincityAssignmentProject.Model.CarRowMapper;
 * 
 * @Repository public class DaoJdbcTemplte {
 * 
 * @Autowired private JdbcTemplate jdbcTemplate; public List<CarJdbc> findAll()
 * { final String SQL = "select * from Car"; List<CarJdbc> car =
 * jdbcTemplate.query(SQL, new CarRowMapper()); return car; }
 * 
 * 
 * public Boolean save(CarJdbc car) { String query =
 * "insert into car values(?,?,?,?,?)"; return jdbcTemplate.execute(query, new
 * PreparedStatementCallback<Boolean>() {
 * 
 * @Override public Boolean doInPreparedStatement(PreparedStatement ps) throws
 * SQLException, DataAccessException {
 * 
 * ps.setInt(1, car.getId()); ps.setString(2, car.getManufactureName());
 * ps.setString(3, car.getModel()); ps.setString(4, car.getName());
 * ps.setString(5, car.getColor());
 * 
 * return ps.execute();
 * 
 * } }); }
 * 
 * public Integer update(CarJdbc car) { String query = "update Car " +
 * " set id = ?, name = ?, manufactureName = ? ,model = ? ,color = ?" +
 * " where id = ?"; Object[] params = { car.getId(), car.getName(),
 * car.getManufactureName(), car.getModel(), car.getColor(), car.getId() };
 * int[] types = { Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
 * Types.VARCHAR, Types.INTEGER };
 * 
 * return jdbcTemplate.update(query, params, types); }
 * 
 * 
 * public CarJdbc findById(int id) { try { Object[] args = { id }; CarJdbc car =
 * (jdbcTemplate.queryForObject("select * from Car where id=?", args, new
 * CarRowMapper())); return car; } catch (EmptyResultDataAccessException ex) {
 * return null; } }
 * 
 * public CarJdbc findByName(String name) { try { Object[] args = { name };
 * CarJdbc car = (jdbcTemplate.queryForObject("select * from Car where name=?",
 * args, new CarRowMapper())); return car; } catch
 * (EmptyResultDataAccessException ex) { return null; } }
 * 
 * 
 * 
 * public Integer Delete(Integer id) { Object[] args = { id }; return
 * jdbcTemplate.update("delete from Car where id=?", args);
 * 
 * }
 * 
 * }
 */