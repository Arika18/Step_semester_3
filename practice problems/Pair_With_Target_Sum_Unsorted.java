// Source: 08_Data_Structures_Practice_Coding_Questions
// Problem: Problem 3: Pair With Target Sum (Unsorted)

import java.util.*;

class Main {
    static boolean hasPairWithSum(int[] a,int target){
        Set<Integer> seen=new HashSet<>();
        for(int x:a){if(seen.contains(target-x))return true;seen.add(x);}
        return false;
    }
}
