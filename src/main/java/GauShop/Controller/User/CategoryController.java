package GauShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
	@RequestMapping(value = "/danh-muc/{id}")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/category");
		return mv;
	}
}
