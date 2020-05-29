package com.surge.MailService.service;

import java.util.Map;

import com.surge.MailService.model.MailRequest;
import com.surge.MailService.model.MailResponse;

public interface MailService {
	MailResponse sendApprovedMail(MailRequest request,
			Map<String, Object> model);

	MailResponse sendRejectedMail(MailRequest request,
			Map<String, Object> model);
}
