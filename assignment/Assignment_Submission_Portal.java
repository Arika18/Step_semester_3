// Source: 05_Week8_Coding_Assignment
// Problem: Question 2: Assignment Submission Portal

import java.time.LocalDate;
abstract class Assignment {
    String title; LocalDate due; int max;
    Assignment(String t,LocalDate d,int m){title=t;due=d;max=m;}
    abstract double penaltyPerDay();
    double finalMarks(int marks,LocalDate submitted){long days=Math.max(0,java.time.temporal.ChronoUnit.DAYS.between(due,submitted));return Math.max(0,marks*(1-days*penaltyPerDay()));}
}
class CodingAssignment extends Assignment {
    CodingAssignment(String t,LocalDate d,int m){super(t,d,m);}
    double penaltyPerDay(){return .10;}
}
class WrittenAssignment extends Assignment {
    WrittenAssignment(String t,LocalDate d,int m){super(t,d,m);}
    double penaltyPerDay(){return .20;}
}
class Submission {
    String student; Assignment assignment; LocalDate date; String status="Submitted";
    Submission(String s,Assignment a,LocalDate d){student=s;assignment=a;date=d;}
    double grade(int marks){
        if(!status.equals("Submitted"))throw new IllegalStateException("Already graded");
        status="Graded";return assignment.finalMarks(marks,date);
    }
    void resubmit(){if(status.equals("Graded"))throw new IllegalStateException("Cannot resubmit");}
}
