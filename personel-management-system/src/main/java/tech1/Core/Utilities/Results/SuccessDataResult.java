package Core.Utilities.Results;

public class SuccessDataResult<T> extends DataResult<T> {


    public SuccessDataResult(T data, boolean success) {
        super(data, success);
    }

    public SuccessDataResult(T data, boolean success, String message) {
        super(data, success, message);
    }

    public SuccessDataResult(String message) {
        super(null, false, message);
    }

    public SuccessDataResult() {
        super(null, false);
    }
}
