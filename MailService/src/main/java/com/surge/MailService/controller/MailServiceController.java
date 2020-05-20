package com.surge.MailService.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surge.MailService.model.MailRequest;
import com.surge.MailService.model.MailResponse;
import com.surge.MailService.service.MailService;

@RestController
public class MailServiceController {

	@Autowired
	private MailService mailService;

	@PostMapping("/sendEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("name", request.getName());
		model.put("location", "Houston,TX");

		return mailService.sendMail(request, model);
	}
}
