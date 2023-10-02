package Algorithms.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = new int[] {9,3,6,2,5,4,0,3,1,11};
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length ;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
