package bean;

public interface ResultImpl {
    // calculate total marks
    double totalMarks(double... marks);

    // calculate average marks
    double avgMarks(double... marks);

    // calculate total cgpa
    double totalCgpa(double... cgpa);

    // calculate average cgpa
    double avgCgpa(double... cgpa);

    // calculate cgpa from given mark
    double calculateCgpa(double mark);

    // calculate grade from given cgpa
    String calculateGrade(double cgpa);
}
