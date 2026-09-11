class AccessChecker {

    static String classifyAccess(String modifier, String context) {

        if (modifier.equals("public"))
            return "ALLOWED";

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
                context.equals("SAME_PACKAGE") ||
                context.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"))
                return "ALLOWED";

            else
                return "DENIED";
        }

        return "DENIED";
    }

    public static void main(String[] args) {

        System.out.println(
            classifyAccess(
                "protected",
                "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"
            )
        );

        System.out.println(
            classifyAccess(
                "protected",
                "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"
            )
        );
    }
}