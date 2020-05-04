package com.xorkz.mail.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

	private static final Logger logger = Logger.getLogger(MailServiceImpl.class);

	@Autowired
	private MailSender mailSender;
	
	public MailServiceImpl() {
		logger.info("Created \t"+this.getClass().getSimpleName());
	}

	@Override
	public boolean sendMailByEmailId(String to, String subject, String body) {
		logger.info("Inside sendMailByEmailId of MailServiceImpl....");

		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);

		try {
			mailSender.send(mail);
			logger.info("Mail Sent Successfully...");
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		
		return false;
	}

}
