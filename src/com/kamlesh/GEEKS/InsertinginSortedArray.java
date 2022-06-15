package com.kamlesh.GEEKS;

public class InsertinginSortedArray {
    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0]=56;
        arr[1]=75;
        arr[2]=42;
        arr[3]=63;
        arr[4]=86;
        arr[5]=47;
        int capacity = arr.length;
        int key = 65;
        int n = 6;

        n = Insertion(arr,n,key,capacity);

        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }

    //creating method for insertion
    static int Insertion(int[] arr, int n, int key, int capacity)
    {
        //checking if length of array is greater than or equal to its capacity, it wont take another element
        if(n>=capacity)
        {
            return n;
        }

        //decrementing from right: from (n-1) upto 0 and element which is greater than key value
        int i;
        for(i=n-1;(i>=0 && arr[i] > key);i--)
        {
            arr[i+1] = arr[i];
        }

        //declaring the position of the inserted element incremented by 1 wrt i
        arr[i+1] = key;
        return (n+1);       //returning the position of the inserted element: one above a given element which is smaller than key
    }
}
