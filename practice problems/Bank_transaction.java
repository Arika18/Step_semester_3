import java.util.Scanner;

public class Bank_transaction {

    static String validate(String raw) {

        raw = raw.trim();

        if (raw.length() != 14)
            return "Invalid: wrong length";

        String bank = raw.substring(0, 3).toUpperCase();

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(bank.charAt(i)))
                return "Invalid: bank code must be 3 letters";
        }

        for (int i = 3; i < 14; i++) {

            if (!Character.isDigit(raw.charAt(i)))
                return "Invalid: remaining characters must be digits";
        }

        String date = raw.substring(3, 9);
        String sequence = raw.substring(9);

        return "[" + bank + "] DATE: " +
               date.substring(0, 2) + "/" +
               date.substring(2, 4) + "/" +
               date.substring(4, 6) +
               " | SEQ: " + sequence;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter reference: ");
        String reference = sc.nextLine();

        System.out.println(validate(reference));
    }
}