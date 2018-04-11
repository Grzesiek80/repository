package sda.java9.wpj.advanced.exceptions;

public class NumberIsNotReachableException extends RuntimeException {
	
	private String operatorName;
	
	public NumberIsNotReachableException() {
		super();
	}
	
	public NumberIsNotReachableException(String message) {
		super(message);
		
	}
	
	public NumberIsNotReachableException(String message, String operatorName) {
		super(message);
		this.operatorName = operatorName;
	}

	public String getOperatorName() {
		return this.operatorName; 
	}
}