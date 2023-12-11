import methods.Methods;
import methods.CourseC;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods.GPAcalculator gpaCalculator = new Methods.GPAcalculator();


        System.out.println("Enter course details (name, code, unit, score) or type 'exit' to finish:");

        while (true) {
            try{
                System.out.print("Course Name: ");
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Course Code: ");
                String code = scanner.nextLine();

                if (code.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Course Unit: ");
                int unit = scanner.nextInt();
                if (unit < 0 || unit > 5){
                    System.out.println("Invalid unit, Please enter digit between 1 - 5 as unit ");
                    scanner.nextLine();
                    continue;
                }


                System.out.print("Course Score: ");
                int score = scanner.nextInt();
                if (score < 0 || score > 100){
                    System.out.println("Invalid score, Please enter digit between 1 and 100 as score ");
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();

                CourseC.Course course = new CourseC.Course(name, code, unit, score);
                gpaCalculator.addCourse(course);



            }catch (InputMismatchException e){
                System.out.println("Invalid, Please enter valid input");
                scanner.nextLine();

            }

        }

        gpaCalculator.displayFinalResult();
    }
}
