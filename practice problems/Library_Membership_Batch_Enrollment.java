// Source: 02_Week6_Inheritance_Polymorphism_Practice
// Problem: Problem 1: Library Membership & Batch Enrollment

class LibraryMember {
    String id; int limit, borrowed;
    LibraryMember(String id,int limit){
        if(id==null||id.trim().length()<4||limit<=0)throw new IllegalArgumentException();
        this.id=id;this.limit=limit;
    }
    void borrowBook(){if(borrowed<limit)borrowed++;}
    int getBooksBorrowed(){return borrowed;}
}
class StudentMember extends LibraryMember {
    String course;
    StudentMember(String i,int l,String c){super(i,l);course=c;}
}
class Main {
    static String enrollBatch(String[] ids,int limit){
        int ok=0,bad=0;
        for(String id:ids)try{new LibraryMember(id,limit);ok++;}catch(IllegalArgumentException e){bad++;}
        return "Enrolled: "+ok+" | Rejected: "+bad;
    }
}
