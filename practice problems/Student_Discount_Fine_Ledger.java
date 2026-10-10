// Source: 02_Week6_Inheritance_Polymorphism_Practice
// Problem: Problem 3: Student Discount & Fine Ledger

import java.util.Arrays;
class LibraryMember {
    private int[] history=new int[10]; private int count;
    protected void chargeFine(int n){history[count++]=n;}
    int[] getFineHistory(){return Arrays.copyOf(history,count);}
    int getTotalFine(){int s=0;for(int i=0;i<count;i++)s+=history[i];return s;}
}
class StudentMember extends LibraryMember {
    @Override protected void chargeFine(int n){super.chargeFine(n/2);}
}
