package be.abis.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import be.abis.exercise.service.TrainingService;

@Controller
public class TrainingController {

	@Autowired
	TrainingService trainingService;
	
	@GetMapping("/training")
	public String getTraining(Model model) {
		model.addAttribute("person",trainingService.findPerson(1));
		return "training";
	}
}
