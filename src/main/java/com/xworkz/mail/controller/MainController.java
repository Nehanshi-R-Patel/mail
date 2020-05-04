package com.xworkz.mail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mail.service.MailService;

@Controller
public class MainController {
	private static final Logger logger=Logger.getLogger(MainController.class);
	
	@Autowired
	private MailService mailService;
	
	public MainController() {
		logger.info("Created \t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("sendMail.do")
	public String sendMail(String toMailId, String subject, String body,ModelMap map) {
		logger.info("Inside sendMail() of MainController...");
		
		logger.info("Mail Id: "+toMailId);
		logger.info("Subject: "+subject);
		logger.info("Body: "+body);
		
		this.mailService.sendMailByEmailId(toMailId, subject, body);
		map.addAttribute("message",toMailId);
		
		return "Success";
		
	}
}
