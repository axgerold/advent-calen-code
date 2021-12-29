package com.company;

import java.io.File;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // Part A: the purpose of this project is to measure the depth of the ocean floor to count how many times the depth increases.

            // initialize depth measuring tool and file reader
            DepthMeasurementClass depthMeasuringTool = new DepthMeasurementClass();
            FileReadingClass fileReader = new FileReadingClass();

            // import data
                String day = "1";

                File example_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\example_data.txt");
                List imported_example_list = fileReader.ImportFileSaveAsList(example_file);

                File test_case_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\test_case_data.txt");
                List imported_test_case_list = fileReader.ImportFileSaveAsList(test_case_file);

            // run depth measurement tool
                // example
                int example_count = depthMeasuringTool.countNumOfIncreasingDepth(imported_example_list);
                System.out.println("Count of example case: " + example_count);


                // test case
                int test_case_count = depthMeasuringTool.countNumOfIncreasingDepth(imported_test_case_list);
                System.out.println("Count of test case: " + test_case_count);


        // Part B: count the number of times the sliding window increases (i.e. sum of A[1,2,3] compared to sum of B[2,3,4])
            // run example list

                // run depth measurement tool
                int example_win_count = depthMeasuringTool.countNumOfIncreasingWindows(imported_example_list);
                System.out.println("Count of example window case: " + example_win_count);

            // run test case
                // run depth measurement tool
                int test_case_win_count = depthMeasuringTool.countNumOfIncreasingWindows(imported_test_case_list);
                System.out.println("Count of test window case: " + test_case_win_count);
    }
}
