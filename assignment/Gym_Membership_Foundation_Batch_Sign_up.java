// Source: 01_Week6_Inheritance_Polymorphism_Assignment
// Problem: Problem 1: Gym Membership Foundation & Batch Sign-up

class GymMember {
    String memberId; int monthlyFee, sessions;
    GymMember(String id, int fee) {
        if (id == null || id.trim().length() < 4 || fee <= 0)
            throw new IllegalArgumentException();
        memberId = id; monthlyFee = fee;
    }
    void attendSession() { sessions++; }
    int getSessionsAttended() { return sessions; }
}
class PremiumMember extends GymMember {
    String trainerName;
    PremiumMember(String id, int fee, String trainer) {
        super(id, fee); trainerName = trainer;
    }
}
class Main {
    static String signUpBatch(String[] ids, int fee) {
        int ok = 0, bad = 0;
        for (String id : ids)
            try { new GymMember(id, fee); ok++; }
            catch (IllegalArgumentException e) { bad++; }
        return "Signed Up: " + ok + " | Rejected: " + bad;
    }
}
