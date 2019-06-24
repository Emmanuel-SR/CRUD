package com.example.CRUD.models;
/*Response´s header
* head: {
*   code:00,
*   message:OK
*  }
* */
public class Head {

    public static final String SUCCESS_CODE = "00";
    public static final String SUCCESS_MESSAGE = "OK";
    public static final String ERROR_CODE = "-1";

    private String code;
    private String message;

    public Head() {
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MESSAGE;
    }

    public Head(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("Head(code='%s', message='%s')", code, message);
    }
}
