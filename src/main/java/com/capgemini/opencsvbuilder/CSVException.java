package com.capgemini.opencsvbuilder;

public class CSVException extends Exception {
	public ExceptionType type;

	public enum ExceptionType {
		FILE_PROBLEM, INCORRECT_TYPE, INCORRECT_DELIMITER, ILLEGAL_STATE;
	}
	
	public CSVException(String message, ExceptionType exceptionType) {
		super(message);
		this.type = exceptionType;
	}
}
