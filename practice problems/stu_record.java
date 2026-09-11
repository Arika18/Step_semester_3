import java.util.Scanner;

public class stu_record {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter record: ");
        String data = sc.nextLine();

        String[] parts = data.split(",");

        if (parts.length != 3) {

            System.out.println("Invalid Record");

        } else {

            System.out.println("Name: " + parts[0]);
            System.out.println("Roll No: " + parts[1]);
            System.out.println("Dept: " + parts[2]);
        }
    }
}