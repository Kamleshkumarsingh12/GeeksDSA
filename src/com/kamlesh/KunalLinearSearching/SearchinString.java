package com.kamlesh.KunalLinearSearching;

import java.util.Arrays;

/*
    to search a character in a given string
 */
public class SearchinString {
    public static void main(String[] args) {
    String name  = "kamlesh";      //the given string
    char target = 'l';          //character to search
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    //method to search in string; linear search
    static boolean search(String str, char target)
    {
        //checking if the string contains any character or not
        //this will call when string is empty
        if(str.length() == 0)
        {
            return false;
        }


        for (int i = 0; i < str.length(); i++)
        {
            //checking if the given character is there in string or not
            if(target ==str.charAt(i))
            {
                return true;
            }
        }
        //will call if the target char is not in the string
        return false;
    }


    //method to convert a string to an array and print it
    static boolean search2(String str, char target)
    {
        //checking if the string contains any character or not
        //this will call when string is empty
        if(str.length() == 0)
        {
            return false;
        }

// to print the string as an array by converting it to an array
        for (char ch : str.toCharArray())
        {
            //checking if the given character is there in string or not
            if(ch == target)
            {
                return true;
            }
        }
        //will call if the target char is not in the string
        return false;
    }
}
