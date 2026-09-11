class SrmStudent {

    static String collegeName;
    static String academicYear;

    String name;

    static {

        collegeName = "SRM";
        academicYear = "2026-27";

        System.out.println("College info loaded");
    }

    SrmStudent(String name) {

        this.name = name;
    }
}

public class stu {

    public static void main(String[] args) {

        String[] names = {
            "Ravi",
            "Meera",
            "Karthik",
            "Divya",
            "Anitha"
        };

        for (String name : names) {

            SrmStudent s = new SrmStudent(name);

            System.out.println(
                "Student record created: " + s.name
            );
        }
    }
}