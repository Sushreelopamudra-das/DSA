import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeArrayelementbysign {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-4,-5));
        ArrayList<Integer> ans = RearrangebySigh(A);


        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }  
     public static ArrayList<Integer> RearrangebySigh(ArrayList<Integer>A) {
        int n = A.size();

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));

        int posIndex = 0, negIndex = 1;
        for (int i =0;i<n;i++){

            if(A.get(i) < 0){
                ans.set(negIndex, A.get(i));
                negIndex +=2;
            }
            else{
                ans.set(posIndex, A.get(i));
                posIndex +=2;
            }
        }
        return ans;
     }
}
