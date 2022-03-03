package Exception.DaoException;

import Exception.ServiceException.ServiceException;

public class DaoException extends ServiceException {
	public DaoException() {
		super();
	}
	public DaoException(String message) {
		super(message);
	}
	public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	
	}
	public DaoException(Throwable cause) {
		super(cause);
	
	}

}
