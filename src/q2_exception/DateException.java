package q2_exception;

public class DateException extends Exception{
	private String message = "Erreur de date";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DateException(){
		
	}
	public DateException(String message){
		this.message = message;
	}
	public String toString(){
		return message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
