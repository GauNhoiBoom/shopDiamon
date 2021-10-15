package GauShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GauShop.Dto.ProductDto;
import GauShop.Entity.Categories;
import GauShop.Entity.Menus;
import GauShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> getDataSlides();
	public List<Categories> getDataCategories();
	public List<Menus> getDataMenus();
	public List<ProductDto> getDataProduct();
	public List<ProductDto> getDataHighlightProduct();
	public List<ProductDto> getDataNewProduct();
}
