import java.util.Scanner;

public class Main5 {

    static String reverseName(String name) {

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--)
            reverse = reverse + name.charAt(i);

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseName(name));
    }
}