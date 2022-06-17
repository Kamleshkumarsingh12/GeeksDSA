package com.kamlesh.KunalLinearSearching;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {24,42,-6,56,32,45};
        System.out.println(min(arr));
    }

    //method to give minimum number
    static int min(int[] arr)
    {
        int min = arr[0];       //taking first element as minimum

        for (int i = 1; i <arr.length ; i++) {
            //conditioning if an element is smaller than first element, we keep iterating to print it
            if(arr[i]< min)
            {
                return arr[i];
            }
        }
        return min;
    }
}
