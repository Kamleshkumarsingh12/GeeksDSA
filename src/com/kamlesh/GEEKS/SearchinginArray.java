package com.kamlesh.GEEKS;

//linear searching algo inside array
public class SearchinginArray {
    public static void main(String[] args) {
        int[] arr = {20,15,35,63,42};
        int n = arr.length;     //n = length of array
        int key = 42;           //key is the value we need to search in array
        int position = search(arr,n,key);       //calling the method

        if(position==-1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.println("Element is found at position: " +(position+1));

    }

    //creating a method to search an element in array
    public static int search(int[] arr, int n, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            //iterating to determine the array element at index i is key element
            if(arr[i] == key)
            {
                return i;
            }

        }
        //if the key is not found
        return -1;
    }
}
