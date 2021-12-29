package com.company;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class DepthMeasurementClass {

    public static int countNumOfIncreasingDepth(List input_list) {

        // initialize counter
        int count = 0;

        // iterate through array
        for (int i = 0; i < input_list.size() - 1; i++) {
            if (parseInt((String) input_list.get(i+1)) > parseInt((String) (input_list.get(i)))) {
                // list contains Objects of type String, must use Integer.parseInt to convert to integer values and compare values
                // if n+1 value is greater than n value, count increases
                count++;
            }
        }

        return count;
    }

    public static int countNumOfIncreasingWindows(List input_list) {

        // initialize counter
        int count = 0;
        int i = 0;

        // iterate through array
        while ((i+3) < input_list.size()) {
            // initialize data points

            String elem_1 = (String) input_list.get(i);
            String elem_2 = (String) input_list.get(i+1);
            String elem_3 = (String) input_list.get(i+2);
            String elem_4 = (String) input_list.get(i+3);

            // initialize window lists A[1,2,3] and B[2,3,4]
            List win_A = Arrays.asList(elem_1, elem_2, elem_3);
            List win_B = Arrays.asList(elem_2, elem_3, elem_4);

            // sum window lists

            int sum_win_A = parseInt((String) win_A.get(0)) + parseInt((String) win_A.get(1)) + parseInt((String) win_A.get(2));
            int sum_win_B = parseInt((String) win_B.get(0)) + parseInt((String) win_B.get(1)) + parseInt((String) win_B.get(2));

            if (sum_win_B > sum_win_A) {
                // list contains Objects of type String, must use Integer.parseInt to convert to integer values and compare values
                // if n+1 value is greater than n value, count increases
                count++;
            }

            i++;
        }

        return count;
    }
}
