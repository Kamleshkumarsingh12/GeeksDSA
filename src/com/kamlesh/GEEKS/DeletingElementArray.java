package com.kamlesh.GEEKS;

public class DeletingElementArray {
//    public static void main(String[] args) {
//        int[] arr = {22,25,42,63,24};
//        int n = arr.length;
//        int key = 42;
//        n = deleteelement(arr,n,key);
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]+ " ");
//        }
//    }
//
//    static int search(int[] arr,int n,int key)
//    {
//        for(int i = 0;i< n;i++)
//        {
//            if(arr[i] == key);
//            return i;
//        }
//        return -1;
//    }
//
//    static int deleteelement(int[] arr,int n, int key)
//    {
//        int pos = search(arr,n,key);
//
//            if(pos == -1)
//            {
//                System.out.println("Element not found");
//                return n;
//            }
//
//        for(int i = pos;i<n-1;i++)
//            arr[i] = arr[i+1];
//
//        return n-1;
//    }


    static int findElement(int[] arr, int n, int key) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }

    // Function to delete an element
    static int deleteElement(int[] arr, int n, int key) {
        // Find position of element to be
        // deleted
        int pos = findElement(arr, n, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        return n - 1;
    }

    // Driver Code
    public static void main(String[] args) {
        int i;
        int[] arr = {22,25,42,63,24};

        int n = arr.length;
        int key = 63;

        System.out.println("Array before deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = deleteElement(arr, n, key);

        System.out.println("\n\nArray after deletion");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}