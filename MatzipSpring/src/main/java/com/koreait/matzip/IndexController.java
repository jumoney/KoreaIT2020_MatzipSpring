package com.koreait.matzip;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

	@RequestMapping("/")
	public String index(HttpServletRequest req) {
		if(Const.realPath == null) {
			Const.realPath = req.getServletContext().getRealPath("");
		}
		System.out.println("root!!");
		return "redirect:/rest/map";
	}
}
