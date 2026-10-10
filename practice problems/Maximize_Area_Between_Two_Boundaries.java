// Source: 08_Data_Structures_Practice_Coding_Questions
// Problem: Problem 5: Maximize Area Between Two Boundaries

class Main {
    static int maxContainerArea(int[] h){
        int l=0,r=h.length-1,best=0;
        while(l<r){
            best=Math.max(best,Math.min(h[l],h[r])*(r-l));
            if(h[l]<h[r])l++;else r--;
        }
        return best;
    }
}
