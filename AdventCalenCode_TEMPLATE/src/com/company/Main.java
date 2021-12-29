package com.company;

import java.io.File;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // initialize tool and file reader
        Tool toolInstance = new Tool();
        FileReadingClass fileReader = new FileReadingClass();

            String day = "";

            // import example data
            File example_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\example_data.txt");
            List imported_example_list = fileReader.ImportFileSaveAsList(example_file);

            // import test case data
            File test_case_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\test_case_data.txt");
            List imported_test_case_list = fileReader.ImportFileSaveAsList(test_case_file);

        // Part A: the purpose of this project is to measure the depth of the ocean floor to count how many times the depth increases.



    }
}
