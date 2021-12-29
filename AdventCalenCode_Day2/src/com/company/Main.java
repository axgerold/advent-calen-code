package com.company;

import java.io.File;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // initialize tool and file reader
        NavigationTool toolInstance = new NavigationTool();
        FileReadingClass fileReader = new FileReadingClass();

            String day = "2";

            // import example data
            File example_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\example_data.txt");
            List imported_example_list = fileReader.ImportFileSaveAsList(example_file);

            // import test case data
            File test_case_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\test_case_data.txt");
            List imported_test_case_list = fileReader.ImportFileSaveAsList(test_case_file);

        // Purpose: the purpose of this project is to determine the location of a submarine
            // forward = horizontal, x
            // down = adds to depth (increases value)
            // up = decreases depth (decreases value)

            // find example sub
                int[][] example_location = toolInstance.findSub(imported_example_list);
                int example_product = example_location[0][0] * example_location[0][1];
                System.out.print("Example product: " + example_product);

            // find test sub
            int[][] test_location = toolInstance.findSub(imported_test_case_list);
            int test_product = test_location[0][0] * test_location[0][1];
            System.out.print("\n Test product: " + test_product);

    }
}
