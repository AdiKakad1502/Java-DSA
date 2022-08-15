import java.util.*;
public class FirstRecurringElement {
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
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i = 0; i < n; i++) {
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],1);
                }
                else{
                    map.put(arr[i],map.get(arr[i])+1);
                }

                if(map.get(arr[i]) > 1){
                    System.out.println(arr[i]);
                    break;
                }
            }

    }
}
