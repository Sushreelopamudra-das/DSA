package Binarysearch;

public class Upperbound {
     static int foundupperbound(int []arr,int x,int n){
        for(int i=0; i<n;i++){
            if(arr[i]>x){
                return i;
            }
        }
        return n;

    }
    public static void main(String[] args) {
        int [] arr ={3,5,8,9,15,19};
        int n=6, x=9;
        int ind = foundupperbound(arr,x,n);
        System.out.println("The upperbound is the index:" +ind);
    }
    
}
