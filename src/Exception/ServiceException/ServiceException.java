package Exception.ServiceException;

import Exception.HotelBookingException;

public class ServiceException extends HotelBookingException {
	public ServiceException() {
		super();
	}
	public ServiceException(String message) {
		super(message);
	}
	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		
	}
	public ServiceException(Throwable cause) {
		super(cause);
	
	}

}
