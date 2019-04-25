package com.itgenius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/backend")
public class BackendController {

	String viewpath = "backend/";

	@RequestMapping(value = "/dashboard")
	public String dashboard() {
		return viewpath + "dashboard";
	}

}
