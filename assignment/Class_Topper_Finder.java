// Source: 07_Data_Structures_Coding_Assignment
// Problem: Problem 1: Class Topper Finder

class Main {
    static int[] findTopper(int[][] marks) {
        int bestRow=0,best=-1;
        for(int i=0;i<marks.length;i++){
            int sum=0;for(int x:marks[i])sum+=x;
            if(sum>best){best=sum;bestRow=i;}
        }
        return new int[]{bestRow,best};
    }
}
