class LibraryMember {

    private String membershipPin;

    String branchCode;

    protected double finesOwed;

    public String displayName;
}


class AccessChecker {

    static String classifyAccess(
            String modifier,
            String context) {

        if (modifier.equals("private")) {

            if (context.equals("SAME_CLASS"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (modifier.equals("default")) {

            if (context.equals("SAME_CLASS") ||
                context.equals("SAME_PACKAGE"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (modifier.equals("protected")) {

            if (context.equals("SAME_CLASS") ||
                context.equals("SAME_PACKAGE"))
                return "ALLOWED";
            else
                return "DENIED";
        }

        if (modifier.equals("public"))
            return "ALLOWED";

        return "DENIED";
    }

    static String summarizeByModifier(
            String[][] attempts) {

        String[] modifiers = {
            "private",
            "default",
            "protected",
            "public"
        };

        String result = "";

        for (int i = 0;
             i < modifiers.length;
             i++) {

            int allowed = 0;
            int denied = 0;

            for (int j = 0;
                 j < attempts.length;
                 j++) {

                if (attempts[j][0]
                        .equals(modifiers[i])) {

                    String check =
                        classifyAccess(
                            attempts[j][0],
                            attempts[j][1]
                        );

                    if (check.equals("ALLOWED"))
                        allowed++;
                    else
                        denied++;
                }
            }

            result += modifiers[i] +
                    ": " + allowed +
                    " allowed / " +
                    denied + " denied";

            if (i < modifiers.length - 1)
                result += " | ";
        }

        return result;
    }
}