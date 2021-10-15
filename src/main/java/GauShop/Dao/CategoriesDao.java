package GauShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import GauShop.Entity.Categories;
import GauShop.Entity.MapperCategories;


@Repository
public class CategoriesDao extends BaseDao {

	public List<Categories> getDataCategories(){
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM categories";
		list=_jbJdbcTemplate.query(sql,new MapperCategories());
		return list;
	}
}
