// Source: 02_Week6_Inheritance_Polymorphism_Practice
// Problem: Problem 2: Three Branches of Membership

class LibraryMember {
    int borrowed; String id;
    LibraryMember(String i,int l){id=i;}
    int getBooksBorrowed(){return borrowed;}
    String displayInfo(){return "General Member | Books Borrowed: "+borrowed;}
}
class StudentMember extends LibraryMember {
    String course; StudentMember(String i,int l,String c){super(i,l);course=c;}
    @Override String displayInfo(){return "Student Member | Course: "+course+" | Books Borrowed: "+borrowed;}
}
class HonorsStudentMember extends StudentMember {
    int bonus; HonorsStudentMember(String i,int l,String c,int b){super(i,l,c);bonus=b;}
    @Override String displayInfo(){return "Honors Student Member | Course: "+course+" | Bonus Limit: "+bonus+" | Books Borrowed: "+borrowed;}
}
class FacultyMember extends LibraryMember {
    String department; FacultyMember(String i,int l,String d){super(i,l);department=d;}
    @Override String displayInfo(){return "Faculty Member | Department: "+department+" | Books Borrowed: "+borrowed;}
}
class Main {
    static String classifyGeneration(LibraryMember m){
        if(m instanceof HonorsStudentMember)return "Multilevel descendant (3 generations deep)";
        if(m instanceof FacultyMember)return "Hierarchical sibling (independent branch)";
        return "Base or direct subclass";
    }
    static int getTotalBooksBorrowed(LibraryMember[] a){
        int s=0;for(LibraryMember m:a)s+=m.getBooksBorrowed();return s;
    }
}
