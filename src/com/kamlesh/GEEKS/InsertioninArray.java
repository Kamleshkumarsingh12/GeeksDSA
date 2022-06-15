package com.kamlesh.GEEKS;

public class InsertioninArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 22;
        arr[1] = 42;
        arr[2] = 24;
        arr[3] = 43;
        arr[4] = 62;
        int n = 5;
        int capacity = 20;
        int i,key = 28;

        System.out.print("Before insertion in array: ");
        for( i = 0; i<n;i++)
        {
            System.out.println(arr[i]+ " ");
        }
        n = insert(arr,n,key,capacity);

        System.out.println("After insertion in array: ");
        for ( i = 0; i < n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    static int insert(int[] arr,int n,int key,int capacity)
    {
        if (n >= capacity)
        {
            return n;
        }
        else
        {
            arr[n] = key;
            return n+1;
        }


    }
}
