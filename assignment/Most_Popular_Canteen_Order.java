// Source: 07_Data_Structures_Coding_Assignment
// Problem: Problem 3: Most Popular Canteen Order

import java.util.*;

class Main {
    static String mostPopular(String[] orders){
        Map<String,Integer> count=new HashMap<>();
        for(String s:orders)count.put(s,count.getOrDefault(s,0)+1);
        String best=orders[0];
        for(String s:orders)if(count.get(s)>count.get(best))best=s;
        return best+" "+count.get(best);
    }
}
