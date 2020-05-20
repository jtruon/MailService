package com.surge.MailService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Joey
 * @desc Mail response model class to check for message
 */
/*
 * Use lombok for getter and setter replacement
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MailResponse {
	private String message;
	private boolean status;
}
