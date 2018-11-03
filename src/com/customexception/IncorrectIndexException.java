package com.customexception;

public class IncorrectIndexException extends Exception {
	/**
	 * @author 		Arun Pokharna
	 * Date: 		2018-11-02
	 * Description:	IncorrectIndexException will be called when an incorrect index is passed in any method.
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public IncorrectIndexException(String message) {
		super(message);
	}

}
