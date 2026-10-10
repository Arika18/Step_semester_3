// Source: 07_Data_Structures_Coding_Assignment
// Problem: Problem 4: Hot Weather Alert Windows

class Main {
    static int countAlerts(int[] a,int k,int threshold){
        int sum=0,count=0;
        for(int i=0;i<k;i++)sum+=a[i];
        if(sum>=k*threshold)count++;
        for(int i=k;i<a.length;i++){
            sum+=a[i]-a[i-k];
            if(sum>=k*threshold)count++;
        }
        return count;
    }
}
