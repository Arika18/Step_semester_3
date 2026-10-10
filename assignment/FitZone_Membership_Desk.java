// Source: 05_Week8_Coding_Assignment
// Problem: Question 4: FitZone Membership Desk

interface MembershipPlan { int months(); double discount(); }
class Monthly implements MembershipPlan { public int months(){return 1;} public double discount(){return 0;} }
class Quarterly implements MembershipPlan { public int months(){return 3;} public double discount(){return .10;} }
class Annual implements MembershipPlan { public int months(){return 12;} public double discount(){return .25;} }
class Membership {
    String member,status="Active"; double fee;
    Membership(String m,MembershipPlan p){member=m;fee=1000*p.months()*(1-p.discount());}
    void checkIn(){System.out.println(status.equals("Active")?"Checked in":"Check-in denied: "+status);}
    void freeze(){if(status.equals("Active"))status="Frozen";}
    void unfreeze(){if(status.equals("Frozen"))status="Active";}
    void expire(){status="Expired";}
}
