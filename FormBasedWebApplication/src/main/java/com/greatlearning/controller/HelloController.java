package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;


@Controller
public class HelloController {

	/*
	 * how to use model (from component which we use) use to transfer data from
	 * diffErent layers (back end to front end or vice versa ) of application from
	 * java code to UI Spring mvc provides 3 types Model,ModelMap, ModelandView to
	 * define a small model in spring mvc
	 * 
	 * Model----> used to add attributes to the model ModelMap----> defines a holder
	 * for model attributes and primarily designed for adding attributes Model and
	 * View-----> holder for model and view template
	 * 
	 */

	@RequestMapping("/")
	public String welcome(ModelMap model) { // model is just argument
		model.addAttribute("message", "Hello and Welcome to the project"); // name and value

		return "hello";
	}

// ctrl+shif+f to format
}
// view --> jsp file ---> to access the value of model use $ sign(name of attribute is message)