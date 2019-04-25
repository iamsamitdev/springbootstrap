package com.itgenius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "frontend/index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "frontend/login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "frontend/register";
	}
}
