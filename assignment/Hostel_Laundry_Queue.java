// Source: 05_Week8_Coding_Assignment
// Problem: Question 1: Hostel Laundry Queue

interface WashType { int minutes(); double charge(); String name(); }
class Quick implements WashType { public int minutes(){return 30;} public double charge(){return 20;} public String name(){return "Quick";} }
class Normal implements WashType { public int minutes(){return 45;} public double charge(){return 30;} public String name(){return "Normal";} }
class Heavy implements WashType { public int minutes(){return 60;} public double charge(){return 45;} public String name(){return "Heavy";} }
class WashingMachine {
    String id; boolean busy;
    WashingMachine(String id){this.id=id;}
    void start(String student,WashType w){
        if(busy){System.out.println(id+" is currently busy");return;}
        busy=true;System.out.println(w.name()+" wash started on "+id+" for "+student+" ("+w.minutes()+" min). Charge: ₹"+w.charge());
    }
    void complete(){busy=false;System.out.println(id+" cycle completed. "+id+" is now free.");}
}
