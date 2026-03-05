import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("\n\t--- Grade Result ---");
        System.out.println("\tGrade:\t" + grade);
        System.out.println("\tStatus:\t" + result);

        input.close();
    }
}