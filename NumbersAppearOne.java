public class NumbersAppearOne {
    public static int numberappearone(int[] arr){
        int n=arr.length;

        int xorr = 0;
        for(int i=0;i<n;i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;

    }

    public static void main(String[] args) {
        int []arr={5,2,1,1,2,3,3};
        int ans=numberappearone(arr);
        System.out.println("The single Element is: " +ans);
    }
    
}
