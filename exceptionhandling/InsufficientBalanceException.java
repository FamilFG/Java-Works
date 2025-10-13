package exceptionhandling;


public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class LowGradeException extends Exception {
    public LowGradeException(String message) {
        super(message);
    }
}

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

class AgeRestrictionException extends Exception{
    public AgeRestrictionException(String message) {
        super(message);
    }
}

class CarNotAvailableException extends Exception{
    public CarNotAvailableException(String message) {
        super(message);
    }
}

class AllCarsBusyException extends Exception{
    public AllCarsBusyException(String message) {
        super(message);
    }
}

class CardBlockedException extends Exception{
    public CardBlockedException(String message) {
        super(message);
    }
}

class NoTableAvailableException extends Exception{
    public NoTableAvailableException(String message) {
        super(message);
    }
}
