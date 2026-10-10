// Source: 03_Week7_Abstraction_Interface_Assignment
// Problem: Problem 4: Digital Classroom Setup

abstract class ClassroomDevice { abstract String operate(); }
interface Chargeable { String charge(); String charge(int minutes); }
class Tablet extends ClassroomDevice implements Chargeable {
    String tag; Tablet(String t){tag=t;}
    String operate(){return "Tablet "+tag+" displaying lesson";}
    public String charge(){return tag+" charging";}
    public String charge(int m){return tag+" charging for "+m+" minutes";}
}
