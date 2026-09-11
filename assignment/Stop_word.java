import java.util.Scanner;

public class Stop_word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paragraph: ");
        String text = sc.nextLine().toLowerCase();

        text = text.replace(".", "");
        text = text.replace(",", "");

        String[] words = text.split("\\s+");

        String[] unique = new String[words.length];
        int[] count = new int[words.length];

        int size = 0;

        for (String word : words) {

            if (word.equals("the") ||
                word.equals("was") ||
                word.equals("and") ||
                word.equals("a") ||
                word.equals("is") ||
                word.equals("of") ||
                word.equals("in"))
                continue;

            int index = -1;

            for (int i = 0; i < size; i++) {

                if (unique[i].equals(word)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                unique[size] = word;
                count[size] = 1;
                size++;
            } else {
                count[index]++;
            }
        }

        // Sort by count
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (count[j] > count[i]) {

                    int tempCount = count[i];
                    count[i] = count[j];
                    count[j] = tempCount;

                    String tempWord = unique[i];
                    unique[i] = unique[j];
                    unique[j] = tempWord;
                }
            }
        }

        for (int i = 0; i < size; i++)
            System.out.println(unique[i] + ": " + count[i]);
    }
}