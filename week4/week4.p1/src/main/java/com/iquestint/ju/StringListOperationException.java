package com.iquestint.ju;

public class StringListOperationException extends RuntimeException {

    private StringListErrorCode errorCode;

    StringListOperationException(String msg, StringListErrorCode errorCode) {
        super(msg);
        this.errorCode = errorCode;
    }

    public StringListErrorCode getErrorCode() {
        return errorCode;
    }

}
