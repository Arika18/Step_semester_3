class AccessChecker {

    static String classifyAccess(
            String modifier,
            String context) {

        if (modifier.equals("public"))
            return "ALLOWED";

        if (modifier.equals("private")) {

            if (context.equals("SAME_CLASS"))
                return "ALLOWED";

            return "DENIED";
        }

        if (modifier.equals("default")) {

            if (context.equals("SAME_CLASS") ||
                context.equals("SAME_PACKAGE"))
                return "ALLOWED";

            return "DENIED";
        }

        if (modifier.equals("protected")) {

            if (context.equals("SAME_CLASS") ||
                context.equals("SAME_PACKAGE") ||
                context.equals(
                "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"))
                return "ALLOWED";

            return "DENIED";
        }

        return "DENIED";
    }


    static String firstDeniedAttempt(
            String[][] attempts) {

        for (int i = 0;
             i < attempts.length;
             i++) {

            String result =
                classifyAccess(
                    attempts[i][0],
                    attempts[i][1]
                );

            if (result.equals("DENIED")) {

                return attempts[i][0] +
                    " via " +
                    attempts[i][1] +
                    " (attempt #" +
                    (i + 1) + ")";
            }
        }

        return "None Denied";
    }


    public static void main(String[] args) {

        String[][] attempts = {

            {"public",
            "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},

            {"protected",
            "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},

            {"protected",
            "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"}
        };

        System.out.println(
            firstDeniedAttempt(attempts)
        );
    }
}