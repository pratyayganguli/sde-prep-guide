package problemsolving.leetcode.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
//        String [] inputs = new String[] {
//                "Rose",
//                "Rosy",
//                "Rosel"
//        };

//        String [] inputs = new String [] {
//                "Alex", "Alec", "Alessia"
//        };

        String [] inputs = new String[] {
                "Sam", "Uncle", "Res"
        };


        char [] initialPrefix = inputs[0].toCharArray();
        String result = getLongestPrefix(initialPrefix, inputs);
        System.out.println(result);
    }

    private static String getLongestPrefix(char[] initialPrefix, String ... inputs) {
        int minLength = getMinLength(initialPrefix, inputs);

        if(minLength != 0) {
            return String.valueOf(initialPrefix).substring(0, minLength);
        }
        return "";
    }

    private static int getMinLength(char [] initialPrefix, String ... inputs) {
        int minLength = 0;
        int count = 0;

        for (int i = 1; i < inputs.length ; i++) {

            char [] inputCharArr = inputs[i].toCharArray();
            for (int j = 0; j < initialPrefix.length ; j++) {
                if(j < inputCharArr.length) {
                    if(inputCharArr[j] == initialPrefix[j]) {
                        count ++;
                    } else {
                        break;
                    }
                }
            }
            if(i == 1) {
                minLength = count;
            }
            minLength = Math.min(minLength, count);
            count = 0;
        }
        return minLength;
    }
}
