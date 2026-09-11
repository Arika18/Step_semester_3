import java.util.Scanner;

public class Masked_phoneno {

    static String maskPhone(String phone) {

        if (phone.length() != 10)
            return "Invalid phone number";

        for (int i = 0; i < phone.length(); i++) {

            if (!Character.isDigit(phone.charAt(i)))
                return "Invalid phone number";
        }

        String lastFour = phone.substring(6);

        return "XXXXXX-" + lastFour;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.println(maskPhone(phone));
    }
}