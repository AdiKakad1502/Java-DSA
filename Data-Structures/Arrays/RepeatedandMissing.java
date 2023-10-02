import java.util.*;
public class RepeatedandMissing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array of elements: ");
        int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
        sc.close();

        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            
        }
    }
}
