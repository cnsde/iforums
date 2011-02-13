package net.iforums.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="login.do")
public class LoginController extends AbstractController{

	@Override
	protected ModelAndView handleGetPostRequestInternal(
			HttpServletRequest request, HttpServletResponse response,
			Map<String, Object> model) throws Exception {
		int errorCode = ServletRequestUtils.getIntParameter(request, "error", 0);
		
		model.put("errorCode", errorCode);
		return new ModelAndView(getViewName(),model);
	}

}
