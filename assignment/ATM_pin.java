import java.util.Scanner;

public class ATM_pin {

    static void checkPin(String pin) {

        if (pin.length() == 4)
            System.out.println("PIN length OK");
        else
            System.out.println("Invalid PIN - must be exactly 4 digits.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        checkPin(pin);
    }
}