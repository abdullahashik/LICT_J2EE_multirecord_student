/**
 *
 */
package bean;

/**
 * @author ashik_arefin
 */
public abstract class GradeCalculate extends Student implements ResultImpl {

    /**
     *
     */
    public GradeCalculate() {
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     *
     * @see bean.ResultImpl#totalMarks(double[])
     */
    @Override
    public double totalMarks(double... marks) {
        // calculate total mark from given number of marks
        double result = 0;
        for (int i = 0; i < marks.length; i++) {
            result += marks[i];
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see bean.ResultImpl#avgMarks(double[])
     */
    @Override
    public double avgMarks(double... marks) {
        // calculate average marks from given marks
        double result = 0;
        for (int i = 0; i < marks.length; i++) {
            result += marks[i];
        }
        return result / marks.length;
    }

    /*
     * (non-Javadoc)
     *
     * @see bean.ResultImpl#totalCgpa(double[])
     */
    @Override
    public double totalCgpa(double... cgpa) {
        // calculate total cgpa from given number of cgpa
        double result = 0;
        for (int i = 0; i < cgpa.length; i++) {
            result += cgpa[i];
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see bean.ResultImpl#avgCgpa(double[])
     */
    @Override
    public double avgCgpa(double... cgpa) {
        // return the average cgpa
        double result = 0;
        for (int i = 0; i < cgpa.length; i++) {
            result += cgpa[i];
        }
        return result / cgpa.length;
    }

    /*
     * (non-Javadoc)
     *
     * @see bean.ResultImpl#calculateCgpa(double)
     */
    @Override
    public double calculateCgpa(double mark) {
        if (mark < 40) {
            return 2;
        } else if (mark >= 40 && mark < 50) {
            return 2.5;
        } else if (mark > 50 && mark <= 60) {
            return 2.8;
        } else if (mark >= 61 && mark <= 70) {
            return 3.0;
        } else if (mark >= 71 && mark < 80) {
            return 3.5;
        } else if (mark >= 81 && mark <= 90) {
            return 3.8;
        } else if (mark >= 91 && mark < 100) {
            return 4;
        } else
            return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see bean.ResultImpl#calculateGrade(double)
     */
    @Override
    public String calculateGrade(double cgpa) {
        if (cgpa < 2) {
            return "F";
        } else if (cgpa > 2 && cgpa < 2.5) {
            return "B-";
        } else if (cgpa >= 2.5 && cgpa < 3) {
            return "B";
        } else if (cgpa > 3 && cgpa < 3.25) {
            return "A+";
        } else if (cgpa > 3.25 && cgpa < 3.5) {
            return "A-";
        } else if (cgpa > 3.5 && cgpa < 3.8) {
            return "A";
        } else if (cgpa > 3.8 && cgpa <= 4) {
            return "A+";
        } else
            return null;
    }

}
