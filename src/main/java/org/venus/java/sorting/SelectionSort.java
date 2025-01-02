package sorting;
import java.util.*;

/**
    In computer science, selection sort is an in-place comparison sorting algorithm. 
    It has a O(n2) time complexity, which makes it inefficient on large lists, 
    and generally performs worse than the similar insertion sort. 
    Selection sort is noted for its simplicity and has performance advantages over 
    more complicated algorithms in certain situations, particularly where 
    auxiliary memory is limited.
*/

public class SelectionSort {

    public List<Integer> sort(List<Integer> input) {
        
        int inputSize = input.size();

        for(int i=0; i < inputSize - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < inputSize; j++) {
                if(input.get(j) < input.get(minIndex))
                    minIndex = j;
            }

            if (minIndex != i) {
                int temp = input.get(i);
                input.set(i, input.get(minIndex));
                input.set(minIndex, temp);
            }

        }

        return input;
    }
}
