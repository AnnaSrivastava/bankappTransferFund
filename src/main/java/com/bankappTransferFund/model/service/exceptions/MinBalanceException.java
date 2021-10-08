package com.bankappTransferFund.model.service.exceptions;

public class MinBalanceException extends RuntimeException {
	private static final long serialVersionUID = -7795121454271365698L;

	public MinBalanceException(String message) {
		super(message);
	}
	
}
