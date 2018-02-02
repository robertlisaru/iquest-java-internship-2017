package com.iquestint.ju;

public enum StringListErrorCode {
    NULL_ELEMENT(101),
    INVALID_NUMBER_FORMAT(102),
    INDEX_OUT_OF_BOUNDS(103);

    private int errorNumber;

    StringListErrorCode(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    public int getErrorNumber() {
        return errorNumber;
    }
}
