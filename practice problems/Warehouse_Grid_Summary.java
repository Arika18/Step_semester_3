// Source: 08_Data_Structures_Practice_Coding_Questions
// Problem: Problem 2: Warehouse Grid Summary

class Main {
    static int[] warehouseSummary(int[][] g){
        int total=0,max=-1,row=0,col=0;
        for(int i=0;i<g.length;i++)for(int j=0;j<g[i].length;j++){
            total+=g[i][j];
            if(g[i][j]>max){max=g[i][j];row=i;col=j;}
        }
        return new int[]{total,row,col};
    }
}
