package enums;

public enum ExceptionResponse {
    TUDENT_NOT_FOUND(404,"Student not found!");
    private final int code;
    private final String msg;

    ExceptionResponse(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }
}
