package com.bankappTransferFund.model.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="transaction not found")
public class TxNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TxNotFoundException(String message) {
		super(message);
	}
}
