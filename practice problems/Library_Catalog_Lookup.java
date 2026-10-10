// Source: 08_Data_Structures_Practice_Coding_Questions
// Problem: Problem 1: Library Catalog Lookup

class Main {
    static String findBook(String[] isbn,String[] title,String target){
        int l=0,r=isbn.length-1;
        while(l<=r){
            int m=(l+r)/2,cmp=isbn[m].compareTo(target);
            if(cmp==0)return title[m];
            if(cmp<0)l=m+1;else r=m-1;
        }
        return "Not Found";
    }
}
