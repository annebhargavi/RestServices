package com.codeassignment.huntington.restservices.exception;

public class EmployeeDataServiceException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	String msgCode;
	String msgDescription;
	public EmployeeDataServiceException(String msgCode, String msgDescription){
		super(msgDescription);
		this.msgCode = msgCode;
		this.msgDescription = msgDescription;		
	}
	
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgDescription() {
		return msgDescription;
	}
	public void setMsgDescription(String msgDescription) {
		this.msgDescription = msgDescription;
	}	

}
