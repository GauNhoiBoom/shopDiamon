package GauShop.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import GauShop.Dto.ProductDto;
import GauShop.Dto.ProductDtoMapper;
@Repository
public class ProductsDao extends BaseDao {
	
	private final boolean YES = true;
	private final boolean NO = false;
	
	
	private StringBuffer SqlString(){
		StringBuffer  varname1 = new StringBuffer();
		varname1.append("SELECT ");
		varname1.append("p.id as id_product ");
		varname1.append(",p.id_category ");
		varname1.append(",p.size ");
		varname1.append(",p.name ");
		varname1.append(",p.price ");
		varname1.append(",p.sale ");
		varname1.append(",p.title ");
		varname1.append(",p.highlight ");
		varname1.append(",p.new_product ");
		varname1.append(",p.detail ");
		varname1.append(",c.id as id_colors ");
		varname1.append(",c.name as name_color ");
		varname1.append(",c.code as code_color ");
		varname1.append(",c.img ");
		varname1.append(",p.created_at ");
		varname1.append(",p.updated_at ");
		varname1.append("FROM products AS p ");
		varname1.append("INNER JOIN ");
		varname1.append("colors AS c ");
		varname1.append("ON p.id = c.id_product ");
		return varname1;
	}
	
	private String SqlStringProducts(boolean new_product, boolean highlight){
		StringBuffer varname1 = SqlString(); 
		if(new_product) {
			varname1.append("WHERE new_product = true ");
			if(highlight) {
				varname1.append("AND highlight = true ");
			}
		}
		else{
			if(highlight) {
				varname1.append("WHERE highlight = true ");
			}
		}
		
		
		varname1.append("GROUP BY p.id,c.id_product ");
		varname1.append("ORDER BY RAND() ");
		
		
		if(new_product) {
			varname1.append("LIMIT 8 ");
			
		}
		else{
			varname1.append("LIMIT 6 ");	
		}
		
		return varname1.toString();
	}
	
	public List<ProductDto> GetDataProduct(){
		String sql =SqlStringProducts(NO,NO);
		List<ProductDto> list = _jbJdbcTemplate.query(sql, new ProductDtoMapper());
		return list;
	}
	public List<ProductDto> GetDataProductbyHighlight(){
		String sql =SqlStringProducts(NO,YES);
		List<ProductDto> list = _jbJdbcTemplate.query(sql, new ProductDtoMapper());
		return list;
	}
	public List<ProductDto> GetDataProductbyNew(){
		String sql =SqlStringProducts(YES,YES);
		List<ProductDto> list = _jbJdbcTemplate.query(sql, new ProductDtoMapper());
		return list;
	}
	
}
