// Source: 01_Week6_Inheritance_Polymorphism_Assignment
// Problem: Problem 2: Three Tiers of Gym Membership

class GymMember {
    String id; int fee, sessions;
    GymMember(String id, int fee) { this.id=id; this.fee=fee; }
    int getSessionsAttended() { return sessions; }
    String displayInfo() { return "Standard Member | Sessions: " + sessions; }
}
class PremiumMember extends GymMember {
    String trainer;
    PremiumMember(String i,int f,String t){super(i,f);trainer=t;}
    @Override String displayInfo(){return "Premium Member | Trainer: "+trainer+" | Sessions: "+sessions;}
}
class EliteMember extends PremiumMember {
    String locker;
    EliteMember(String i,int f,String t,String l){super(i,f,t);locker=l;}
    @Override String displayInfo(){return "Elite Member | Trainer: "+trainer+" | Locker: "+locker+" | Sessions: "+sessions;}
}
class GroupClassMember extends GymMember {
    String className;
    GroupClassMember(String i,int f,String c){super(i,f);className=c;}
    @Override String displayInfo(){return "Group Class Member | Class: "+className+" | Sessions: "+sessions;}
}
class Main {
    static String classifyGeneration(GymMember m) {
        if (m instanceof EliteMember) return "Multilevel descendant (3 generations deep)";
        if (m instanceof GroupClassMember) return "Hierarchical sibling (independent branch)";
        return "Base or direct subclass";
    }
    static int getTotalSessionsAttended(GymMember[] a) {
        int sum=0; for (GymMember m:a) sum+=m.getSessionsAttended(); return sum;
    }
}
