package problemsolving.questions.extras.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 *
 * Using a linked hash set allows you to take care of the order of the elements.
 */
class UniqueElementsInArray {

    public int [] getUniqueElements(int [] arr) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
          if(!uniqueElements.contains(arr[i])) {
              uniqueElements.add(arr[i]);
          }
        }
        int [] uniqueArr = uniqueElements.stream().mapToInt(Integer::intValue).toArray();
        return uniqueArr;
    }
}

class Main {
    public static void main(String[] args) {
        UniqueElementsInArray uniqueElementsInArray = new UniqueElementsInArray();
        int [] sortedUniqueArr = uniqueElementsInArray.getUniqueElements(new int[] {
           12, 23, 33, 44, 55, 55, 66, 88
        });
        System.out.println(Arrays.toString(sortedUniqueArr));
    }
}
