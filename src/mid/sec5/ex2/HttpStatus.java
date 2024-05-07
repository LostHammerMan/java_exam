package mid.sec5.ex2;

public enum HttpStatus {
    OK(200, "ok"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int input) {
        for (HttpStatus status : HttpStatus.values()){
            if (status.getCode() == input){
                return status;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        if (this.getCode() >=200 && this.getCode() <= 299){
            return true;
        }else {
            return false;
        }
    }
}
