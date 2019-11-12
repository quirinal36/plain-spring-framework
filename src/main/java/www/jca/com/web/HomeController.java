package www.jca.com.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, ModelAndView mv,
			HttpServletRequest req, Authentication authentication) {
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getListView(Locale locale, ModelAndView mv,
			HttpServletRequest req, Authentication authentication) {
		mv.setViewName("/home");
		return mv;
	}
	
	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView getTopView(ModelAndView mv) {
		mv.setViewName("/menu/top");
		return mv;
	}
	@RequestMapping(value = "/left", method = RequestMethod.GET)
	public ModelAndView getLeftView(ModelAndView mv) {
		mv.setViewName("/menu/left");
		return mv;
	}
	@RequestMapping(value = "/right", method = RequestMethod.GET)
	public ModelAndView getRightView(ModelAndView mv) {
		mv.setViewName("/menu/right");
		return mv;
	}
}
