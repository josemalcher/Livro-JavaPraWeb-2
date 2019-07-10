package util;

public class RNException extends Exception {
    public RNException() {
    }

    public RNException(String message) {
        super(message);
    }

    public RNException(String message, Throwable cause) {
        super(message, cause);
    }

    public RNException(Throwable cause) {
        super(cause);
    }

    protected RNException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
