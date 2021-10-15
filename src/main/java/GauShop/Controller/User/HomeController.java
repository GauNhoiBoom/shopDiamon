package GauShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	
	
	
	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView Index() {
		_mvShare.addObject("slides",_homeService.getDataSlides());
		_mvShare.addObject("categories",_homeService.getDataCategories());
		_mvShare.addObject("products",_homeService.getDataProduct());
		_mvShare.addObject("productsHighlight",_homeService.getDataHighlightProduct());
		_mvShare.addObject("newProducts",_homeService.getDataNewProduct());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping(value ="/product")
	public ModelAndView Product() {
		_mvShare.setViewName("user/product");
		return _mvShare;
	}
}
