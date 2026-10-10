// Source: 07_Data_Structures_Coding_Assignment
// Problem: Problem 2: Merging Two Token Queues

class Main {
    static int[] mergeTokens(int[] a,int[] b){
        int[] c=new int[a.length+b.length];int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)c[k++]=a[i]<=b[j]?a[i++]:b[j++];
        while(i<a.length)c[k++]=a[i++];
        while(j<b.length)c[k++]=b[j++];
        return c;
    }
}
