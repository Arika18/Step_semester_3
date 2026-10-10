// Source: 02_Week6_Inheritance_Polymorphism_Practice
// Problem: Problem 4: Weekly Circulation Report

class LibraryMember {
    int borrowed;
    String displayInfo(){return "General | Books: "+borrowed;}
}
class StudentMember extends LibraryMember {
    String course; StudentMember(String c){course=c;}
    @Override String displayInfo(){return "Student | Course: "+course+" | Books: "+borrowed;}
}
class Main {
    static String batchPrint(LibraryMember[] a){
        StringBuilder s=new StringBuilder();
        for(LibraryMember m:a){
            s.append(m.displayInfo());
            if(m instanceof StudentMember)s.append(" [Course via downcast: ").append(((StudentMember)m).course).append("]");
            s.append(" | ");
        }
        return s.toString();
    }
}
