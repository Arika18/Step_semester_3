import java.util.Scanner;

public class library {

    static String validate(String raw) {

        raw = raw.trim();

        if (raw.length() != 13)
            return "Invalid: wrong length";

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(raw.charAt(i)))
                return "Invalid: publisher code must be 3 letters";
        }

        for (int i = 3; i < 13; i++) {

            if (!Character.isDigit(raw.charAt(i)))
                return "Invalid: remaining characters must be digits";
        }

        String publisher = raw.substring(0, 3).toUpperCase();
        String year = raw.substring(3, 7);
        String catalog = raw.substring(7);

        return "[" + publisher + "] YEAR: " +
               year + " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        String code = sc.nextLine();

        System.out.println(validate(code));
    }
}