import java.util.Scanner;

public class reverse_word {

    static String reverseWords(String sentence) {

        String[] words = sentence.split(" ");
        String answer = "";

        for (int i = 0; i < words.length; i++) {

            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--)
                reverse += words[i].charAt(j);

            answer += reverse;

            if (i < words.length - 1)
                answer += " ";
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.println(reverseWords(sentence));
    }
}