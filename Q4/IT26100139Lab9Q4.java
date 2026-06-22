import java.util.Scanner;

public class IT26100139Lab9Q4 {

    
    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t" + finalMark + "\t\t" + grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double assignmentMark, examMark, finalMark;
        char grade;

        
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Name of Student " + i + ": ");
            name = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            examMark = input.nextDouble();

            finalMark = calcFinalMark(assignmentMark, examMark);
            grade = findGrades(finalMark);

            if (i == 1) {
                System.out.println("\nName\tFinal Mark\tGrade");
            }

            printDetails(name, finalMark, grade);
            System.out.println();
        }

        input.close();
    }
}