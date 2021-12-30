package com.company;

import java.io.File;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // initialize tool and file reader
        calculatePowerTool calculatePowerToolInstance = new calculatePowerTool();
        FileReadingClass fileReader = new FileReadingClass();

            String day = "3";

            // import example data
            File example_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\example_data.txt");
            List imported_example_list = fileReader.ImportFileSaveAsList(example_file);

            // import test case data
            File test_case_file = new File("C:\\Users\\aimee_gerold\\OneDrive - Edwards Lifesciences\\Documents\\GitHub\\advent-calen-code\\AdventCalenCode_Day" + day + "\\src\\test_case_data.txt");
            List imported_test_case_list = fileReader.ImportFileSaveAsList(test_case_file);

        // Part A: the purpose of this project is to find the power consumption
            // gamma: the most common bit (0 or 1) in each space is the corresponding bit
            // epsilon: the least common bit (converse)

            int example_power_consumption = calculatePowerToolInstance.calculatePowerConsumption(imported_example_list);
            System.out.println("Example power consumption: " + example_power_consumption);

            int test_case_power_consumption = calculatePowerToolInstance.calculatePowerConsumption(imported_test_case_list);
            System.out.print("Test case power consumption: " + test_case_power_consumption);

    }
}
