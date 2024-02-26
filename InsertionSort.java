public class InsertionSort {
     static void insertionsort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;

                j--;
            }

        }

    }






    public static void main(String[] args) {
        int [] arr={14,9,15,12,6,8,3};
        int j;
        for(j=0;j<=arr.length;j++){
            insertionsort(arr);
            for(j=0;j<arr.length;j++){
                System.out.println(arr[j]+"");
            }
        }
        
    }
}