// Source: 08_Data_Structures_Practice_Coding_Questions
// Problem: Problem 4: Pair With Target Sum (Unsorted Array)

class Main {
    static boolean hasPair(int[] a,int target){
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]+a[j]==target)return true;
        return false;
    }
}
