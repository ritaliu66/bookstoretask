package com.epam.bookstoreservice.exception;

import lombok.Getter;
import lombok.Setter;

import javax.servlet.http.HttpServletResponse;

/**
 * custom exception for unmatched id
 */
@Getter
@Setter
public class UnmatchedIdException extends RuntimeException {
    private final Integer errorCode;

    private final String errorMsg;

    public UnmatchedIdException() {
        super();
        this.errorCode = HttpServletResponse.SC_BAD_REQUEST;
        this.errorMsg = "The id in the BookDTO does not match the path variable id";
    }
}
