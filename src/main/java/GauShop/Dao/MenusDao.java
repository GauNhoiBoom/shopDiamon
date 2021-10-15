package GauShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import GauShop.Entity.MapperMenus;
import GauShop.Entity.Menus;
@Repository
public class MenusDao extends BaseDao {
	public List<Menus> getDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus";
		list=_jbJdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
}
