package com.codeassignment.huntington.restservices.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.beanutils.PropertyUtils;

import com.codeassignment.huntington.restservices.exception.EmployeeDataServiceException;

/**
 * This class contains common utility methods
 * 
 */
public class CommonUtil {
	
	static Logger log = Logger.getLogger("com.codeassignment.huntington.restservices.util.CommonUtil");


	/**
	 * Method to copy the properties with exception handling
	 * 
	 * @param dest
	 * @param orig
	 */
	public static void copyProperties(Object dest, Object orig) {
		try {
			PropertyUtils.copyProperties(dest, orig);
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage(), e);
			throw new EmployeeDataServiceException(ErrorConstants.ERRCD_SYSTEM_ERROR, ErrorConstants.ERRMSG_SYSTEM_ERROR + " : "+ e);
		} 
		
	}
	
}
