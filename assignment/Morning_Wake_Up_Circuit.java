// Source: 03_Week7_Abstraction_Interface_Assignment
// Problem: Problem 1: Morning Wake-Up Circuit

interface Ringable { String ring(); }
class AlarmClock implements Ringable {
    String time; AlarmClock(String t){time=t;}
    public String ring(){return "Alarm ringing for "+time;}
}
class Doorbell implements Ringable {
    String location; Doorbell(String l){location=l;}
    public String ring(){return "Doorbell ringing at "+location;}
}
class Main {
    static void ringAll(Ringable[] a){for(Ringable x:a)System.out.println(x.ring());}
}
