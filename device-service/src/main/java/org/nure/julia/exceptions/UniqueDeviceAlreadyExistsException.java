package org.nure.julia.exceptions;

public class UniqueDeviceAlreadyExistsException extends RuntimeException {

    public UniqueDeviceAlreadyExistsException() {}

    public UniqueDeviceAlreadyExistsException(String msg) {
        super(msg);
    }

    public UniqueDeviceAlreadyExistsException(String msg, Throwable t) {
        super(msg, t);
    }
}
