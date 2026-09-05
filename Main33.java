public class Main33 {

    static void findLongestStreak(String signal) {

        int longest = 1;
        int current = 1;
        char answer = signal.charAt(0);

        for (int i = 1; i < signal.length(); i++) {

            if (signal.charAt(i) == signal.charAt(i - 1)) {
                current++;
            } else {
                current = 1;
            }

            if (current > longest) {
                longest = current;
                answer = signal.charAt(i);
            }
        }

        System.out.println(
            "Longest Streak: '" + answer +
            "' repeated " + longest + " times"
        );
    }

    public static void main(String[] args) {

        findLongestStreak("RRGGGYRR");
    }
}