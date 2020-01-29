package exercise5.exceptions;

public class IsEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public IsEmptyException(String msg) {
		super(msg);
	}
}
