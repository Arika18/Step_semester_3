// Source: 01_Week6_Inheritance_Polymorphism_Assignment
// Problem: Problem 4: Monthly Attendance Announcer

class GymMember {
    int sessions;
    String displayInfo(){return "Standard | Sessions: "+sessions;}
}
class PremiumMember extends GymMember {
    String trainer;
    PremiumMember(String t){trainer=t;}
    @Override String displayInfo(){return "Premium | Trainer: "+trainer+" | Sessions: "+sessions;}
}
class Main {
    static String batchPrint(GymMember[] a) {
        StringBuilder s=new StringBuilder();
        for(GymMember m:a) {
            s.append(m.displayInfo());
            if(m instanceof PremiumMember) s.append(" [Trainer via downcast: ").append(((PremiumMember)m).trainer).append("]");
            s.append(" | ");
        }
        return s.toString();
    }
}
