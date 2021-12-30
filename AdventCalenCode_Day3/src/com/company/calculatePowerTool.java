package com.company;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

import static java.lang.Integer.parseInt;

public class calculatePowerTool {

    public static int calculatePowerConsumption(List input_list) {

        // initialize vars

        int entry_line_i = 0; // iterate entry lines
        int digit_j = 0; // iterate number of digits in binary
        ArrayList gamma_binary_arraylist = new ArrayList<String>();
        ArrayList epsilon_binary_arraylist = new ArrayList<String>();
        int power_consumption;

        // determine number of units in single binary line

        String first_line = (String) input_list.get(0);
        int num_digits_in_line = first_line.length();
        int num_of_entries = input_list.size();

        // determine most/least common bytes per digit

        while (digit_j < num_digits_in_line) {

            // count number of occurrences of each bit type (0 or 1) in single digit space

            int count_0 = 0;
            int count_1 = 0;
            entry_line_i = 0;

            while (entry_line_i < num_of_entries) {
                // get entry line

                String binary_line = (String) input_list.get(entry_line_i);
                char digit = binary_line.charAt(digit_j);

                // count number of occurrences of digit


                if (digit == '0') {
                    count_0++;
                } else if (digit == '1') {
                    count_1++;
                } else {
                    System.out.println("Error.");
                }

                entry_line_i++;
            }

            // form gamma and epsilon arrays

            if (count_0 > count_1) {
                gamma_binary_arraylist.add("0");
                epsilon_binary_arraylist.add("1");
            } else if (count_1 > count_0) {
                gamma_binary_arraylist.add("1");
                epsilon_binary_arraylist.add("0");
            }

            digit_j++;

        }

        // convert binary to decimal

            String gamma_string = String.join("",gamma_binary_arraylist);
            String epsilon_string = String.join("",epsilon_binary_arraylist);

            int gamma = Integer.parseInt(gamma_string,2);
            int epsilon = Integer.parseInt(epsilon_string, 2);


        // calculate power consumption (= gamma * epsilon)

        power_consumption = gamma * epsilon;

        return power_consumption;
    }
}
