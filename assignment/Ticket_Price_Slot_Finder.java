// Source: 07_Data_Structures_Coding_Assignment
// Problem: Problem 5: Ticket Price Slot Finder

class Main {
    static int findSlot(int[] a,int target){
        int l=0,r=a.length;
        while(l<r){
            int m=(l+r)/2;
            if(a[m]<target)l=m+1;else r=m;
        }
        return l;
    }
}
