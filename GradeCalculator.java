import java.util.Scanner;

public class GradeCalculator {
    int math, eng, hindi, che, phy, bio, totalMarks, roll;
    double avg;
    String grade, name;
    Scanner sc = new Scanner(System.in);

    void getMarks() {
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        System.out.print("Enter Your Roll No. : ");
        roll = sc.nextInt();

        math = inputMarks("Maths");
        eng = inputMarks("English");
        hindi = inputMarks("Hindi");
        che = inputMarks("Chemistry");
        phy = inputMarks("Physics");
        bio = inputMarks("Biology");

        totalMarks = math + eng + hindi + che + phy + bio;
        avg = totalMarks / 6.0; 
    }

    
    int inputMarks(String subject) {
        int marks;
        do {
            System.out.print("Enter Marks of " + subject + " (0-100): ");
            marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("⚠️ Invalid! Enter between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    void gradeCal() {
        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }
    }

    void display() {
        System.out.println("\n-------- Your Details --------");
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + roll);
        System.out.println("Maths : " + math + "  English : " + eng);
        System.out.println("Hindi : " + hindi + "  Chemistry : " + che);
        System.out.println("Physics : " + phy + "  Biology : " + bio);
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Average Percentage : %.2f%%\n", avg);
        System.out.println("Grade : " + grade);
    }

    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        gc.getMarks();
        gc.gradeCal();
        gc.display();
    }
}
