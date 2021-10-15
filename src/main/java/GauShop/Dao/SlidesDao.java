package GauShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import GauShop.Entity.MapperSlides;
import GauShop.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao{
	public List<Slides> getDataSlides(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list=_jbJdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
	
}
