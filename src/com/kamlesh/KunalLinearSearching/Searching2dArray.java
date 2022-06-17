package com.kamlesh.KunalLinearSearching;

import java.util.Arrays;

public class Searching2dArray {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1}, {18, 12, 56, 75}, {65, 43, 69, 22, 46}, {18, 21, 45, 42}};
        int target = 42;
        //creating a new 1d array to store the valueof ,
        //row and column of the target element
        int[] ans = search(arr, target);    //calling the method inside the new array
        System.out.println(Arrays.toString(ans));   //printing the new array
    }

    //creating a search method for 2d array with 1d array reference
    static int[] search(int[][] arr, int target)
    {
        for (int r = 0; r < arr.length; r++)
        {
            for (int c = 0; c < arr[r].length; c++)
            {
                if(arr[r][c] == target)
                {
                    return new int[]{r,c};     //calling the newly 1d array and storing the 2d array's element range inside it
                }
            }
        }
       return new int[]{-1,-1};
    }
}
