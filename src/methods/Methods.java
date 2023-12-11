package methods;

import java.util.ArrayList;
public class Methods {


    public static class GPAcalculator{
        private ArrayList<CourseC.Course> courses = new ArrayList<>();

        public void addCourse(CourseC.Course course) {
            courses.add(course);
        }

        public double calculateGPA() {
            int totalQualityPoints = 0;
            int totalGradeUnits = 0;

            for (CourseC.Course course : courses) {
                totalQualityPoints += course.calculateQualityPoints();
                totalGradeUnits += course.getUnit();
            }

            return (double) totalQualityPoints / totalGradeUnits;
        }


        public void displayFinalResult() {

            System.out.println("|----------------------------|-----------------------|------------|---------------------|");
            System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE x UNIT          |");
            System.out.println("|----------------------------|-----------------------|------------|---------------------|");


            for (CourseC.Course course : courses) {
                course.displayCourse();
            }

            System.out.println("|---------------------------------------------------------------------------------------|");

            System.out.printf("\nYour GPA is = %.2f to 2 decimal places.\n", calculateGPA());
        }
    }


}
