package com.surge.MailService.model;

import lombok.Data;

/**
 * @author Joey
 * @desc Mail request class
 */

/*
 * Use lombok for getter and setter replacement
 */

@Data
public class MailRequest {
	private String name;
	private String to;
	private String from;
	private String subject;
}
