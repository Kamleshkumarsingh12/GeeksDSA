package com.kamlesh.KunalLinearSearching;

public class SearchingRange {
    public static void main(String[] args) {

        int[] arr = {22,42,65,69,75};
        int target = 65;
        System.out.println(rangesearch(arr,target,1,3));
        //any element outside the range will give -1
    }

    //start = starting index value of the range
    //end = ending index value of the range
    static int rangesearch(int[] arr, int target,int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == target)
            {
                return i;
            }

        }
        return -1;
    }

}
