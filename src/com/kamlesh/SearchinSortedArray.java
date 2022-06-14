package com.kamlesh;

/*
    IN SORTED ARRAY, WE PERFORM BINARY SEARCH
 */
public class SearchinSortedArray {
    public static void main(String[] args) {
        int[] arr = {22,42,63,69,72};
        int low = 0;        //lower index of array
        int high = 4;       //uppr index of array
        int key = 69;       //element or key to find
        int pos = binarysearch(arr,low,high,key);
        System.out.println(pos+ " ");
    }

    //creating a method for binary searching
    static int binarysearch(int[] arr, int low, int high, int key)
    {
        int mid = (low + high)/2;       //finding the mid value of the array so searching will be easier

        //if key is at mid index we return the mid index value
        if(key == arr[mid])
            return mid;

        //if key is ahead if mid index, we just increment lower index by mid+1,thus making searching algo shorter
        if(key>arr[mid])
            return binarysearch(arr,mid+1,high,key);
        else
            return binarysearch(arr,low,mid-1,key);
        //if key is below the mid index, we just decrement the higher index by mid-1 thus making searching algo shorter
    }
}
