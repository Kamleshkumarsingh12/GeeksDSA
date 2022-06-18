package com.kamlesh.KunalLinearSearching;

public class MaxWealth {
    public static void main(String[] args) {
    int[][] arr = {{1,2,3},{3,2,1}};
    int result;
    result = wealth(arr);
        System.out.println(result);

    }

    static int wealth(int[][] arr)
    {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : arr) {

            //when u start a new column, take a rowsum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            //now we have sum of accounts of person
            //check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
