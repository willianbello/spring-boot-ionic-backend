package com.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendOrderConfirmationHtml(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendHtmlEmail(MimeMessage msg);
}
