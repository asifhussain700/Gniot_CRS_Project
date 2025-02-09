
package com.gniot.crs.exception;

/**
 * Custom exception class for student-related operations.
 */
public class StudentException extends Exception {
    public StudentException(String message) {
        super(message);
    }

    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }
}
