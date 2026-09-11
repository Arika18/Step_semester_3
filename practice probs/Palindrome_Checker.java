import java.util.Scanner;

public class Palindrome_Checker {

    static boolean iterative(String text) {

        int i = 0;
        int j = text.length() - 1;

        while (i < j) {

            if (text.charAt(i) != text.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    static boolean recursive(String text) {

        if (text.length() <= 1)
            return true;

        if (text.charAt(0) != text.charAt(text.length() - 1))
            return false;

        return recursive(text.substring(1, text.length() - 1));
    }

    static boolean arrayReverse(String text) {

        char[] arr = text.toCharArray();

        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--)
            reverse = reverse + arr[i];

        return text.equals(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " + iterative(text));
        System.out.println("Recursive: " + recursive(text));
        System.out.println("Array Reversal: " + arrayReverse(text));
    }
}