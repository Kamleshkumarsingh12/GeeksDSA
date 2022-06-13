package com.kamlesh;

//linear searching algo inside array
public class SearchinginArray {
    public static void main(String[] args) {
        int[] arr = {20,15,35,63,42};
        int n = arr.length;
        int key = 42;
        int position = search(arr,n,key);

        if(position==-1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element is found at position: " +(position+1));

    }

    public static int search(int[] arr, int n, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }

        }
        return -1;
    }
}
