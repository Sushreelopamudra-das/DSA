public class Maximumandminimum {
    public static int setmini(int[]A, int N){
        int mini = Integer . MAX_VALUE;
        for(int i =0;i<N;i++){
            if(A[i] < mini){
                mini = A[i];
            }
        }
        return mini;

    }
    public static int setmaxi(int[]A, int N){
        int maxi = Integer . MIN_VALUE;
        for(int i =0;i<N;i++){
            if(A[i] > maxi){
                maxi = A[i];
            }
        }
        return maxi;
    
    }

public static void main(String[] args) {
    int[] A = {1,2,3,4,5,6,7,8,9,10};
    int N = A.length;
    System.out.println("Minimum element is: "
    + setmini(A, N));
System.out.println("Maximum element is: "
    + setmaxi(A, N));
}
}
 
