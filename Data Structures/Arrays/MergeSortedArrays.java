import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] merged = new int[m + n];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }
}