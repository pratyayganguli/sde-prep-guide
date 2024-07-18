package problemsolving.extras.strings;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * In this class we will focus on extracting the suffixes of String.
 * Let's say we have string input "abcdef"
 *
 * So, the suffixes would be something like,
 *
 * abcdef
 * bcdef
 * cdef
 * def
 * ef
 * f
 *
 * After doing that we will put emphasis on sorting the array lexicographically. Lexical sorting is like dictionary
 * based sorting
 *
 */

public class StringSuffix {
    public static void main(String[] args) {
        String input = "abcdef";
        char[] inputArr = input.toCharArray();

        List<String> suffixArr = new ArrayList<>();

        for (int i = 0; i < inputArr.length ; i++) {
            suffixArr.add(input.substring(i, inputArr.length));
        }

        System.out.println(suffixArr);
    }
}
