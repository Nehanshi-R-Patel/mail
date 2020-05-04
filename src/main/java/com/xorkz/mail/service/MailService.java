package com.xorkz.mail.service;

public interface MailService {
	boolean sendMailByEmailId(String to, String subject, String body);
}
