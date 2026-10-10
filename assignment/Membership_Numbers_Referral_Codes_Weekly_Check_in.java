// Source: 01_Week6_Inheritance_Polymorphism_Assignment
// Problem: Problem 5: Membership Numbers, Referral Codes & Weekly Check-in

class GymMember {
    private static int count=2000;
    final String membershipNumber="GYM-"+(++count);
    int feesPaid;
    void payFee(int n){feesPaid+=n;}
    void payFee(int n,String mode){System.out.println(mode);payFee(n);}
    int getFeesPaid(){return feesPaid;}
    static int getMembersEnrolled(){return count-2000;}
    static boolean isValidReferralCode(String s){
        return s!=null && s.length()==4 && s.charAt(0)=='G'
            && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2))
            && Character.isUpperCase(s.charAt(3));
    }
}
class GroupClassMember extends GymMember { String name; GroupClassMember(String n){name=n;} }
class Main {
    static String processWeeklyCheckIn(GymMember[] a) {
        int processed=0, nulls=0, group=0;
        for(GymMember m:a) if(m==null)nulls++; else {processed++;if(m instanceof GroupClassMember)group++;}
        return processed+" processed | "+nulls+" null skipped | "+group+" group | "+(processed-group)+" individual";
    }
}
