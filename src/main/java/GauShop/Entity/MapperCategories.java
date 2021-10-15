package GauShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategories implements RowMapper<Categories> {

	@Override
	public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categories a = new Categories();
		a.setId(rs.getInt("id"));
		a.setName(rs.getString("name"));
		a.setDescription(rs.getString("description"));
		return a;
	}

}
