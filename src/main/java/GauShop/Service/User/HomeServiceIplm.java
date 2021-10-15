package GauShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GauShop.Dao.CategoriesDao;
import GauShop.Dao.MenusDao;
import GauShop.Dao.ProductsDao;
import GauShop.Dao.SlidesDao;
import GauShop.Dto.ProductDto;
import GauShop.Entity.Categories;
import GauShop.Entity.Menus;
import GauShop.Entity.Slides;
@Service
public class HomeServiceIplm implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategoriesDao categoriesDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	
	@Override
	public List<Slides> getDataSlides() {
		return slidesDao.getDataSlides();
	}
	@Override
	public List<Categories> getDataCategories() {
		return categoriesDao.getDataCategories();
	}
	@Override
	public List<Menus> getDataMenus() {
		return menusDao.getDataMenus();
	}
	@Override
	public List<ProductDto> getDataProduct() {
		return productsDao.GetDataProduct();
	}
	@Override
	public List<ProductDto> getDataHighlightProduct() {
		
		return productsDao.GetDataProductbyHighlight();
	}
	@Override
	public List<ProductDto> getDataNewProduct() {
		return productsDao.GetDataProductbyNew();
	}

}
