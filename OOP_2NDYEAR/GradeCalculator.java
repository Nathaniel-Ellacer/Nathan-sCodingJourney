public class GradeCalculator {
    /**
     * Calculates the average of an array of grades.
     * @throws InvalidGradeException if any grade is not between 0 and 100.
     */
    public double calculateAverage(double[] grades) throws InvalidGradeException {
        double sum = 0;
        for (double grade : grades) {
            // Validate each grade (0-100)
            if (grade < 0 || grade > 100) {
                throw new InvalidGradeException(grade);
            }
            sum += grade;
        }
        return sum / grades.length;
    }
}