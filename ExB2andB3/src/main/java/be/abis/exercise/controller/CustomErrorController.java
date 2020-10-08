package be.abis.exercise.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import be.abis.exercise.model.Person;

@Controller
public class CustomErrorController implements ErrorController  {
	
	Logger logger = LoggerFactory.getLogger(CustomErrorController.class);
	
	@Override
	public String getErrorPath() {
			return "/error";
	}

	@GetMapping("/error")
	public String getError(Model model){
		logger.info("GET : getError");
		return "error";
	}
}
