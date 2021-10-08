package com.bankappTransferFund.model.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="account not found")
public class AccNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AccNotFoundException(String message) {
		super(message);
	}
}
