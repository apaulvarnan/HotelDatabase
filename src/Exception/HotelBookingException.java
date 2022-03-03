package Exception;

public class HotelBookingException extends Exception{

	public HotelBookingException() {
		super();
	
	}

	public HotelBookingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public HotelBookingException(String message, Throwable cause) {
		super(message, cause);
	}

	public HotelBookingException(String message) {
		super(message);
		
	}

	public HotelBookingException(Throwable cause) {
		super(cause);
		
	}
	

}
