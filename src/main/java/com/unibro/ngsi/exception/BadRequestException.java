package com.unibro.ngsi.exception;

import lombok.Getter;

@Getter
public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 3219196785816059012L;

    public BadRequestException(String message) {
        super(message);
    }
}
