package ch21_exception.age_exception.scores;

public class InvildScoreException extends Exception{
    public InvildScoreException(String message) {
        super(message);
    }
}
