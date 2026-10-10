// Source: 02_Week6_Inheritance_Polymorphism_Practice
// Problem: Problem 5: Membership Numbers, Renewal Codes & Night Audit

class LibraryMember {
    private static int count=100; final String memberNumber="LIB-"+(++count);
    int borrowed; void borrowBook(){borrowed++;}
    void borrowBook(String genre){System.out.println(genre);borrowBook();}
    int getBooksBorrowed(){return borrowed;}
    static int getMembersEnrolled(){return count-100;}
    static boolean isValidRenewalCode(String s){
        return s!=null&&s.length()==4&&s.charAt(0)=='R'
            &&Character.isDigit(s.charAt(1))&&Character.isDigit(s.charAt(2))
            &&Character.isUpperCase(s.charAt(3));
    }
}
class FacultyMember extends LibraryMember { String dept; FacultyMember(String d){dept=d;} }
class Main {
    static String processNightlyAudit(LibraryMember[] a){
        int done=0,nulls=0,faculty=0;
        for(LibraryMember m:a)if(m==null)nulls++;else{done++;if(m instanceof FacultyMember)faculty++;}
        return done+" processed | "+nulls+" null skipped | "+faculty+" faculty | "+(done-faculty)+" regular";
    }
}
