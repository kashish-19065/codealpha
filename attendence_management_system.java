import java.util.Scanner;

public class attendence_management_system {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie"};
        boolean[] attendance = new boolean[students.length];

        Scanner sc = new Scanner(System.in);

        // Mark attendance
        for (int i = 0; i < students.length; i++) {
            System.out.print("Is " + students[i] + " present? (yes/no): ");
            String input = sc.nextLine().toLowerCase();
            attendance[i] = input.equals("yes");
        }

        // Display attendance
        System.out.println("\nAttendance Report:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + (attendance[i] ? "Present" : "Absent"));
        }

        sc.close();
    }
}
