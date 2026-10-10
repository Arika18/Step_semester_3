// Source: 05_Week8_Coding_Assignment
// Problem: Question 5: Campus Notice Broadcaster

import java.util.*;
interface NotificationChannel { void send(String student,String title); }
class EmailChannel implements NotificationChannel { public void send(String s,String t){System.out.println("[Email → "+s+"] "+t);} }
class SmsChannel implements NotificationChannel { public void send(String s,String t){System.out.println("[SMS → "+s+"] "+t);} }
class AppChannel implements NotificationChannel { public void send(String s,String t){System.out.println("[App → "+s+"] "+t);} }
class Student {
    String name,dept; List<NotificationChannel> channels;
    Student(String n,String d,List<NotificationChannel> c){name=n;dept=d;channels=c;}
}
class Notice {
    String title; Set<String> departments;
    Notice(String t,Set<String> d){if(t==null||t.trim().isEmpty()||d==null||d.isEmpty())throw new IllegalArgumentException();title=t;departments=d;}
}
class NoticeBoard {
    void post(Notice n,List<Student> students){
        for(Student s:students)if(n.departments.contains(s.dept))for(NotificationChannel c:s.channels)c.send(s.name,n.title);
    }
}
