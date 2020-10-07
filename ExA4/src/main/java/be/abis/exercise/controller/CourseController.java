package be.abis.exercise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import be.abis.exercise.service.TrainingService;


@Controller
public class CourseController {

    Logger logger = LoggerFactory.getLogger(CourseController.class);
    
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private TrainingService trainingService;
	
	/*
	@GetMapping("/")
	public String getCourseDetail( Model model) {
		logger.info("GET getCourseDetail");
		model.addAttribute("course",courseService.findCourse(7900));
		return "course";
	}
	*/
	
	@GetMapping("/test")
	public String getTestPage() {
		logger.info("GET test");
		return "test";
	}
	
	@GetMapping("/")
	public String printCourse(Model model){
		Course course = trainingService.getCourseService().findCourse(7900);
		model.addAttribute("course", course);
		return "course";
	}
}
