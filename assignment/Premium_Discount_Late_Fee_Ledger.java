// Source: 01_Week6_Inheritance_Polymorphism_Assignment
// Problem: Problem 3: Premium Discount & Late-Fee Ledger

import java.util.Arrays;
class GymMember {
    private int[] fees = new int[10]; private int count;
    protected void chargeLateFee(int amount) { fees[count++]=amount; }
    int[] getLateFeeHistory() { return Arrays.copyOf(fees,count); }
    int getTotalLateFees() { int s=0; for(int i=0;i<count;i++) s+=fees[i]; return s; }
}
class PremiumMember extends GymMember {
    @Override protected void chargeLateFee(int amount) { super.chargeLateFee(amount/2); }
}
