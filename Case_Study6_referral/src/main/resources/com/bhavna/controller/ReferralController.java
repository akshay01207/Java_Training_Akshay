package com.bhavna.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReferralController {

	@RequestMapping("/name.html")
	public String display(HttpServletRequest req, Model m) {
		System.out.println("in method");

		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		if (age > 18) {
			String msg = "Hello " + name + " thanks for referral";
			m.addAttribute("message", msg);
			return "viewpage";

		} else {
			String msg = name + " IS NOT QUALIFIED AS REFERRAL.";
			m.addAttribute("message", msg);
			return "errorpage";
		}

	}

}
