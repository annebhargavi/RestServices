package com.codeassignment.huntington.restservices.util;

public interface ErrorConstants {

	// Error codes
	String ERRCD_SYSTEM_ERROR = "001";
	String ERRCD_RECORD_NOT_FOUND = "002";
	String ERRCD_INPUT_VALID_ERROR = "003";
	String ERRCD_MULT_RECORD_FOUND = "002";

	// Error messages
	String ERRMSG_SYSTEM_ERROR = "System Error has occurred.";
	String ERRMSG_RECORD_NOT_FOUND = "Record not found.";
	String ERRMSG_INPUT_VALID_ERROR = "Not a valid input";
	String ERRMSG_MULT_RECORD_FOUND = "Multiple Records Foound";
}
