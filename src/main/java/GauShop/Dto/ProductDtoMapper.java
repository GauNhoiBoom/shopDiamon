package GauShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductDtoMapper implements RowMapper<ProductDto> {

	@Override
	public ProductDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDto a = new ProductDto();
		a.setId_product(rs.getLong("id_product"));
		a.setId_category(rs.getInt("id_category"));
		a.setSize(rs.getString("size"));
		a.setName(rs.getString("name"));
		a.setPrice(rs.getDouble("price"));
		a.setSale(rs.getInt("sale"));
		a.setTitle(rs.getString("title"));
		a.setHighlight(rs.getBoolean("highlight"));
		a.setNew_product(rs.getBoolean("new_product"));
		a.setDetail(rs.getString("detail"));
		a.setId_colors(rs.getInt("id_colors"));
		a.setName_color(rs.getString("name_color"));
		a.setCode_color(rs.getString("code_color"));
		a.setImg(rs.getString("img"));
		a.setCreated_at(rs.getDate("created_at"));
		a.setUpdated_at(rs.getDate("updated_at"));
		return a;
	}

}
