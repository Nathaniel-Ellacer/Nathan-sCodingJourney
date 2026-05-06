public class InvalidGradeException extends Exception {
    // Constructor accepts the invalid grade to include it in the message
    public InvalidGradeException(double grade) {
        super("Invalid grade " + grade + ". Grade must be between 0 and 100.");
    }
}