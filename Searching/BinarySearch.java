package Searching;
import java.util.*;
public class BinarySearch {
    //Only in a sorted array
    public static void main(String[] args){
        int[] arr = new int[]{3,4,5,6,7,9,12,16,17,19,23};
        int key = 13;
        int target = 12;
        int low = 0;
        boolean ck = false;
        int high = arr.length-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==target){
                ck = true;
                System.out.println("Found at index "+mid);
                break;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        if(!ck){
            System.out.println("Not Found");
        }
    }
}
